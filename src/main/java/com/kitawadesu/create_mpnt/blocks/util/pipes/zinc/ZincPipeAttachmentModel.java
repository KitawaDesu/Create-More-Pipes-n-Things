package com.kitawadesu.create_mpnt.blocks.util.pipes.zinc;

import com.kitawadesu.create_mpnt.blocks.util.MPNTPartialModels;
import com.simibubi.create.content.decoration.bracket.BracketedBlockEntityBehaviour;
import com.simibubi.create.content.fluids.FluidTransportBehaviour;
import com.simibubi.create.content.fluids.pipes.FluidPipeBlock;
import com.simibubi.create.foundation.blockEntity.behaviour.BlockEntityBehaviour;
import com.simibubi.create.foundation.model.BakedModelWrapperWithData;
import net.createmod.catnip.data.Iterate;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.ChunkRenderTypeSet;
import net.neoforged.neoforge.client.model.data.ModelData;
import net.neoforged.neoforge.client.model.data.ModelProperty;
import net.neoforged.neoforge.common.util.TriState;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZincPipeAttachmentModel extends BakedModelWrapperWithData {

    private static final ModelProperty<ZincPipeAttachmentModel.PipeModelData> PIPE_PROPERTY = new ModelProperty<>();
    private boolean ao;

    public static ZincPipeAttachmentModel withAO(BakedModel template) {
        return new ZincPipeAttachmentModel(template, true);
    }

    public static ZincPipeAttachmentModel withoutAO(BakedModel template) {
        return new ZincPipeAttachmentModel(template, false);
    }

    public ZincPipeAttachmentModel(BakedModel template, boolean ao) {
        super(template);
        this.ao = ao;
    }

    @Override
    protected ModelData.Builder gatherModelData(ModelData.Builder builder, BlockAndTintGetter world, BlockPos pos, BlockState state,
                                                ModelData blockEntityData) {
        ZincPipeAttachmentModel.PipeModelData data = new ZincPipeAttachmentModel.PipeModelData();
        FluidTransportBehaviour transport = BlockEntityBehaviour.get(world, pos, FluidTransportBehaviour.TYPE);
        BracketedBlockEntityBehaviour bracket = BlockEntityBehaviour.get(world, pos, BracketedBlockEntityBehaviour.TYPE);

        if (transport != null)
            for (Direction d : Iterate.directions)
                data.putAttachment(d, transport.getRenderedRimAttachment(world, pos, state, d));
        if (bracket != null)
            data.putBracket(bracket.getBracket());

        data.setEncased(FluidPipeBlock.shouldDrawCasing(world, pos, state));
        return builder.with(PIPE_PROPERTY, data);
    }

    @Override
    public ChunkRenderTypeSet getRenderTypes(@NotNull BlockState state, @NotNull RandomSource rand, @NotNull ModelData data) {
        List<ChunkRenderTypeSet> set = new ArrayList<>();

        set.add(super.getRenderTypes(state, rand, data));
        set.add(MPNTPartialModels.ZINC_FLUID_PIPE_CASING.get().getRenderTypes(state, rand, data));

        if (data.has(PIPE_PROPERTY)) {
            ZincPipeAttachmentModel.PipeModelData pipeData = data.get(PIPE_PROPERTY);
            for (Direction d : Iterate.directions) {
                FluidTransportBehaviour.AttachmentTypes type = pipeData.getAttachment(d);
                for (FluidTransportBehaviour.AttachmentTypes.ComponentPartials partial : type.partials) {
                    ChunkRenderTypeSet attachmentRenderTypeSet = MPNTPartialModels.ZINC_PIPE_ATTACHMENTS.get(partial).get(d)
                            .get().getRenderTypes(state, rand, data);
                    set.add(attachmentRenderTypeSet);
                }
            }
        }

        return ChunkRenderTypeSet.union(set);
    }

    @Override
    public List<BakedQuad> getQuads(BlockState state, Direction side, RandomSource rand, ModelData data, RenderType renderType) {
        List<BakedQuad> quads = super.getQuads(state, side, rand, data, renderType);
        if (data.has(PIPE_PROPERTY)) {
            ZincPipeAttachmentModel.PipeModelData pipeData = data.get(PIPE_PROPERTY);
            quads = new ArrayList<>(quads);
            addQuads(quads, state, side, rand, data, pipeData, renderType);
        }
        return quads;
    }

    @Override
    public TriState useAmbientOcclusion(BlockState state, ModelData data, RenderType renderType) {
        if (ao) {
            return TriState.TRUE;
        } else {
            return TriState.FALSE;
        }
    }

    @Override
    public boolean useAmbientOcclusion() {
        return ao;
    }

    private void addQuads(List<BakedQuad> quads, BlockState state, Direction side, RandomSource rand, ModelData data,
                          ZincPipeAttachmentModel.PipeModelData pipeData, RenderType renderType) {
        BakedModel bracket = pipeData.getBracket();
        if (bracket != null)
            quads.addAll(bracket.getQuads(state, side, rand, data, renderType));
        for (Direction d : Iterate.directions) {
            FluidTransportBehaviour.AttachmentTypes type = pipeData.getAttachment(d);
            for (FluidTransportBehaviour.AttachmentTypes.ComponentPartials partial : type.partials) {
                quads.addAll(MPNTPartialModels.ZINC_PIPE_ATTACHMENTS.get(partial)
                        .get(d)
                        .get()
                        .getQuads(state, side, rand, data, renderType));
            }
        }
        if (pipeData.isEncased())
            quads.addAll(MPNTPartialModels.ZINC_FLUID_PIPE_CASING.get()
                    .getQuads(state, side, rand, data, renderType));
    }

    private static class PipeModelData {
        private FluidTransportBehaviour.AttachmentTypes[] attachments;
        private boolean encased;
        private BakedModel bracket;

        public PipeModelData() {
            attachments = new FluidTransportBehaviour.AttachmentTypes[6];
            Arrays.fill(attachments, FluidTransportBehaviour.AttachmentTypes.NONE);
        }

        public void putBracket(BlockState state) {
            if (state != null) {
                this.bracket = Minecraft.getInstance()
                        .getBlockRenderer()
                        .getBlockModel(state);
            }
        }

        public BakedModel getBracket() {
            return bracket;
        }

        public void putAttachment(Direction face, FluidTransportBehaviour.AttachmentTypes rim) {
            attachments[face.get3DDataValue()] = rim;
        }

        public FluidTransportBehaviour.AttachmentTypes getAttachment(Direction face) {
            return attachments[face.get3DDataValue()];
        }

        public void setEncased(boolean encased) {
            this.encased = encased;
        }

        public boolean isEncased() {
            return encased;
        }
    }

}

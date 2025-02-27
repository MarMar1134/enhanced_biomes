package net.marmar.enhanced_biomes.datagen;

import net.marmar.enhanced_biomes.Enhanced_Biomes;
import net.marmar.enhanced_biomes.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider{

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Enhanced_Biomes.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //wood
            //walnut
            saplingBlock(ModBlocks.WALNUT_SAPLING);

            logBlock((RotatedPillarBlock) ModBlocks.WALNUT_LOG.get());
            blockItem(ModBlocks.WALNUT_LOG);

            axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_WALNUT_LOG.get(), blockTexture(ModBlocks.STRIPPED_WALNUT_LOG.get()),
                    new ResourceLocation(Enhanced_Biomes.MOD_ID, "block/stripped_walnut_log_top"));
            blockItem(ModBlocks.STRIPPED_WALNUT_LOG);

            axisBlock((RotatedPillarBlock) ModBlocks.WALNUT_WOOD.get(), blockTexture(ModBlocks.WALNUT_LOG.get()), blockTexture(ModBlocks.WALNUT_LOG.get()));
            blockItem(ModBlocks.WALNUT_WOOD);

            axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_WALNUT_WOOD.get(), blockTexture(ModBlocks.STRIPPED_WALNUT_LOG.get()), blockTexture(ModBlocks.STRIPPED_WALNUT_LOG.get()));
            blockItem(ModBlocks.STRIPPED_WALNUT_WOOD);

            leavesBlock(ModBlocks.WALNUT_LEAVES);

            blockWithItem(ModBlocks.WALNUT_PLANKS);

            doorBlockWithRenderType((DoorBlock) ModBlocks.WALNUT_DOOR.get(), modLoc("block/walnut_door_bottom"), modLoc("block/walnut_door_top"), "cutout");

            trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.WALNUT_TRAPDOOR.get(), modLoc("block/walnut_trapdoor"), true, "cutout");

            buttonBlock((ButtonBlock) ModBlocks.WALNUT_BUTTON.get(), blockTexture(ModBlocks.WALNUT_PLANKS.get()));

            pressurePlateBlock((PressurePlateBlock) ModBlocks.WALNUT_PRESSURE_PLATE.get(), blockTexture(ModBlocks.WALNUT_PLANKS.get()));

            slabBlock((SlabBlock) ModBlocks.WALNUT_SLAB.get(), blockTexture(ModBlocks.WALNUT_PLANKS.get()), blockTexture(ModBlocks.WALNUT_PLANKS.get()));
            stairsBlock((StairBlock) ModBlocks.WALNUT_STAIRS.get(), blockTexture(ModBlocks.WALNUT_PLANKS.get()));
            fenceBlock((FenceBlock) ModBlocks.WALNUT_FENCE.get(), blockTexture(ModBlocks.WALNUT_PLANKS.get()));
            fenceGateBlock((FenceGateBlock) ModBlocks.WALNUT_FENCEGATE.get(), blockTexture(ModBlocks.WALNUT_PLANKS.get()));

            //Apple
            saplingBlock(ModBlocks.APPLE_SAPLING);
            saplingBlock(ModBlocks.GREEN_APPLE_SAPLING);

            logBlock((RotatedPillarBlock) ModBlocks.APPLE_LOG.get());
            blockItem(ModBlocks.APPLE_LOG);

            axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_APPLE_LOG.get(), blockTexture(ModBlocks.STRIPPED_APPLE_LOG.get()),
                    new ResourceLocation(Enhanced_Biomes.MOD_ID, "block/stripped_apple_log_top"));
            blockItem(ModBlocks.STRIPPED_APPLE_LOG);

            axisBlock((RotatedPillarBlock) ModBlocks.APPLE_WOOD.get(), blockTexture(ModBlocks.APPLE_LOG.get()), blockTexture(ModBlocks.APPLE_LOG.get()));
            blockItem(ModBlocks.APPLE_WOOD);

            axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_APPLE_WOOD.get(), blockTexture(ModBlocks.STRIPPED_APPLE_LOG.get()), blockTexture(ModBlocks.STRIPPED_APPLE_LOG.get()));
            blockItem(ModBlocks.STRIPPED_APPLE_WOOD);

            leavesBlock(ModBlocks.APPLE_LEAVES);
            leavesBlock(ModBlocks.GREEN_APPLE_LEAVES);

            blockWithItem(ModBlocks.APPLE_PLANKS);

            doorBlockWithRenderType((DoorBlock) ModBlocks.APPLE_DOOR.get(), modLoc("block/apple_door_bottom"), modLoc("block/apple_door_top"), "cutout");

            trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.APPLE_TRAPDOOR.get(), modLoc("block/apple_trapdoor"), true, "cutout");

            buttonBlock((ButtonBlock) ModBlocks.APPLE_BUTTON.get(), blockTexture(ModBlocks.APPLE_PLANKS.get()));

            pressurePlateBlock((PressurePlateBlock) ModBlocks.APPLE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.APPLE_PLANKS.get()));

            slabBlock((SlabBlock) ModBlocks.APPLE_SLAB.get(), blockTexture(ModBlocks.APPLE_PLANKS.get()), blockTexture(ModBlocks.APPLE_PLANKS.get()));
            stairsBlock((StairBlock) ModBlocks.APPLE_STAIRS.get(), blockTexture(ModBlocks.APPLE_PLANKS.get()));
            fenceBlock((FenceBlock) ModBlocks.APPLE_FENCE.get(), blockTexture(ModBlocks.APPLE_PLANKS.get()));
            fenceGateBlock((FenceGateBlock) ModBlocks.APPLE_FENCEGATE.get(), blockTexture(ModBlocks.APPLE_PLANKS.get()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(Enhanced_Biomes.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }
}

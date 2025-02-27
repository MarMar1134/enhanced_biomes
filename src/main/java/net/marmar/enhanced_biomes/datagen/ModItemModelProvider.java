package net.marmar.enhanced_biomes.datagen;

import net.marmar.enhanced_biomes.Enhanced_Biomes;
import net.marmar.enhanced_biomes.block.ModBlocks;
import net.marmar.enhanced_biomes.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Enhanced_Biomes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //wood
            //walnut
            saplingItem(ModBlocks.WALNUT_SAPLING);

            simpleBlockItem(ModBlocks.WALNUT_DOOR);
            trapdoorItem(ModBlocks.WALNUT_TRAPDOOR);

            buttonItem(ModBlocks.WALNUT_BUTTON, ModBlocks.WALNUT_PLANKS);

            blockWithItem(ModBlocks.WALNUT_PRESSURE_PLATE);

            blockWithItem(ModBlocks.WALNUT_SLAB);
            blockWithItem(ModBlocks.WALNUT_STAIRS);
            fenceItem(ModBlocks.WALNUT_FENCE, ModBlocks.WALNUT_PLANKS);
            blockWithItem(ModBlocks.WALNUT_FENCEGATE);

            simpleItem(ModItems.WALNUT);
            simpleItem(ModItems.PEELED_WALNUT);

            //Apple
            saplingItem(ModBlocks.APPLE_SAPLING);
            saplingItem(ModBlocks.GREEN_APPLE_SAPLING);

            simpleBlockItem(ModBlocks.APPLE_DOOR);
            trapdoorItem(ModBlocks.APPLE_TRAPDOOR);

            buttonItem(ModBlocks.APPLE_BUTTON, ModBlocks.APPLE_PLANKS);

            blockWithItem(ModBlocks.APPLE_PRESSURE_PLATE);

            blockWithItem(ModBlocks.APPLE_SLAB);
            blockWithItem(ModBlocks.APPLE_STAIRS);
            fenceItem(ModBlocks.APPLE_FENCE, ModBlocks.APPLE_PLANKS);
            blockWithItem(ModBlocks.APPLE_FENCEGATE);

            simpleItem(ModItems.GREEN_APPLE);

        //Food
        simpleItem(ModItems.LEMON);

        simpleItem(ModItems.ORANGE);
        }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture ("layer0",
                new ResourceLocation(Enhanced_Biomes.MOD_ID,
                        "item/" + item.getId().getPath()));
    }

    public void blockWithItem(RegistryObject<Block> block) {
        this.withExistingParent(Enhanced_Biomes.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Enhanced_Biomes.MOD_ID,"block/" + item.getId().getPath()));
    }
    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(Enhanced_Biomes.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(Enhanced_Biomes.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(Enhanced_Biomes.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Enhanced_Biomes.MOD_ID,"item/" + item.getId().getPath()));
    }
}
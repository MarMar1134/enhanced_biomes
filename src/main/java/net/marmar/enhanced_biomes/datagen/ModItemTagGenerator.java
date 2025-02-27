package net.marmar.enhanced_biomes.datagen;

import net.marmar.enhanced_biomes.Enhanced_Biomes;
import net.marmar.enhanced_biomes.util.ModTags;
import net.marmar.enhanced_biomes.block.ModBlocks;
import net.marmar.enhanced_biomes.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Enhanced_Biomes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.LOGS_THAT_BURN).add(
                ModBlocks.WALNUT_LOG.get().asItem(),
                ModBlocks.STRIPPED_WALNUT_LOG.get().asItem(),
                ModBlocks.WALNUT_WOOD.get().asItem(),
                ModBlocks.STRIPPED_WALNUT_WOOD.get().asItem(),
                ModBlocks.APPLE_LOG.get().asItem(),
                ModBlocks.STRIPPED_APPLE_LOG.get().asItem(),
                ModBlocks.APPLE_WOOD.get().asItem(),
                ModBlocks.STRIPPED_APPLE_WOOD.get().asItem()
        );

        this.tag(ItemTags.PLANKS).add(
                ModBlocks.WALNUT_PLANKS.get().asItem(),
                ModBlocks.APPLE_PLANKS.get().asItem()
        );

        this.tag(ModTags.Items.WALNUT_LOGS).add(
                ModBlocks.WALNUT_LOG.get().asItem(),
                ModBlocks.STRIPPED_WALNUT_LOG.get().asItem()
        );

        this.tag(ModTags.Items.APPLE_LOGS).add(
                ModBlocks.APPLE_LOG.get().asItem(),
                ModBlocks.STRIPPED_APPLE_LOG.get().asItem()
        );
    }
}

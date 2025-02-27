package net.marmar.enhanced_biomes.datagen;

import net.marmar.enhanced_biomes.Enhanced_Biomes;
import net.marmar.enhanced_biomes.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Enhanced_Biomes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(BlockTags.SLABS).add(
                ModBlocks.WALNUT_SLAB.get(),
                ModBlocks.APPLE_SLAB.get()
        );

        this.tag(BlockTags.STAIRS).add(
                ModBlocks.WALNUT_STAIRS.get(),
                ModBlocks.APPLE_STAIRS.get()
        );

        this.tag(BlockTags.FENCES).add(
                ModBlocks.WALNUT_FENCE.get(),
                ModBlocks.APPLE_FENCE.get()
        );

        this.tag(BlockTags.FENCE_GATES).add(
                ModBlocks.WALNUT_FENCEGATE.get(),
                ModBlocks.APPLE_FENCEGATE.get()
        );

        this.tag(BlockTags.BUTTONS).add(
                ModBlocks.WALNUT_BUTTON.get(),
                ModBlocks.APPLE_BUTTON.get()
        );

        this.tag(BlockTags.PRESSURE_PLATES).add(
                ModBlocks.WALNUT_PRESSURE_PLATE.get(),
                ModBlocks.APPLE_PRESSURE_PLATE.get()
        );

        this.tag(BlockTags.LOGS_THAT_BURN).add(
                ModBlocks.WALNUT_LOG.get(),
                ModBlocks.STRIPPED_WALNUT_LOG.get(),
                ModBlocks.WALNUT_WOOD.get(),
                ModBlocks.STRIPPED_WALNUT_WOOD.get(),
                ModBlocks.APPLE_LOG.get(),
                ModBlocks.STRIPPED_APPLE_LOG.get(),
                ModBlocks.APPLE_WOOD.get(),
                ModBlocks.STRIPPED_APPLE_WOOD.get()
        );

        this.tag(BlockTags.OVERWORLD_NATURAL_LOGS).add(
                ModBlocks.WALNUT_LOG.get(),
                ModBlocks.APPLE_LOG.get()
        );

        this.tag(BlockTags.LEAVES).add(
                ModBlocks.WALNUT_LEAVES.get(),
                ModBlocks.APPLE_LEAVES.get(),
                ModBlocks.GREEN_APPLE_LEAVES.get()
        );

        this.tag(BlockTags.SWORD_EFFICIENT).add(
                ModBlocks.WALNUT_LEAVES.get(),
                ModBlocks.APPLE_LEAVES.get(),
                ModBlocks.GREEN_APPLE_LEAVES.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_HOE).add(
                ModBlocks.WALNUT_LEAVES.get(),
                ModBlocks.APPLE_LEAVES.get(),
                ModBlocks.GREEN_APPLE_LEAVES.get()
        );

        this.tag(BlockTags.PLANKS).add(
                ModBlocks.WALNUT_PLANKS.get(),
                ModBlocks.APPLE_PLANKS.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_AXE).add(
                ModBlocks.WALNUT_PLANKS.get(),
                ModBlocks.APPLE_PLANKS.get(),
                ModBlocks.WALNUT_LOG.get(),
                ModBlocks.STRIPPED_WALNUT_LOG.get(),
                ModBlocks.WALNUT_WOOD.get(),
                ModBlocks.STRIPPED_WALNUT_WOOD.get(),
                ModBlocks.APPLE_LOG.get(),
                ModBlocks.STRIPPED_APPLE_LOG.get(),
                ModBlocks.APPLE_WOOD.get(),
                ModBlocks.STRIPPED_APPLE_WOOD.get(),
                ModBlocks.WALNUT_PRESSURE_PLATE.get(),
                ModBlocks.APPLE_PRESSURE_PLATE.get(),
                ModBlocks.WALNUT_FENCE.get(),
                ModBlocks.APPLE_FENCE.get(),
                ModBlocks.WALNUT_FENCEGATE.get(),
                ModBlocks.APPLE_FENCEGATE.get(),
                ModBlocks.WALNUT_BUTTON.get(),
                ModBlocks.APPLE_BUTTON.get(),
                ModBlocks.WALNUT_STAIRS.get(),
                ModBlocks.APPLE_STAIRS.get(),
                ModBlocks.WALNUT_SLAB.get(),
                ModBlocks.APPLE_SLAB.get()
        );
    }
}

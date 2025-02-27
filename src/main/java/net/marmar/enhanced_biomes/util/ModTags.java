package net.marmar.enhanced_biomes.util;

import net.marmar.enhanced_biomes.Enhanced_Biomes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks{
        private static TagKey<Block> blockTag(String name){
            return BlockTags.create(new ResourceLocation(Enhanced_Biomes.MOD_ID, name));
        }
    }
    public static class Items{
        public static final TagKey<Item> WALNUT_LOGS = itemTag("walnut_logs");
        public static final TagKey<Item> APPLE_LOGS = itemTag("apple_logs");
        private static TagKey<Item> itemTag(String name){
            return ItemTags.create(new ResourceLocation(Enhanced_Biomes.MOD_ID, name));
        }
    }
}

package net.marmar.enhanced_biomes.datagen;

import net.marmar.enhanced_biomes.Enhanced_Biomes;
import net.marmar.enhanced_biomes.block.ModBlocks;
import net.marmar.enhanced_biomes.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Enhanced_Biomes.MOD_ID);
    }

    @Override
    protected void start() {
        //Villages
//        add("apple_sapling_from_villages", new AddItemModifier(new LootItemCondition[]{
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_plains_house")).build(),
//                LootItemRandomChanceCondition.randomChance(0.4f).build()}, ModBlocks.APPLE_SAPLING.get().asItem()));
//        add("walnut_sapling_from_villages", new AddItemModifier(new LootItemCondition[]{
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_taiga_house")).build(),
//                LootItemRandomChanceCondition.randomChance(0.4f).build()}, ModBlocks.WALNUT_SAPLING.get().asItem()));
    }
}

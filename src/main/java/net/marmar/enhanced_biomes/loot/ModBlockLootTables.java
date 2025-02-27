package net.marmar.enhanced_biomes.loot;

import net.marmar.enhanced_biomes.block.ModBlocks;
import net.marmar.enhanced_biomes.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables(){
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //wood
            //walnut
            this.dropSelf(ModBlocks.WALNUT_SAPLING.get());
            this.dropSelf(ModBlocks.WALNUT_LOG.get());
            this.dropSelf(ModBlocks.STRIPPED_WALNUT_LOG.get());
            this.dropSelf(ModBlocks.WALNUT_WOOD.get());
            this.dropSelf(ModBlocks.STRIPPED_WALNUT_WOOD.get());

            this.add(ModBlocks.WALNUT_LEAVES.get(),
                    block -> createLeaveWithFruitDrop(block, ModBlocks.WALNUT_SAPLING.get(), ModItems.WALNUT.get(), 4f));

            this.dropSelf(ModBlocks.WALNUT_PLANKS.get());

            this.add(ModBlocks.WALNUT_DOOR.get(),
                    block -> createDoorTable(ModBlocks.WALNUT_DOOR.get()));

            this.dropSelf(ModBlocks.WALNUT_TRAPDOOR.get());

            this.dropSelf(ModBlocks.WALNUT_BUTTON.get());

            this.dropSelf(ModBlocks.WALNUT_PRESSURE_PLATE.get());

            this.dropSelf(ModBlocks.WALNUT_STAIRS.get());
            this.add(ModBlocks.WALNUT_SLAB.get(),
                    block -> createSlabItemTable(ModBlocks.WALNUT_SLAB.get()));
            this.dropSelf(ModBlocks.WALNUT_FENCE.get());
            this.dropSelf(ModBlocks.WALNUT_FENCEGATE.get());

            //Apple
            this.dropSelf(ModBlocks.APPLE_SAPLING.get());
            this.dropSelf(ModBlocks.GREEN_APPLE_SAPLING.get());
            this.dropSelf(ModBlocks.APPLE_LOG.get());
            this.dropSelf(ModBlocks.STRIPPED_APPLE_LOG.get());
            this.dropSelf(ModBlocks.APPLE_WOOD.get());
            this.dropSelf(ModBlocks.STRIPPED_APPLE_WOOD.get());

            this.add(ModBlocks.APPLE_LEAVES.get(),
                    block -> createLeaveWithFruitDrop(block, ModBlocks.APPLE_SAPLING.get(), Items.APPLE));
            this.add(ModBlocks.GREEN_APPLE_LEAVES.get(),
                    block -> createLeaveWithFruitDrop(block, ModBlocks.GREEN_APPLE_SAPLING.get(), ModItems.GREEN_APPLE.get()));

            this.dropSelf(ModBlocks.APPLE_PLANKS.get());

            this.add(ModBlocks.APPLE_DOOR.get(),
                    block -> createDoorTable(ModBlocks.APPLE_DOOR.get()));

            this.dropSelf(ModBlocks.APPLE_TRAPDOOR.get());

            this.dropSelf(ModBlocks.APPLE_BUTTON.get());

            this.dropSelf(ModBlocks.APPLE_PRESSURE_PLATE.get());

            this.dropSelf(ModBlocks.APPLE_STAIRS.get());
            this.add(ModBlocks.APPLE_SLAB.get(),
                    block -> createSlabItemTable(ModBlocks.APPLE_SLAB.get()));
            this.dropSelf(ModBlocks.APPLE_FENCE.get());
            this.dropSelf(ModBlocks.APPLE_FENCEGATE.get());
    }

    //Loot table creators
    /**
     *
     * @param leavesBlock references the block that will have the specified loot table.
     * @param saplingBlock references the sapling block that will drop the leave block.
     * @param secondLoot references the second loot that will drop the leave block. by default, the max drop for this method is 2.
     *@return the JSON file of the loot table for the specified block
     */
    protected LootTable.Builder createLeaveWithFruitDrop(Block leavesBlock, Block saplingBlock, Item secondLoot){
        return createLeavesDrops(leavesBlock, saplingBlock, 0.05f)
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                .add(this.applyExplosionCondition(leavesBlock, LootItem.lootTableItem(secondLoot))
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(0F, 2F)))
                .when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, 0.05F, 0.055555557F, 0.0625F, 0.08333334F, 0.087F)
                )));
    }

    /**
     *
     * @param leavesBlock references the block that will have the specified loot table.
     * @param saplingBlock references the sapling block that will drop the leave block.
     * @param secondLoot references the second loot that will drop the leave block.
     *                  You have to define the max quantity of items dropped in the {@code dropsPerLeave} parameter.
     * @param dropsPerLeave defines the max quantity of items dropped by the block.
     *@return the JSON file of the loot table for the specified block
     */
    protected LootTable.Builder createLeaveWithFruitDrop(Block leavesBlock, Block saplingBlock, Item secondLoot, float dropsPerLeave){
        return createLeavesDrops(leavesBlock, saplingBlock, 0.05f)
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                .add(this.applyExplosionCondition(leavesBlock, LootItem.lootTableItem(secondLoot))
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(0F, dropsPerLeave)))
                .when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, 0.05F, 0.055555557F, 0.0625F, 0.08333334F, 0.087F)
                )));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

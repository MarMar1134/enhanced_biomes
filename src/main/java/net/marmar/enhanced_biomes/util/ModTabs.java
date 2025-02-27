package net.marmar.enhanced_biomes.util;

import net.marmar.enhanced_biomes.Enhanced_Biomes;
import net.marmar.enhanced_biomes.block.ModBlocks;
import net.marmar.enhanced_biomes.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Enhanced_Biomes.MOD_ID);

    //Tabs
    public static final RegistryObject<CreativeModeTab> SAPLINGS = TABS.register(
            "saplings", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.WALNUT_SAPLING.get()))
                    .title(Component.translatable("creativetab.saplings"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.WALNUT_SAPLING.get());
                        output.accept(ModBlocks.WALNUT_LEAVES.get());
                        output.accept(ModBlocks.APPLE_SAPLING.get());
                        output.accept(ModBlocks.APPLE_LEAVES.get());
                        output.accept(ModBlocks.GREEN_APPLE_SAPLING.get());
                        output.accept(ModBlocks.GREEN_APPLE_LEAVES.get());
                    }).build());
    public static final RegistryObject<CreativeModeTab> WOODTYPES = TABS.register(
            "woodtypes", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.WALNUT_PLANKS.get()))
                    .title(Component.translatable("creativetab.woodtypes"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.WALNUT_LOG.get());
                        output.accept(ModBlocks.STRIPPED_WALNUT_LOG.get());
                        output.accept(ModBlocks.WALNUT_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_WALNUT_WOOD.get());
                        output.accept(ModBlocks.WALNUT_PLANKS.get());
                        output.accept(ModBlocks.WALNUT_DOOR.get());
                        output.accept(ModBlocks.WALNUT_TRAPDOOR.get());
                        output.accept(ModBlocks.WALNUT_BUTTON.get());
                        output.accept(ModBlocks.WALNUT_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.WALNUT_SLAB.get());
                        output.accept(ModBlocks.WALNUT_STAIRS.get());
                        output.accept(ModBlocks.WALNUT_FENCE.get());
                        output.accept(ModBlocks.WALNUT_FENCEGATE.get());

                        output.accept(ModBlocks.APPLE_LOG.get());
                        output.accept(ModBlocks.STRIPPED_APPLE_LOG.get());
                        output.accept(ModBlocks.APPLE_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_APPLE_WOOD.get());
                        output.accept(ModBlocks.APPLE_PLANKS.get());
                        output.accept(ModBlocks.APPLE_DOOR.get());
                        output.accept(ModBlocks.APPLE_TRAPDOOR.get());
                        output.accept(ModBlocks.APPLE_BUTTON.get());
                        output.accept(ModBlocks.APPLE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.APPLE_SLAB.get());
                        output.accept(ModBlocks.APPLE_STAIRS.get());
                        output.accept(ModBlocks.APPLE_FENCE.get());
                        output.accept(ModBlocks.APPLE_FENCEGATE.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> FOODS = TABS.register(
            "fruits", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GREEN_APPLE.get()))
                    .title(Component.translatable("creativetab.fruits"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.WALNUT.get());
                        output.accept(ModItems.PEELED_WALNUT.get());

                        output.accept(ModItems.GREEN_APPLE.get());

                        output.accept(ModItems.LEMON.get());
                    }).build());
    public static void Register(IEventBus eventBus){
        TABS.register(eventBus);
    }
}

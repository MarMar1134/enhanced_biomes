package net.marmar.enhanced_biomes.block;

import net.marmar.enhanced_biomes.block.wood.ModLeavesBlock;
import net.marmar.enhanced_biomes.block.wood.ModLogsBlock;
import net.marmar.enhanced_biomes.block.wood.ModPlanksBlock;
import net.marmar.enhanced_biomes.item.ModItems;
import net.marmar.enhanced_biomes.worldgen.tree.grower.AppleTreeGrower;
import net.marmar.enhanced_biomes.worldgen.tree.grower.GreenAppleTreeGrower;
import net.marmar.enhanced_biomes.worldgen.tree.grower.WalnutTreeGrower;
import net.marmar.enhanced_biomes.Enhanced_Biomes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Enhanced_Biomes.MOD_ID);

        //Wood
            //Walnut
            public static final RegistryObject<Block> WALNUT_SAPLING = registerBlock("walnut_sapling",
                    () -> new SaplingBlock(new WalnutTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> WALNUT_LOG = registerBlock("walnut_log",
                    () -> new ModLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> STRIPPED_WALNUT_LOG = registerBlock("stripped_walnut_log",
                    () -> new ModLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> WALNUT_WOOD = registerBlock("walnut_wood",
                    () -> new ModLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> STRIPPED_WALNUT_WOOD = registerBlock("stripped_walnut_wood",
                    () -> new ModLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> WALNUT_LEAVES = registerBlock("walnut_leaves",
                    () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> WALNUT_PLANKS = registerBlock("walnut_planks",
                    () -> new ModPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> WALNUT_DOOR = registerBlock("walnut_door",
                    () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops(), BlockSetType.OAK));
            public static final RegistryObject<Block> WALNUT_TRAPDOOR = registerBlock("walnut_trapdoor",
                    () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops(), BlockSetType.OAK));
            public static final RegistryObject<Block> WALNUT_BUTTON = registerBlock("walnut_button",
                    () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).requiresCorrectToolForDrops(), BlockSetType.OAK, 10, true));
            public static final RegistryObject<Block> WALNUT_PRESSURE_PLATE = registerBlock("walnut_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).requiresCorrectToolForDrops(), BlockSetType.OAK));
            public static final RegistryObject<Block> WALNUT_SLAB = registerBlock("walnut_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> WALNUT_STAIRS = registerBlock("walnut_stair",
                    () -> new StairBlock(() -> WALNUT_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> WALNUT_FENCE = registerBlock("walnut_fence",
                    () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> WALNUT_FENCEGATE = registerBlock("walnut_fencegate",
                    () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).requiresCorrectToolForDrops(), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

            //Apple
            public static final RegistryObject<Block> APPLE_SAPLING = registerBlock("apple_sapling",
                    () -> new SaplingBlock(new AppleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> GREEN_APPLE_SAPLING = registerBlock("green_apple_sapling",
                    () -> new SaplingBlock(new GreenAppleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> APPLE_LOG = registerBlock("apple_log",
                    () -> new ModLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> STRIPPED_APPLE_LOG = registerBlock("stripped_apple_log",
                    () -> new ModLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> APPLE_WOOD = registerBlock("apple_wood",
                    () -> new ModLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> STRIPPED_APPLE_WOOD = registerBlock("stripped_apple_wood",
                    () -> new ModLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> APPLE_LEAVES = registerBlock("apple_leaves",
                    () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> GREEN_APPLE_LEAVES = registerBlock("green_apple_leaves",
                    () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> APPLE_PLANKS = registerBlock("apple_planks",
                    () -> new ModPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> APPLE_DOOR = registerBlock("apple_door",
                    () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops(), BlockSetType.OAK));
            public static final RegistryObject<Block> APPLE_TRAPDOOR = registerBlock("apple_trapdoor",
                    () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops(), BlockSetType.OAK));
            public static final RegistryObject<Block> APPLE_BUTTON = registerBlock("apple_button",
                    () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).requiresCorrectToolForDrops(), BlockSetType.OAK, 10, true));
            public static final RegistryObject<Block> APPLE_PRESSURE_PLATE = registerBlock("apple_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).requiresCorrectToolForDrops(), BlockSetType.OAK));
            public static final RegistryObject<Block> APPLE_SLAB = registerBlock("apple_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> APPLE_STAIRS = registerBlock("apple_stair",
                    () -> new StairBlock(() -> APPLE_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> APPLE_FENCE = registerBlock("apple_fence",
                    () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> APPLE_FENCEGATE = registerBlock("apple_fencegate",
                    () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).requiresCorrectToolForDrops(), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    //Block register
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> ToReturn = BLOCKS.register(name, block);
        RegisterBlockItem(name, ToReturn);
        return ToReturn;
    }

    //BlockItem register
    private static <T extends Block> RegistryObject<Item> RegisterBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    //Final register
    public static void Register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}

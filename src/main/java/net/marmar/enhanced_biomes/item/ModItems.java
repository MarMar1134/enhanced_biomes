package net.marmar.enhanced_biomes.item;

import net.marmar.enhanced_biomes.Enhanced_Biomes;
import net.marmar.enhanced_biomes.block.ModBlocks;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, Enhanced_Biomes.MOD_ID
    );
        //Fruit
        public static final RegistryObject<Item> ORANGE = ITEMS.register(
                "orange",() -> new Item(new Item.Properties().food(ModFoodPropieties.ORANGE)));
        public static final RegistryObject<Item> LEMON = ITEMS.register(
                "lemon",() -> new Item(new Item.Properties().food(ModFoodPropieties.LEMON)));
        public static final RegistryObject<Item> GREEN_APPLE = ITEMS.register(
                "green_apple",() -> new Item(new Item.Properties().food(ModFoodPropieties.GREEN_APPLE)));
        public static final RegistryObject<Item> WALNUT = ITEMS.register(
                "walnut",() -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PEELED_WALNUT = ITEMS.register(
                "peeled_walnut",() -> new Item(new Item.Properties().food(ModFoodPropieties.PEELED_WALNUT)));

    //Final register
    public static void Register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

package net.marmar.enhanced_biomes.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodPropieties {
    //Fruit
    public static final FoodProperties ORANGE = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.2f).build();
    public static final FoodProperties LEMON = new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.2f).build();
    public static final FoodProperties GREEN_APPLE = new FoodProperties.Builder()
            .nutrition(5).saturationMod(0.4f).build();
    public static final FoodProperties PEELED_WALNUT = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.4f).build();

}

package net.marmar.enhanced_biomes.worldgen;

import net.marmar.enhanced_biomes.Enhanced_Biomes;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {
    //Trees
    public static final ResourceKey<BiomeModifier> ADD_WALNUT = registerKey("add_walnut");
    public static final ResourceKey<BiomeModifier> ADD_APPLE = registerKey("add_apple");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        //Trees
            //Walnut
            context.register(ADD_WALNUT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_TAIGA),
                    HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.WALNUT_PLACED_KEY)),
                    GenerationStep.Decoration.VEGETAL_DECORATION));

            //Apple
            context.register(ADD_APPLE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                    (HolderSet<Biome>) biomes.getOrThrow(Biomes.FOREST),
                    HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.APPLE_PLACED_KEY)),
                    GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(Enhanced_Biomes.MOD_ID, name));
    }
}

package net.marmar.enhanced_biomes.datagen;

import net.marmar.enhanced_biomes.Enhanced_Biomes;
import net.marmar.enhanced_biomes.language.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Enhanced_Biomes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> LookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), ModLootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));

        generator.addProvider(event.includeServer(), new ModWorldGenProvider(packOutput, LookupProvider));

        generator.addProvider(event.includeServer(), new ModGlobalLootModifiersProvider(packOutput));

        ModBlockTagGenerator blockTagGenerator= generator.addProvider(event.includeServer(),
        new ModBlockTagGenerator(packOutput, LookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModItemTagGenerator(packOutput, LookupProvider, blockTagGenerator.contentsGetter(),
                existingFileHelper));

        //Languages
        generator.addProvider(event.includeClient(), new EnglishLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new ArgentinianLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new UruguayanLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new ChileanLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new EcuatorianLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new SpanishLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new MexicanLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new VenezuelanLanguageProvider(packOutput));

    }
}

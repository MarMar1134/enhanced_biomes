package net.marmar.enhanced_biomes.language;

import net.marmar.enhanced_biomes.block.ModBlocks;
import net.marmar.enhanced_biomes.item.ModItems;
import net.minecraft.data.PackOutput;

public class VenezuelanLanguageProvider extends AbstractModLanguageProvider{
    public VenezuelanLanguageProvider(PackOutput output) {
        super(output, "es_ve");
    }

    @Override
    protected void addTranslations() {
        addCreativeTab("fruits", "Frutas y vegetales");
        addCreativeTab("saplings", "Semillas");
        addCreativeTab("woodtypes", "Madera");

        //Wood
        //Apple
        addBlock(ModBlocks.APPLE_SAPLING, "Brote de manzano");
        addBlock(ModBlocks.APPLE_LEAVES, "Hojas de manzano");
        addBlock(ModBlocks.APPLE_LOG, "Tronco de manzano");
        addBlock(ModBlocks.STRIPPED_APPLE_LOG, "Tronco de manzano pelado");
        addBlock(ModBlocks.APPLE_WOOD, "Leño de manzana");
        addBlock(ModBlocks.STRIPPED_APPLE_WOOD, "Leño de manzano pelado");
        addBlock(ModBlocks.APPLE_PLANKS, "Tablones de manzano");
        addBlock(ModBlocks.APPLE_SLAB, "Baldosa de manzano");
        addBlock(ModBlocks.APPLE_STAIRS, "Escaleras de manzano");
        addBlock(ModBlocks.APPLE_FENCE, "Varandilla de manzano");
        addBlock(ModBlocks.APPLE_FENCEGATE, "Puerta de varandilla de manzano");
        addBlock(ModBlocks.APPLE_DOOR, "Puerta de manzano");
        addBlock(ModBlocks.APPLE_TRAPDOOR, "Trampilla de manzano");
        addBlock(ModBlocks.APPLE_BUTTON, "Botón de manzano");
        addBlock(ModBlocks.APPLE_PRESSURE_PLATE, "Placa de presión de manzano");

        //Green apple
        addBlock(ModBlocks.GREEN_APPLE_SAPLING, "Brote de manzano verde");
        addBlock(ModBlocks.GREEN_APPLE_LEAVES, "Hojas de manzano verde");

        //Walnut
        addBlock(ModBlocks.WALNUT_SAPLING, "Brote de nogal");
        addBlock(ModBlocks.WALNUT_LEAVES, "Hojas de nogal");
        addBlock(ModBlocks.WALNUT_LOG, "Tronco de nogal");
        addBlock(ModBlocks.STRIPPED_WALNUT_LOG, "Tronco de nogal pelado");
        addBlock(ModBlocks.WALNUT_WOOD, "Leño de nogal");
        addBlock(ModBlocks.STRIPPED_WALNUT_WOOD, "Leño de nogal pelado");
        addBlock(ModBlocks.WALNUT_PLANKS, "Tablones de nogal");
        addBlock(ModBlocks.WALNUT_SLAB, "Baldosa de nogal");
        addBlock(ModBlocks.WALNUT_STAIRS, "Escaleras de nogal");
        addBlock(ModBlocks.WALNUT_FENCE, "Varandilla de nogal");
        addBlock(ModBlocks.WALNUT_FENCEGATE, "Puerta de varandilla de nogal");
        addBlock(ModBlocks.WALNUT_DOOR, "Puerta de nogal");
        addBlock(ModBlocks.WALNUT_TRAPDOOR, "Trampilla de nogal");
        addBlock(ModBlocks.WALNUT_BUTTON, "Botón de nogal");
        addBlock(ModBlocks.WALNUT_PRESSURE_PLATE, "Placa de presión de nogal");

        addItem(ModItems.LEMON, "Limón");
        addItem(ModItems.ORANGE, "Naranja");
        addItem(ModItems.WALNUT, "Nuez");
        addItem(ModItems.PEELED_WALNUT, "Nuez pelada");
        addItem(ModItems.GREEN_APPLE, "Manzana verde");
    }
}

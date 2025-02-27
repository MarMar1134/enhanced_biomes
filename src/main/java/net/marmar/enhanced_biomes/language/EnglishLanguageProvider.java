package net.marmar.enhanced_biomes.language;

import net.marmar.enhanced_biomes.block.ModBlocks;
import net.marmar.enhanced_biomes.item.ModItems;
import net.minecraft.data.PackOutput;

public class EnglishLanguageProvider extends AbstractModLanguageProvider {
    public EnglishLanguageProvider(PackOutput output) {
        super(output, "en_us");
    }

    @Override
    protected void addTranslations() {
        //Creative tabs
        addCreativeTab("fruits", "Fruits and vegetables");
        addCreativeTab("saplings", "Seeds and saplings");
        addCreativeTab("woodtypes", "Wood");

            //Wood
                //Apple
                addBlock(ModBlocks.APPLE_SAPLING, "Apple sapling");
                addBlock(ModBlocks.APPLE_LEAVES, "Apple leaves");
                addBlock(ModBlocks.APPLE_LOG, "Apple log");
                addBlock(ModBlocks.STRIPPED_APPLE_LOG, "Stripped apple log");
                addBlock(ModBlocks.APPLE_WOOD, "Apple wood");
                addBlock(ModBlocks.STRIPPED_APPLE_WOOD, "Stripped apple wood");
                addBlock(ModBlocks.APPLE_PLANKS, "Apple planks");
                addBlock(ModBlocks.APPLE_SLAB, "Apple slab");
                addBlock(ModBlocks.APPLE_STAIRS, "Apple stairs");
                addBlock(ModBlocks.APPLE_FENCE, "Apple fence");
                addBlock(ModBlocks.APPLE_FENCEGATE, "Apple fence gate");
                addBlock(ModBlocks.APPLE_DOOR, "Apple door");
                addBlock(ModBlocks.APPLE_TRAPDOOR, "Apple trapdoor");
                addBlock(ModBlocks.APPLE_BUTTON, "Apple button");
                addBlock(ModBlocks.APPLE_PRESSURE_PLATE, "Apple pressure plate");

                //Green apple
                addBlock(ModBlocks.GREEN_APPLE_SAPLING, "Green apple sapling");
                addBlock(ModBlocks.GREEN_APPLE_LEAVES, "Green apple leaves");

                //Walnut
                addBlock(ModBlocks.WALNUT_SAPLING, "Walnut sapling");
                addBlock(ModBlocks.WALNUT_LEAVES, "Walnut leaves");
                addBlock(ModBlocks.WALNUT_LOG, "Walnut log");
                addBlock(ModBlocks.STRIPPED_WALNUT_LOG, "Stripped walnut log");
                addBlock(ModBlocks.WALNUT_WOOD, "Walnut wood");
                addBlock(ModBlocks.STRIPPED_WALNUT_WOOD, "Stripped walnut wood");
                addBlock(ModBlocks.WALNUT_PLANKS, "Walnut planks");
                addBlock(ModBlocks.WALNUT_SLAB, "Walnut slab");
                addBlock(ModBlocks.WALNUT_STAIRS, "Walnut stairs");
                addBlock(ModBlocks.WALNUT_FENCE, "Walnut fence");
                addBlock(ModBlocks.WALNUT_FENCEGATE, "Walnut fence gate");
                addBlock(ModBlocks.WALNUT_DOOR, "Walnut door");
                addBlock(ModBlocks.WALNUT_TRAPDOOR, "Walnut trapdoor");
                addBlock(ModBlocks.WALNUT_BUTTON, "Walnut button");
                addBlock(ModBlocks.WALNUT_PRESSURE_PLATE, "Walnut pressure plate");

                addItem(ModItems.LEMON, "Lemon");
                addItem(ModItems.ORANGE, "Orange");
                addItem(ModItems.WALNUT, "Walnut");
                addItem(ModItems.PEELED_WALNUT, "Peeled walnut");
                addItem(ModItems.GREEN_APPLE, "Green apple");
    }
}

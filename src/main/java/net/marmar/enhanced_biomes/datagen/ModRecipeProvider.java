package net.marmar.enhanced_biomes.datagen;

import net.marmar.enhanced_biomes.Enhanced_Biomes;
import net.marmar.enhanced_biomes.util.ModTags;
import net.marmar.enhanced_biomes.block.ModBlocks;
import net.marmar.enhanced_biomes.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SmithingTransformRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
            //walnut wood
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WALNUT_WOOD.get(), 3)
                    .pattern("AA")
                    .pattern("AA")
                    .define('A', ModBlocks.WALNUT_LOG.get())
                    .unlockedBy(getHasName(ModBlocks.WALNUT_LOG.get()), has(ModBlocks.WALNUT_LOG.get()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_WALNUT_WOOD.get(), 3)
                    .pattern("AA")
                    .pattern("AA")
                    .define('A', ModBlocks.STRIPPED_WALNUT_LOG.get())
                    .unlockedBy(getHasName(ModBlocks.STRIPPED_WALNUT_LOG.get()), has(ModBlocks.STRIPPED_WALNUT_LOG.get()))
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WALNUT_PLANKS.get(), 4)
                    .requires(ModTags.Items.WALNUT_LOGS)
                    .unlockedBy(getHasName(ModBlocks.WALNUT_LOG.get()), has(ModBlocks.WALNUT_LOG.get()))
                    .unlockedBy(getHasName(ModBlocks.WALNUT_WOOD.get()), has(ModBlocks.WALNUT_WOOD.get()))
                    .unlockedBy(getHasName(ModBlocks.STRIPPED_WALNUT_LOG.get()), has(ModBlocks.STRIPPED_WALNUT_LOG.get()))
                    .unlockedBy(getHasName(ModBlocks.STRIPPED_WALNUT_WOOD.get()), has(ModBlocks.STRIPPED_WALNUT_WOOD.get()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WALNUT_DOOR.get(), 3)
                    .pattern("AA")
                    .pattern("AA")
                    .pattern("AA")
                    .define('A', ModBlocks.WALNUT_PLANKS.get())
                    .unlockedBy(getHasName(ModBlocks.WALNUT_PLANKS.get()), has(ModBlocks.WALNUT_PLANKS.get()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WALNUT_TRAPDOOR.get(), 2)
                    .pattern("AAA")
                    .pattern("AAA")
                    .define('A', ModBlocks.WALNUT_PLANKS.get())
                    .unlockedBy(getHasName(ModBlocks.WALNUT_PLANKS.get()), has(ModBlocks.WALNUT_PLANKS.get()))
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WALNUT_BUTTON.get())
                    .requires(ModBlocks.WALNUT_PLANKS.get())
                    .unlockedBy(getHasName(ModBlocks.WALNUT_PLANKS.get()), has(ModBlocks.WALNUT_PLANKS.get()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WALNUT_PRESSURE_PLATE.get())
                    .pattern("AA")
                    .define('A', ModBlocks.WALNUT_PLANKS.get())
                    .unlockedBy(getHasName(ModBlocks.WALNUT_PLANKS.get()), has(ModBlocks.WALNUT_PLANKS.get()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WALNUT_SLAB.get(), 6)
                    .pattern("AAA")
                    .define('A', ModBlocks.WALNUT_PLANKS.get())
                    .unlockedBy(getHasName(ModBlocks.WALNUT_PLANKS.get()), has(ModBlocks.WALNUT_PLANKS.get()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WALNUT_STAIRS.get(), 4)
                    .pattern("A  ")
                    .pattern("AA ")
                    .pattern("AAA")
                    .define('A', ModBlocks.WALNUT_PLANKS.get())
                    .unlockedBy(getHasName(ModBlocks.WALNUT_PLANKS.get()), has(ModBlocks.WALNUT_PLANKS.get()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WALNUT_FENCE.get(), 3)
                    .pattern("ABA")
                    .pattern("ABA")
                    .define('A', ModBlocks.WALNUT_PLANKS.get())
                    .define('B', Items.STICK)
                    .unlockedBy(getHasName(ModBlocks.WALNUT_PLANKS.get()), has(ModBlocks.WALNUT_PLANKS.get()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WALNUT_FENCEGATE.get())
                    .pattern("BAB")
                    .pattern("BAB")
                    .define('A', ModBlocks.WALNUT_PLANKS.get())
                    .define('B', Items.STICK)
                    .unlockedBy(getHasName(ModBlocks.WALNUT_PLANKS.get()), has(ModBlocks.WALNUT_PLANKS.get()))
                    .save(consumer);

            //Apple wood
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.APPLE_WOOD.get(), 3)
                    .pattern("AA")
                    .pattern("AA")
                    .define('A', ModBlocks.APPLE_LOG.get())
                    .unlockedBy(getHasName(ModBlocks.APPLE_LOG.get()), has(ModBlocks.APPLE_LOG.get()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_APPLE_WOOD.get(), 3)
                    .pattern("AA")
                    .pattern("AA")
                    .define('A', ModBlocks.STRIPPED_APPLE_LOG.get())
                    .unlockedBy(getHasName(ModBlocks.STRIPPED_APPLE_LOG.get()), has(ModBlocks.STRIPPED_APPLE_LOG.get()))
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.APPLE_PLANKS.get(), 4)
                    .requires(ModTags.Items.APPLE_LOGS)
                    .unlockedBy(getHasName(ModBlocks.APPLE_LOG.get()), has(ModBlocks.APPLE_LOG.get()))
                    .unlockedBy(getHasName(ModBlocks.APPLE_WOOD.get()), has(ModBlocks.APPLE_WOOD.get()))
                    .unlockedBy(getHasName(ModBlocks.STRIPPED_APPLE_LOG.get()), has(ModBlocks.STRIPPED_APPLE_LOG.get()))
                    .unlockedBy(getHasName(ModBlocks.STRIPPED_APPLE_WOOD.get()), has(ModBlocks.STRIPPED_APPLE_WOOD.get()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.APPLE_DOOR.get(), 3)
                    .pattern("AA")
                    .pattern("AA")
                    .pattern("AA")
                    .define('A', ModBlocks.APPLE_PLANKS.get())
                    .unlockedBy(getHasName(ModBlocks.APPLE_PLANKS.get()), has(ModBlocks.APPLE_PLANKS.get()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.APPLE_TRAPDOOR.get(), 2)
                    .pattern("AAA")
                    .pattern("AAA")
                    .define('A', ModBlocks.APPLE_PLANKS.get())
                    .unlockedBy(getHasName(ModBlocks.APPLE_PLANKS.get()), has(ModBlocks.APPLE_PLANKS.get()))
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.APPLE_BUTTON.get())
                    .requires(ModBlocks.APPLE_PLANKS.get())
                    .unlockedBy(getHasName(ModBlocks.WALNUT_PLANKS.get()), has(ModBlocks.APPLE_PLANKS.get()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.APPLE_PRESSURE_PLATE.get())
                    .pattern("AA")
                    .define('A', ModBlocks.APPLE_PLANKS.get())
                    .unlockedBy(getHasName(ModBlocks.APPLE_PLANKS.get()), has(ModBlocks.APPLE_PLANKS.get()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.APPLE_SLAB.get(), 6)
                    .pattern("AAA")
                    .define('A', ModBlocks.APPLE_PLANKS.get())
                    .unlockedBy(getHasName(ModBlocks.APPLE_PLANKS.get()), has(ModBlocks.APPLE_PLANKS.get()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.APPLE_STAIRS.get(), 4)
                    .pattern("A  ")
                    .pattern("AA ")
                    .pattern("AAA")
                    .define('A', ModBlocks.APPLE_PLANKS.get())
                    .unlockedBy(getHasName(ModBlocks.APPLE_PLANKS.get()), has(ModBlocks.APPLE_PLANKS.get()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.APPLE_FENCE.get(), 3)
                    .pattern("ABA")
                    .pattern("ABA")
                    .define('A', ModBlocks.APPLE_PLANKS.get())
                    .define('B', Items.STICK)
                    .unlockedBy(getHasName(ModBlocks.APPLE_PLANKS.get()), has(ModBlocks.APPLE_PLANKS.get()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.APPLE_FENCEGATE.get())
                    .pattern("BAB")
                    .pattern("BAB")
                    .define('A', ModBlocks.APPLE_PLANKS.get())
                    .define('B', Tags.Items.RODS_WOODEN)
                    .unlockedBy(getHasName(ModBlocks.APPLE_PLANKS.get()), has(ModBlocks.APPLE_PLANKS.get()))
                    .save(consumer);
    }

    //Specific recipe builders
        //Vanilla
        protected static void byCampfire(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup){
            oreCooking(pFinishedRecipeConsumer, RecipeSerializer.CAMPFIRE_COOKING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_campfire");
        }
        protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
            oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
        }
        protected static void smoking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
            oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMOKING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smoking");
        }
        protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
            oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
        }
    //Recipe builders
    protected static void stoneCuttingBuilder(Consumer<FinishedRecipe> consumer, ItemLike input, RecipeCategory category, ItemLike result, int count, String recipeName){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), category, result, count)
                .unlockedBy(getHasName(input), has(input))
                .save(consumer, Enhanced_Biomes.MOD_ID + ":" + getItemName(result) + "_" + recipeName + "_" + getItemName(input));
    }
    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike),
                    pCategory, pResult, pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike),
                    has(itemlike)).save(pFinishedRecipeConsumer, Enhanced_Biomes.MOD_ID + ":" + getItemName(pResult) + "_" + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}

package net.fidgetz.Altered.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {


    public static final ForgeTier ZERONIUM = new ForgeTier(3, 1450, 1.5f, 2f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.ZERONIUMINGOT.get()));

}

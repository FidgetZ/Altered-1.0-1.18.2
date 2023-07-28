package net.fidgetz.Altered.util;


import net.fidgetz.Altered.Altered;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        public static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Altered.MOD_ID, name));
        }
        public static TagKey<Block> forgetag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
    public static class Items {

        public static final TagKey<Item> FORGE_FUEL = tag("forge_fuel");
        public static final TagKey<Item> NUNCHAKU = tag("nunchaku");

        public static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Altered.MOD_ID, name));
        }
        public static TagKey<Item> forgetag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

    }
}

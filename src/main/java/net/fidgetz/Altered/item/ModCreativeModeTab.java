package net.fidgetz.Altered.item;

import net.fidgetz.Altered.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ALTERED_ITEMS = new CreativeModeTab("altered_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZERONIUMINGOT.get());
        }
    };
    public static final CreativeModeTab ALTERED_TOOLS = new CreativeModeTab("altered_tools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZERONIUMINGOT.get());
        }
    };
    public static final CreativeModeTab ALTERED_BLOCK = new CreativeModeTab("altered_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.ZERONIUM_BLOCK.get());
        }
    };
    public static final CreativeModeTab ALTERED_MISC = new CreativeModeTab("altered_misc") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FIREDRAGONBONENUNCHAKU.get());
        }
    };
}

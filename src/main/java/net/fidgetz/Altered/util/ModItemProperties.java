package net.fidgetz.Altered.util;

import net.fidgetz.Altered.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModItemProperties extends ItemProperties{

    public static void addCustomProperties() {
        makeNunchaku(ModItems.FIREDRAGONBONENUNCHAKU.get());
    }

    private static void makeNunchaku(Item item) {
        ItemProperties.register(item, new ResourceLocation("spinning"), (p_174630_, p_174631_, p_174632_, p_174633_) -> {
            return p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F;
        });
    }

}

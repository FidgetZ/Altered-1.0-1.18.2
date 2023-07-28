package net.fidgetz.Altered.item;

import net.fidgetz.Altered.Altered;
import net.fidgetz.Altered.item.custom.NunchakuItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Altered.MOD_ID);

    public static final RegistryObject<Item> ZERONIUMINGOT = ITEMS.register("zeronium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERED_ITEMS)));

    public static final RegistryObject<Item> ZERONIUMNUGGET = ITEMS.register("zeronium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERED_ITEMS)));
    public static final RegistryObject<Item> FIREDRAGONBONENUNCHAKU = ITEMS.register("firedragonbonenunchaku",
            () -> new NunchakuItem(ModTiers.ZERONIUM, 0, -0.86f, new Item.Properties().tab(ModCreativeModeTab.ALTERED_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

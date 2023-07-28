package net.fidgetz.Altered.enchantment;

import net.fidgetz.Altered.Altered;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Altered.MOD_ID);
    public static RegistryObject<Enchantment> RUTHLESS =
            ENCHANTMENTS.register("ruthless",
                    () -> new RuthlessEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON,EquipmentSlot.MAINHAND));

    public static void register(IEventBus eventbus) {
        ENCHANTMENTS.register(eventbus);
    }
}

package net.fidgetz.Altered.enchantment;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.DamageEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;


public class RuthlessEnchantment extends Enchantment {

    protected RuthlessEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public void doPostHurt(LivingEntity pTarget, Entity pAttacker, int pLevel) {
        if(pLevel >= 1) { pTarget.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120), pAttacker); }
        if(pLevel >= 5) { pTarget.addEffect(new MobEffectInstance(MobEffects.WEAKNESS,80), pAttacker); }

    }
    @Override
    public float getDamageBonus(int pLevel, MobType pType, ItemStack enchantedItem) {
        return 1.0F + (float)Math.max(0, pLevel - 1) * 0.5F;
    }

    @Override
    public boolean isTreasureOnly() {
        return true;
    }
    @Override
    public boolean checkCompatibility(Enchantment pEnch) {
        return !(pEnch instanceof DamageEnchantment);
    }
    @Override
    public boolean canEnchant(ItemStack pStack) {
        return false;
    }
}

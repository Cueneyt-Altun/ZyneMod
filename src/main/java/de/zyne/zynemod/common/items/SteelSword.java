package de.zyne.zynemod.common.items;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class SteelSword implements Tier {

    public static float ATTACK_DAMAGE = 8;
    public static float ATTACK_SPEED = 1.0f;


    @Override
    public int getUses() {
        return 0;
    }

    @Override
    public float getSpeed() {

        float speed = -4 + ATTACK_SPEED;

        return speed;
    }

    @Override
    public float getAttackDamageBonus() {

        float damage = -4 + ATTACK_DAMAGE;

        return damage;
    }

    @Override
    public int getLevel() {
        return 2;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}

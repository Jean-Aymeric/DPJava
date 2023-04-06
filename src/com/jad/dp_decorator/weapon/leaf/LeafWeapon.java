package com.jad.dp_decorator.weapon.leaf;

import com.jad.dp_decorator.weapon.AttackType;
import com.jad.dp_decorator.weapon.Weapon;

public class LeafWeapon extends Weapon {
    private final String name;
    private final int damage;
    private final AttackType attackType;

    public LeafWeapon(String name, int damage, AttackType attackType) {
        super();
        this.name = name;
        this.damage = damage;
        this.attackType = attackType;
    }

    @Override
    public final String getName() {
        return this.name;
    }

    @Override
    public final int getDamage() {
        return this.damage;
    }

    @Override
    public final AttackType getAttackType() {
        return attackType;
    }
}

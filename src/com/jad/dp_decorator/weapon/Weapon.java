package com.jad.dp_decorator.weapon;

public abstract class Weapon implements IWeapon {
    @Override
    public final String attack() {
        return getName() + " " + this.getAttackType() + "(" + getDamage() + ") ";
    }
}

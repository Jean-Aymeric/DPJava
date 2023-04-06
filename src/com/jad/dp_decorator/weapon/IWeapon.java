package com.jad.dp_decorator.weapon;

public interface IWeapon {
    String getName();

    int getDamage();

    AttackType getAttackType();

    String attack();
}

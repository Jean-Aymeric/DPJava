package com.jad.dp_decorator.weapon.decorator;

import com.jad.dp_decorator.weapon.AttackType;
import com.jad.dp_decorator.weapon.IWeapon;

public class Cursed extends AbstractWeaponDecorator {
    public Cursed(final IWeapon weapon) {
        super(weapon);
    }

    @Override
    public String getDecoratedName() {
        return " maudit";
    }

    @Override
    public int getDecoratedDamage() {
        return 2;
    }

    @Override
    public AttackType getDecoratedAttackType() {
        return AttackType.Magic;
    }
}

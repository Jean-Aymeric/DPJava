package com.jad.dp_decorator.weapon.decorator;

import com.jad.dp_decorator.weapon.IWeapon;

public class BadQuality extends AbstractWeaponDecorator {
    public BadQuality(final IWeapon weapon) {
        super(weapon);
    }

    @Override
    public String getDecoratedName() {
        return " de mauvaise qualité";
    }

    @Override
    public int getDecoratedDamage() {
        return -1;
    }
}

package com.jad.dp_decorator.weapon.decorator;

import com.jad.dp_decorator.weapon.IWeapon;

public class GoodQuality extends AbstractWeaponDecorator {
    public GoodQuality(final IWeapon weapon) {
        super(weapon);
    }

    @Override
    public String getDecoratedName() {
        return " de bonne qualité";
    }

    @Override
    public int getDecoratedDamage() {
        return 1;
    }
}

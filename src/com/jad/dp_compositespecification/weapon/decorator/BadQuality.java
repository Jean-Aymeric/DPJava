package com.jad.dp_compositespecification.weapon.decorator;

import com.jad.dp_compositespecification.weapon.IWeapon;
import com.jad.dp_compositespecification.weapon.rule.GoodBadQualityRule;

public class BadQuality extends AbstractWeaponDecorator {
    public BadQuality(final IWeapon weapon) {
        super(weapon, "BadQuality", new GoodBadQualityRule());
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

package com.jad.dp_compositespecification.weapon.decorator;

import com.jad.dp_compositespecification.weapon.IWeapon;
import com.jad.dp_compositespecification.weapon.rule.GoodBadQualityRule;

public class GoodQuality extends AbstractWeaponDecorator {
    public GoodQuality(final IWeapon weapon) {
        super(weapon, "GoodQuality", new GoodBadQualityRule());
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

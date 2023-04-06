package com.jad.dp_compositespecification.weapon.rule;

import com.jad.dp_compositespecification.weapon.IWeapon;

public class FlamingRule extends WeaponRule {
    @Override
    public boolean isSatisfiedBy(final IWeapon weapon) {
        return new IsRule("Flaming").not().and(new IsRule("Sword").or(new IsRule("Dagger")).and(new IsRule("GoodQuality").or(new IsRule("BadQuality").not().and(new IsRule("Blessed").or(new IsRule("Cursed")))))).isSatisfiedBy(weapon);
    }
}

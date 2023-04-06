package com.jad.dp_compositespecification.weapon.decorator;

import com.jad.dp_compositespecification.weapon.AttackType;
import com.jad.dp_compositespecification.weapon.IWeapon;
import com.jad.dp_compositespecification.weapon.rule.BlessedCursedRule;

public class Blessed extends AbstractWeaponDecorator {
    public Blessed(final IWeapon weapon) {
        super(weapon, "Blessed", new BlessedCursedRule());
    }

    @Override
    public String getDecoratedName() {
        return " béni";
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

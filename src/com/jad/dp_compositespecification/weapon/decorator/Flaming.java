package com.jad.dp_compositespecification.weapon.decorator;

import com.jad.dp_compositespecification.weapon.AttackType;
import com.jad.dp_compositespecification.weapon.IWeapon;
import com.jad.dp_compositespecification.weapon.rule.FlamingRule;

public class Flaming extends AbstractWeaponDecorator {
    public Flaming(final IWeapon weapon) {
        super(weapon, "Flaming", new FlamingRule());
    }

    @Override
    public String getDecoratedName() {
        return " enflammé";
    }

    @Override
    public int getDecoratedDamage() {
        return 5;
    }

    @Override
    public AttackType getDecoratedAttackType() {
        return AttackType.Fire;
    }
}

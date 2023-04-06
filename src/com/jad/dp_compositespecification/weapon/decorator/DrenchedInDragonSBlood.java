package com.jad.dp_compositespecification.weapon.decorator;

import com.jad.dp_compositespecification.weapon.AttackType;
import com.jad.dp_compositespecification.weapon.IWeapon;
import com.jad.dp_compositespecification.weapon.rule.DrenchedInDragonSBloodRule;

public class DrenchedInDragonSBlood extends AbstractWeaponDecorator {
    public DrenchedInDragonSBlood(final IWeapon weapon) {
        super(weapon, "DrenchedInDragonSBlood", new DrenchedInDragonSBloodRule());
    }

    @Override
    public String getDecoratedName() {
        return " trempée dans du sang de dragon";
    }

    @Override
    public int getDecoratedDamage() {
        return 5;
    }

    @Override
    public AttackType getDecoratedAttackType() {
        return AttackType.Poison;
    }
}

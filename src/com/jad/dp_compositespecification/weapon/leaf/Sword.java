package com.jad.dp_compositespecification.weapon.leaf;

import com.jad.dp_compositespecification.weapon.AttackType;

public class Sword extends LeafWeapon {
    public Sword() {
        super("Sword", "Épée", 4, AttackType.Sharp);
    }
}
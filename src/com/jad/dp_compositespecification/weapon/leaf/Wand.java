package com.jad.dp_compositespecification.weapon.leaf;

import com.jad.dp_compositespecification.weapon.AttackType;

public class Wand extends LeafWeapon {
    public Wand() {
        super("Wand", "Baguette", 2, AttackType.Magic);
    }
}
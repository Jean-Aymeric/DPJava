package com.jad.dp_decorator.weapon.leaf;

import com.jad.dp_decorator.weapon.AttackType;

public class Sword extends LeafWeapon {
    public Sword() {
        super("Épée", 4, AttackType.Sharp);
    }
}
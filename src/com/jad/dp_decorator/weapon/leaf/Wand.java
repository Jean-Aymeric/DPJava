package com.jad.dp_decorator.weapon.leaf;

import com.jad.dp_decorator.weapon.AttackType;

public class Wand extends LeafWeapon {
    public Wand() {
        super("Baguette", 2, AttackType.Magic);
    }
}
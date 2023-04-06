package com.jad.dp_decorator;

import com.jad.dp_decorator.weapon.decorator.*;
import com.jad.dp_decorator.weapon.leaf.*;
import com.jad.dp_decorator.weapon.IWeapon;

public class Main {

    public static void main(String[] args) {
        IWeapon sword = new Cursed(new GoodQuality(new Sword()));
        IWeapon wand = new Blessed(new BadQuality(new Wand()));
        IWeapon axe = new DrenchedInDragonSBlood(new GoodQuality(new Axe()));
        IWeapon dagger = new Blessed(new DrenchedInDragonSBlood(new BadQuality(new Dagger())));

        System.out.println(sword.attack());
        System.out.println(wand.attack());
        System.out.println(axe.attack());
        System.out.println(dagger.attack());
    }
}

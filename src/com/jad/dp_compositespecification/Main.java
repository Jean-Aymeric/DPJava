package com.jad.dp_compositespecification;

import com.jad.dp_compositespecification.weapon.decorator.*;
import com.jad.dp_compositespecification.weapon.leaf.*;
import com.jad.dp_compositespecification.weapon.IWeapon;

public class Main {

    public static void main(String[] args) {
        try {
            IWeapon sword = new Flaming(new GoodQuality(new Cursed(new Sword())));
            //IWeapon wand = new DrenchedInDragonSBlood(new Blessed(new BadQuality(new Wand())));
            IWeapon axe = new DrenchedInDragonSBlood(new GoodQuality(new Axe()));
            IWeapon dagger = new Blessed(new DrenchedInDragonSBlood(new BadQuality(new Dagger())));
            System.out.println(sword.attack());
            //System.out.println(wand.attack());
            System.out.println(axe.attack());
            System.out.println(dagger.attack());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

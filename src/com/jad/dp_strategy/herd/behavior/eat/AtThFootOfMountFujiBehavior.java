package com.jad.dp_strategy.herd.behavior.eat;

public class AtThFootOfMountFujiBehavior extends EatBehavior {
    @Override
    public void eat() {
        System.out.println(this.getCow().getName() + " mange de l'herbe au pied du mont Fuji");
    }
}

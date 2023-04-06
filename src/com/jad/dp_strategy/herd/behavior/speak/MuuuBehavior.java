package com.jad.dp_strategy.herd.behavior.speak;

public class MuuuBehavior extends SpeakBehavior{
    @Override
    public void speak() {
        System.out.println(this.getCow().getName() + " : Muuu");
    }
}

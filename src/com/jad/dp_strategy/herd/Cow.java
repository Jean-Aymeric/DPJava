package com.jad.dp_strategy.herd;

import com.jad.dp_strategy.herd.behavior.eat.EatBehavior;
import com.jad.dp_strategy.herd.behavior.speak.SpeakBehavior;

public abstract class Cow {
    private final String name;
    private EatBehavior eatBehavior;
    private SpeakBehavior speakBehavior;

    protected Cow(final String name, final EatBehavior eatBehavior, final SpeakBehavior speakBehavior) {
        this.name = name;
        this.setEatBehavior(eatBehavior);
        this.setSpeakBehavior(speakBehavior);
    }

    public final void eat() {
        this.eatBehavior.eat();
    }
    public final void speak(){
        this.speakBehavior.speak();
    }

    public String getName() {
        return name;
    }

    public final EatBehavior getEatBehavior() {
        return (EatBehavior) this.eatBehavior.clone();
    }

    public final void setEatBehavior(final EatBehavior eatBehavior) {
        this.eatBehavior = eatBehavior;
        if (eatBehavior.getCow() != this) {
            eatBehavior.setCow(this);
        }
    }

    public final SpeakBehavior getSpeakBehavior() {
        return (SpeakBehavior) this.speakBehavior.clone();
    }

    public final void setSpeakBehavior(final SpeakBehavior speakBehavior) {
        this.speakBehavior = speakBehavior;
        if (speakBehavior.getCow() != this) {
            speakBehavior.setCow(this);
        }
    }
}

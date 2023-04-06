package com.jad.dp_strategy.herd;

import com.jad.dp_strategy.herd.behavior.eat.InThePastureBehavior;
import com.jad.dp_strategy.herd.behavior.speak.MeuhBehavior;

public class FrenchCow extends Cow {
    public FrenchCow(final String name) {
        super(name, new InThePastureBehavior(), new MeuhBehavior());
    }
}

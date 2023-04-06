package com.jad.dp_strategy.herd;

import com.jad.dp_strategy.herd.behavior.eat.InThePastureBehavior;
import com.jad.dp_strategy.herd.behavior.speak.MuuuBehavior;

public class SpanishCow extends Cow {
    public SpanishCow(final String name) {
        super(name, new InThePastureBehavior(), new MuuuBehavior());
    }
}

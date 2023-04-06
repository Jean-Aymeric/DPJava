package com.jad.dp_strategy.herd;

import com.jad.dp_strategy.herd.behavior.eat.InThePastureBehavior;
import com.jad.dp_strategy.herd.behavior.speak.MooBehavior;

public class EnglishCow extends Cow {
    public EnglishCow(final String name) {
        super(name, new InThePastureBehavior(), new MooBehavior());
    }
}

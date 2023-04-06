package com.jad.dp_strategy.herd;

import com.jad.dp_strategy.herd.behavior.eat.AtThFootOfMountFujiBehavior;
import com.jad.dp_strategy.herd.behavior.speak.MouBehavior;

public class JapanCow extends Cow {
    public JapanCow(final String name) {
        super(name, new AtThFootOfMountFujiBehavior(), new MouBehavior());
    }
}

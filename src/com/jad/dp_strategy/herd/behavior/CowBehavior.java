package com.jad.dp_strategy.herd.behavior;

import com.jad.dp_strategy.herd.Cow;

public abstract class CowBehavior implements Cloneable {
    private Cow cow;

    public Cow getCow() {
        return cow;
    }

    public void setCow(final Cow cow) {
        this.cow = cow;
    }

    public CowBehavior clone() {
        try {
            return (CowBehavior) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

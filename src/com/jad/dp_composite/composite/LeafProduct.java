package com.jad.dp_composite.composite;

public class LeafProduct extends Product {
    public LeafProduct(final String name) {
        super(name);
    }

    @Override
    protected final String toStringExtended() {
        return "";
    }
}

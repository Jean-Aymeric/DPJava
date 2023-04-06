package com.jad.dp_adapter.productadapter;

import com.jad.dp_adapter.composite.IProduct;
import com.jad.dp_adapter.productadapter.antiqua.Saponem;

public class SaponemAdapter implements IProduct {
    private final Saponem saponem = new Saponem();

    @Override
    public String getName() {
        return new String(this.saponem.nomen);
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
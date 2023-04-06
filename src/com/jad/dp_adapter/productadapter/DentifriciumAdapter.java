package com.jad.dp_adapter.productadapter;

import com.jad.dp_adapter.composite.IProduct;
import com.jad.dp_adapter.productadapter.antiqua.Dentifricium;

public class DentifriciumAdapter implements IProduct {
    private final Dentifricium dentifricium = new Dentifricium();

    @Override
    public String getName() {
        return new String(this.dentifricium.nomen);
    }

    @Override
    public String toString() {
        return this.getName();
    }
}

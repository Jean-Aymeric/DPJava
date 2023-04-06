package com.jad.dp_chainofresponsibility.product.operation;

public abstract class Operation {
    private final String name;

    protected Operation(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

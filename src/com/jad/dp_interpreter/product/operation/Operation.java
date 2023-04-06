package com.jad.dp_interpreter.product.operation;

public abstract class Operation {
    private final String name;

    protected Operation(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

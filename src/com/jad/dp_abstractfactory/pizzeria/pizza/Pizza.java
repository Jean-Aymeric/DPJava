package com.jad.dp_abstractfactory.pizzeria.pizza;

import com.jad.dp_abstractfactory.pizzeria.Product;

public abstract class Pizza extends Product {
    protected Pizza(final String name) {
        super("Pizza", name);
    }
}

package com.jad.dp_proxy.pizzeria.pizza;

import com.jad.dp_proxy.pizzeria.Product;

public abstract class Pizza extends Product {
    protected Pizza(final String name) {
        super("Pizza", name);
    }
}

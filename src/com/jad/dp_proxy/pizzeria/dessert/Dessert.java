package com.jad.dp_proxy.pizzeria.dessert;

import com.jad.dp_proxy.pizzeria.Product;

public abstract class Dessert extends Product {
    public Dessert(final String name) {
        super("Dessert", name);
    }
}

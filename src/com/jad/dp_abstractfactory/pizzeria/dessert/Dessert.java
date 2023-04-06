package com.jad.dp_abstractfactory.pizzeria.dessert;

import com.jad.dp_abstractfactory.pizzeria.Product;

public abstract class Dessert extends Product {
    public Dessert(final String name) {
        super("Dessert", name);
    }
}

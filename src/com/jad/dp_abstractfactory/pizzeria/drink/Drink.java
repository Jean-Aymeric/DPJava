package com.jad.dp_abstractfactory.pizzeria.drink;

import com.jad.dp_abstractfactory.pizzeria.Product;

public abstract class Drink extends Product {
    public Drink(final String name) {
        super("Boisson", name);
    }
}

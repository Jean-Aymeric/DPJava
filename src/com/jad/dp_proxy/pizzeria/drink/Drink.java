package com.jad.dp_proxy.pizzeria.drink;

import com.jad.dp_proxy.pizzeria.Product;

public abstract class Drink extends Product {
    public Drink(final String name) {
        super("Boisson", name);
    }
}

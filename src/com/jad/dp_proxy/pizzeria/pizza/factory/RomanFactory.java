package com.jad.dp_proxy.pizzeria.pizza.factory;

import com.jad.dp_proxy.pizzeria.pizza.Pizza;
import com.jad.dp_proxy.pizzeria.pizza.Roman;

public final class RomanFactory extends PizzaFactory {
    public RomanFactory() {
        super("Romaine");
    }

    @Override
    public Pizza make() {
        return new Roman();
    }
}

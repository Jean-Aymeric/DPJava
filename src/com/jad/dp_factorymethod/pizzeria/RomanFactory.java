package com.jad.dp_factorymethod.pizzeria;

import com.jad.dp_factorymethod.pizzeria.pizza.Pizza;
import com.jad.dp_factorymethod.pizzeria.pizza.Roman;

final class RomanFactory extends PizzaFactory {
    RomanFactory() {
        super("Romaine");
    }

    @Override
    public Pizza make() {
        return new Roman();
    }
}

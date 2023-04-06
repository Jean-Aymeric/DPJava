package com.jad.dp_factorymethod.pizzeria;

import com.jad.dp_factorymethod.pizzeria.pizza.Neapolitan;
import com.jad.dp_factorymethod.pizzeria.pizza.Pizza;

final class NeapolitanFactory extends PizzaFactory {
    NeapolitanFactory() {
        super("Napolitaine");
    }

    @Override
    public Pizza make() {
        return new Neapolitan();
    }
}

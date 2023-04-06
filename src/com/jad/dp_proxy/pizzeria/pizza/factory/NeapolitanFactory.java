package com.jad.dp_proxy.pizzeria.pizza.factory;

import com.jad.dp_proxy.pizzeria.pizza.Neapolitan;
import com.jad.dp_proxy.pizzeria.pizza.Pizza;

public final class NeapolitanFactory extends PizzaFactory {
    public NeapolitanFactory() {
        super("Napolitaine");
    }

    @Override
    public Pizza make() {
        return new Neapolitan();
    }
}

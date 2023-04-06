package com.jad.dp_abstractfactory.pizzeria.pizza.factory;

import com.jad.dp_abstractfactory.pizzeria.pizza.Pizza;
import com.jad.dp_abstractfactory.pizzeria.pizza.Roman;

public final class RomanFactory extends PizzaFactory {
    public RomanFactory() {
        super("Romaine");
    }

    @Override
    public Pizza make() {
        return new Roman();
    }
}

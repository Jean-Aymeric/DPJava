package com.jad.dp_factorymethod.pizzeria;

import com.jad.dp_factorymethod.pizzeria.pizza.FourCheeses;
import com.jad.dp_factorymethod.pizzeria.pizza.Pizza;

final class FourCheesesFactory extends PizzaFactory {
    FourCheesesFactory() {
        super("4 fromages");
    }

    @Override
    public Pizza make() {
        return new FourCheeses();
    }
}

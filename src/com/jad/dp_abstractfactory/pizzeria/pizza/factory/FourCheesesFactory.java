package com.jad.dp_abstractfactory.pizzeria.pizza.factory;

import com.jad.dp_abstractfactory.pizzeria.pizza.FourCheeses;
import com.jad.dp_abstractfactory.pizzeria.pizza.Pizza;

public final class FourCheesesFactory extends PizzaFactory {
    public FourCheesesFactory() {
        super("4 fromages");
    }

    @Override
    public Pizza make() {
        return new FourCheeses();
    }
}

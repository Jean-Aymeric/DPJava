package com.jad.dp_proxy.pizzeria.pizza.factory;

import com.jad.dp_proxy.pizzeria.pizza.FourCheeses;
import com.jad.dp_proxy.pizzeria.pizza.Pizza;

public final class FourCheesesFactory extends PizzaFactory {
    public FourCheesesFactory() {
        super("4 fromages");
    }

    @Override
    public Pizza make() {
        return new FourCheeses();
    }
}

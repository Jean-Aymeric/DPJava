package com.jad.dp_proxy.pizzeria.pizza.factory;

import com.jad.dp_proxy.pizzeria.pizza.Pizza;
import com.jad.dp_proxy.pizzeria.pizza.Vegetarian;

public final class VegetarianFactory extends PizzaFactory {
    public VegetarianFactory() {
        super("Végétarienne");
    }

    @Override
    public Pizza make() {
        return new Vegetarian();
    }
}

package com.jad.dp_proxy.pizzeria.pizza.factory;

import com.jad.dp_proxy.pizzeria.ProductFactory;
import com.jad.dp_proxy.pizzeria.pizza.Pizza;

public abstract class PizzaFactory extends ProductFactory {
    protected PizzaFactory(final String pizzaNameMade) {
        super(pizzaNameMade);
    }

    public final String getPizzaNameMade() {
        return this.getProductNameMade();
    }

    @Override
    public abstract Pizza make();

    public final boolean isPizzaNameMade(String pizzaNameMade) {
        return this.isProductNameMade(pizzaNameMade);
    }
}

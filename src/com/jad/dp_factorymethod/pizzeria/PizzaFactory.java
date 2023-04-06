package com.jad.dp_factorymethod.pizzeria;

import com.jad.dp_factorymethod.pizzeria.pizza.Pizza;

public abstract class PizzaFactory {
    private final String pizzaNameMade;

    protected PizzaFactory(final String pizzaNameMade) {
        this.pizzaNameMade = pizzaNameMade;
    }

    public abstract Pizza make();

    public String getPizzaNameMade() {
        return pizzaNameMade;
    }

    public boolean isPizzaNameMade(String pizzaNameMade) {
        return this.pizzaNameMade.equals(pizzaNameMade);
    }
}

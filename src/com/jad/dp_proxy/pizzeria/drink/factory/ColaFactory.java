package com.jad.dp_proxy.pizzeria.drink.factory;

import com.jad.dp_proxy.pizzeria.drink.Cola;
import com.jad.dp_proxy.pizzeria.drink.Drink;

public class ColaFactory extends DrinkFactory{
    public ColaFactory() {
        super("cola");
    }

    @Override
    public Drink make() {
        return new Cola();
    }
}

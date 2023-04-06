package com.jad.dp_abstractfactory.pizzeria.drink.factory;

import com.jad.dp_abstractfactory.pizzeria.drink.Cola;
import com.jad.dp_abstractfactory.pizzeria.drink.Drink;

public class ColaFactory extends DrinkFactory{
    public ColaFactory() {
        super("cola");
    }

    @Override
    public Drink make() {
        return new Cola();
    }
}

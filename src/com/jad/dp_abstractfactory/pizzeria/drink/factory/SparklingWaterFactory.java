package com.jad.dp_abstractfactory.pizzeria.drink.factory;

import com.jad.dp_abstractfactory.pizzeria.drink.Drink;
import com.jad.dp_abstractfactory.pizzeria.drink.SparklingWater;

public class SparklingWaterFactory extends DrinkFactory{
    public SparklingWaterFactory() {
        super("eau gazeuse");
    }

    @Override
    public Drink make() {
        return new SparklingWater();
    }
}

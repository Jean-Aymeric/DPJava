package com.jad.dp_abstractfactory.pizzeria.dessert.factory;

import com.jad.dp_abstractfactory.pizzeria.dessert.Dessert;
import com.jad.dp_abstractfactory.pizzeria.dessert.Donut;

public class DonutFactory extends DessertFactory {
    public DonutFactory() {
        super("donut");
    }

    @Override
    public Dessert make() {
        return new Donut();
    }
}

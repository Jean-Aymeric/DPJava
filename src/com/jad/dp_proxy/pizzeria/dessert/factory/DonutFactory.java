package com.jad.dp_proxy.pizzeria.dessert.factory;

import com.jad.dp_proxy.pizzeria.dessert.Dessert;
import com.jad.dp_proxy.pizzeria.dessert.Donut;

public class DonutFactory extends DessertFactory {
    public DonutFactory() {
        super("donut");
    }

    @Override
    public Dessert make() {
        return new Donut();
    }
}

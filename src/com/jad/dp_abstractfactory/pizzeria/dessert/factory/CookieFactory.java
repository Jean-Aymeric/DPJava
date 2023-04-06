package com.jad.dp_abstractfactory.pizzeria.dessert.factory;

import com.jad.dp_abstractfactory.pizzeria.dessert.Cookie;
import com.jad.dp_abstractfactory.pizzeria.dessert.Dessert;

public class CookieFactory extends DessertFactory {
    public CookieFactory() {
        super("cookie");
    }

    @Override
    public Dessert make() {
        return new Cookie();
    }
}

package com.jad.dp_proxy;

import com.jad.dp_proxy.pizzeria.IPizzeria;
import com.jad.dp_proxy.pizzeria.dessert.Dessert;
import com.jad.dp_proxy.pizzeria.drink.Drink;
import com.jad.dp_proxy.pizzeria.pizza.Pizza;

import java.util.Random;

public class Client {
    public void eat(final IPizzeria pizzeria) {
        Pizza pizza = pizzeria.makePizza(pizzeria.getPizzaMenu().get(new Random().nextInt(pizzeria.getPizzaMenu().size())));
        Drink drink = pizzeria.makeDrink(pizzeria.getDrinkMenu().get(new Random().nextInt(pizzeria.getDrinkMenu().size())));
        Dessert dessert = pizzeria.makeDessert(pizzeria.getDessertMenu().get(new Random().nextInt(pizzeria.getDessertMenu().size())));
        System.out.println("Je mange une " + pizza + " en buvant " + drink + " en je finirais avec un " + dessert);
    }
}

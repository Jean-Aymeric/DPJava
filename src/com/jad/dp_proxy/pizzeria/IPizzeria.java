package com.jad.dp_proxy.pizzeria;

import com.jad.dp_proxy.pizzeria.dessert.Dessert;
import com.jad.dp_proxy.pizzeria.dessert.factory.DessertFactory;
import com.jad.dp_proxy.pizzeria.drink.Drink;
import com.jad.dp_proxy.pizzeria.drink.factory.DrinkFactory;
import com.jad.dp_proxy.pizzeria.pizza.Pizza;
import com.jad.dp_proxy.pizzeria.pizza.factory.PizzaFactory;

import java.util.ArrayList;

public interface IPizzeria {
    Product make(String productName);

    Pizza makePizza(String pizzaName);

    Drink makeDrink(String drinkName);

    Dessert makeDessert(String dessertName);

    PizzaFactory getPizzaFactory(String pizzaNameMade);

    DrinkFactory getDrinkFactory(String drinkNameMade);

    DessertFactory getDessertFactory(String dessertNameMade);

    ArrayList<String> getPizzaMenu();

    ArrayList<String> getDrinkMenu();

    ArrayList<String> getDessertMenu();

    PizzaFactory getFourCheeseFactory();

    PizzaFactory getNeapolitanFactory();

    PizzaFactory getRomanFactory();

    void addPizzaFactory(PizzaFactory pizzaFactory);

    DessertFactory getCookieFactory();

    DessertFactory getDonutFactory();

    DrinkFactory getColaFactory();

    DrinkFactory getSparklingWaterFactory();
}

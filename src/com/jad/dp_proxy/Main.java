package com.jad.dp_proxy;

import com.jad.dp_proxy.pizzeria.IPizzeria;
import com.jad.dp_proxy.pizzeria.Pizzeria;

public class Main {

    public static void main(String[] args) {
        IPizzeria pizzeria = Pizzeria.getInstance();
        Client client = new Client();
        for (int i = 0; i < 10; i++) {
            client.eat(pizzeria);
        }
    }
}

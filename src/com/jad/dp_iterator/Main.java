package com.jad.dp_iterator;

import com.jad.dp_iterator.composite.CompositeProduct;
import com.jad.dp_iterator.composite.IProduct;
import com.jad.dp_iterator.composite.LeafProduct;

public class Main {

    public static void main(String[] args) {
        CompositeProduct cart = new CompositeProduct("Panier");
        CompositeProduct jewelryBox = new CompositeProduct("Coffret");
        cart.addProduct(new LeafProduct("Brosse à dent"));
        cart.addProduct(new LeafProduct("Dentifrice"));
        cart.addProduct(jewelryBox);
        jewelryBox.addProduct(new LeafProduct("Bague"));
        jewelryBox.addProduct(new LeafProduct("Collier"));
        System.out.println(cart);

        for (IProduct product : cart) {
            System.out.println(product.getName());
        }
    }
}

package com.jad.dp_adapter;

import com.jad.dp_adapter.composite.CompositeProduct;
import com.jad.dp_adapter.composite.ICompositeProduct;
import com.jad.dp_adapter.composite.LeafProduct;
import com.jad.dp_adapter.productadapter.CapsulaAdapter;
import com.jad.dp_adapter.productadapter.DentifriciumAdapter;
import com.jad.dp_adapter.productadapter.SaponemAdapter;

public class Main {

    public static void main(String[] args) {
        ICompositeProduct cart = new CompositeProduct("Panier");
        ICompositeProduct jewelryBox = new CompositeProduct("Coffret");
        cart.addProduct(new LeafProduct("Brosse à dent"));
        cart.addProduct(new LeafProduct("Dentifrice"));
        cart.addProduct(jewelryBox);
        jewelryBox.addProduct(new LeafProduct("Bague"));
        jewelryBox.addProduct(new LeafProduct("Collier"));
        cart.addProduct(new DentifriciumAdapter());
        ICompositeProduct capsula = new CapsulaAdapter();
        LeafProduct earrings = new LeafProduct("Boucles d'oreille");
        capsula.addProduct(earrings);
        capsula.addProduct(new LeafProduct("Anneau"));
        capsula.addProduct(new SaponemAdapter());
        cart.addProduct(capsula);
        System.out.println(cart);
        capsula.removeProduct(earrings);
        System.out.println(cart);
    }
}

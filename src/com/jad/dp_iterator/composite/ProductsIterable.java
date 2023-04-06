package com.jad.dp_iterator.composite;

import java.util.LinkedList;

public class ProductsIterable extends LinkedList<IProduct> {
    public ProductsIterable(final IProduct product) {
        this.add(product);
    }

    public ProductsIterable(final ProductsIterable iterator) {
        this.addAll(iterator);
    }
}

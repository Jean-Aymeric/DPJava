package com.jad.dp_chainofresponsibility.product.leaf;

import com.jad.dp_chainofresponsibility.product.Product;

public abstract class LeafProduct extends Product {
    protected LeafProduct(final String name, final char color) {
        super(name, 4, 4, name + " de couleur " + color);
        this.buildImage(color);
    }

    protected LeafProduct(final String name) {
        this(name, Product.EmptyPixel);
    }

    public void setColor(final char color) {
        this.buildImage(color);
    }

    protected abstract void buildImage(final char color);


}

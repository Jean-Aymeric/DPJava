package com.jad.dp_chainofresponsibility.product.leaf;

import com.jad.dp_chainofresponsibility.product.Product;

public class Cross extends LeafProduct {
    public Cross(final char color) {
        super("Croix", color);
    }

    public Cross() {
        this(Product.EmptyPixel);
    }

    @Override
    protected void buildImage(final char color) {
        for (int column = 0; column < getWidth(); column++) {
            for (int row = 0; row < getHeight(); row++) {
                if ((column == row) || (column == (getWidth() - row - 1))) {
                    this.setPixel(row, column, color);
                } else {
                    this.setPixel(row, column, Product.EmptyPixel);
                }
            }
        }

    }
}


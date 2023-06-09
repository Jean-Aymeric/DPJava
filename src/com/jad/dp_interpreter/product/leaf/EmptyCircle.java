package com.jad.dp_interpreter.product.leaf;

import com.jad.dp_interpreter.product.Product;

public class EmptyCircle extends LeafProduct {
    public EmptyCircle(final char color) {
        super("Cercle vide", color);
    }

    @Override
    protected void buildImage(final char color) {
        for (int column = 0; column < getWidth(); column++) {
            for (int row = 0; row < getHeight(); row++) {
                if ((((column == 0) || (column == getWidth() - 1) || (row == 0) || (row == getHeight() - 1)))
                        && ! (((column == 0) || (column == getWidth() - 1)) && ((row == 0) || (row == getHeight() - 1)))) {
                    this.setPixel(row, column, color);
                } else {
                    this.setPixel(row, column, Product.EmptyPixel);
                }
            }
        }
    }
}


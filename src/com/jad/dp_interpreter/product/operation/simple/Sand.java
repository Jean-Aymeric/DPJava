package com.jad.dp_interpreter.product.operation.simple;

import com.jad.dp_interpreter.product.IProduct;
import com.jad.dp_interpreter.product.Product;

public class Sand extends SimpleOperation {
    public Sand() {
        super("poncé");
    }

    @Override
    protected boolean isApplicable(final IProduct product, final int row, final int column) {
        return product.getPixel(row, column) != Product.EmptyPixel;
    }

    @Override
    protected char getPixelTransformation(final char pixel) {
        return Character.toLowerCase(pixel);
    }
}

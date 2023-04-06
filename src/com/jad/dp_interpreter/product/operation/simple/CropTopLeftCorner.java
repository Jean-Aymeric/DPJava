package com.jad.dp_interpreter.product.operation.simple;

import com.jad.dp_interpreter.product.IProduct;
import com.jad.dp_interpreter.product.Product;

public class CropTopLeftCorner extends SimpleOperation {
    public CropTopLeftCorner() {
        super("coin haut droit coupé");
    }

    @Override
    protected boolean isApplicable(final IProduct product, final int row, final int column) {
        return ((column < 2) && (row < 2));
    }

    @Override
    protected char getPixelTransformation(final char pixel) {
        return Product.EmptyPixel;
    }
}

package com.jad.dp_interpreter.product.operation.simple;

import com.jad.dp_interpreter.product.IProduct;
import com.jad.dp_interpreter.product.Product;

public class CutTheRight extends SimpleOperation {
    public CutTheRight() {
        super("droit coupé");
    }

    @Override
    protected boolean isApplicable(final IProduct product, final int row, final int column) {
        return column == (product.getHeight() - 1);
    }

    @Override
    protected char getPixelTransformation(final char pixel) {
        return Product.EmptyPixel;
    }
}

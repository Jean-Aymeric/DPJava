package com.jad.dp_chainofresponsibility.product.operation.simple;

import com.jad.dp_chainofresponsibility.product.IProduct;
import com.jad.dp_chainofresponsibility.product.Product;

public class CutTheLeft extends SimpleOperation {
    public CutTheLeft() {
        super("gauche coupé");
    }

    @Override
    protected boolean isApplicable(final IProduct product, final int row, final int column) {
        return column == 0;
    }

    @Override
    protected char getPixelTransformation(final char pixel) {
        return Product.EmptyPixel;
    }
}

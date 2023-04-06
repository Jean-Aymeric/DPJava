package com.jad.dp_chainofresponsibility.product.operation.simple;

import com.jad.dp_chainofresponsibility.product.IProduct;
import com.jad.dp_chainofresponsibility.product.Product;

public class CutTheTop extends SimpleOperation {
    public CutTheTop() {
        super("haut coupé");
    }

    @Override
    protected boolean isApplicable(final IProduct product, final int row, final int column) {
        return row == 0;
    }

    @Override
    protected char getPixelTransformation(final char pixel) {
        return Product.EmptyPixel;
    }
}

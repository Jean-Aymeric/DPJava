package com.jad.dp_chainofresponsibility.product.operation.simple;

import com.jad.dp_chainofresponsibility.product.IProduct;
import com.jad.dp_chainofresponsibility.product.Product;

public class CropTopRightCorner extends SimpleOperation {
    public CropTopRightCorner() {
        super("coin haut droit coupé");
    }

    @Override
    protected boolean isApplicable(final IProduct product, final int row, final int column) {
        return ((column >= product.getWidth()-2) && (row < 2));
    }

    @Override
    protected char getPixelTransformation(final char pixel) {
        return Product.EmptyPixel;
    }
}

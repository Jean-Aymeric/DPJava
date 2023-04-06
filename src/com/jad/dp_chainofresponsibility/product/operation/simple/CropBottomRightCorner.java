package com.jad.dp_chainofresponsibility.product.operation.simple;

import com.jad.dp_chainofresponsibility.product.IProduct;
import com.jad.dp_chainofresponsibility.product.Product;

public class CropBottomRightCorner extends SimpleOperation {
    public CropBottomRightCorner() {
        super("coin bas droit coupé");
    }

    @Override
    protected boolean isApplicable(final IProduct product, final int row, final int column) {
        return (column >= product.getWidth()-2) && (row >= product.getHeight()-2);
    }

    @Override
    protected char getPixelTransformation(final char pixel) {
        return Product.EmptyPixel;
    }
}

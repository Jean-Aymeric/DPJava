package com.jad.dp_interpreter.product.operation.simple;

import com.jad.dp_interpreter.product.IProduct;
import com.jad.dp_interpreter.product.Product;

public class CutTheBottom extends SimpleOperation {
    public CutTheBottom() {
        super("bas coupé");
    }

    @Override
    protected boolean isApplicable(final IProduct product, final int row, final int column) {
        return row == (product.getWidth() - 1);
    }

    @Override
    protected char getPixelTransformation(final char pixel) {
        return Product.EmptyPixel;
    }
}

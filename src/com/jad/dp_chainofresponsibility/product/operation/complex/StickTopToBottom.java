package com.jad.dp_chainofresponsibility.product.operation.complex;

import com.jad.dp_chainofresponsibility.product.IProduct;
import com.jad.dp_chainofresponsibility.product.Product;

public class StickTopToBottom extends ComplexOperation{
    public StickTopToBottom() {
        super("Collé de haut en bas");
    }

    @Override
    protected boolean isApplicable(final int row, final int column, final IProduct... products) {
        return true;
    }

    @Override
    protected char getPixelTransformation(final int row, final int column, final IProduct... products) {
        int actualHeight = 0;
        for(IProduct product : products) {
            if(row < actualHeight + product.getHeight()) {
                return product.getPixel(row - actualHeight, column);
            }
            actualHeight += product.getHeight();
        }
        return Product.EmptyPixel;
    }

    @Override
    protected void setNewProductSize(IProduct result, final IProduct... products) {
        int newHeight = 0;
        int newWidth = 0;
        for(IProduct product : products) {
            newHeight += product.getHeight();
            newWidth = Math.max(newWidth, product.getWidth());
        }
        result.setHeight(newHeight);
        result.setWidth(newWidth);
    }
}

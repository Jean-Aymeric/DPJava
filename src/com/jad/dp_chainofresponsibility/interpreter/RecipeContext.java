package com.jad.dp_chainofresponsibility.interpreter;

import com.jad.dp_chainofresponsibility.product.IProduct;

public class RecipeContext {
    private IProduct product;

    public RecipeContext(final IProduct product) {
        this.product = product;
    }

    public RecipeContext() {
        this(null);
    }

    public IProduct getProduct() {
        return product;
    }

    public void setProduct(final IProduct product) {
        this.product = product;
    }
}

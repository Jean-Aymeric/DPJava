package com.jad.dp_chainofresponsibility.interpreter;

import com.jad.dp_chainofresponsibility.product.IProduct;

public class ProductExpression implements RecipeExpression {
    private final IProduct product;

    public ProductExpression(final IProduct product) {
        this.product = product;
    }

    @Override
    public void interpret(final RecipeContext context) {
        context.setProduct(this.product);
    }
}

package com.jad.dp_chainofresponsibility.product.recipeparser;

import com.jad.dp_chainofresponsibility.interpreter.ProductExpression;
import com.jad.dp_chainofresponsibility.interpreter.RecipeExpression;
import com.jad.dp_chainofresponsibility.product.composite.CompositeProduct;

class CompositeProductExpressionHandler extends RecipeTokenHandler {
    private final CompositeProduct product;

    public CompositeProductExpressionHandler(final String token, final CompositeProduct product) {
        super(token);
        this.product = product;
    }

    @Override
    public RecipeExpression handle(final RecipeTree recipeTree) {
        if (recipeTree.getToken().equals(this.getToken())) {
            return new ProductExpression(this.product);
        }
        return this.hasNextHandler() ? this.getNextHandler().handle(recipeTree) : null;
    }
}

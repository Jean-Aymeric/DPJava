package com.jad.dp_chainofresponsibility.product.composite;

import com.jad.dp_chainofresponsibility.interpreter.RecipeExpression;
import com.jad.dp_chainofresponsibility.product.Product;

public abstract class CompositeProduct extends Product {
    public CompositeProduct(final String name, final RecipeExpression recipe) {
        super(name, recipe);
    }
}

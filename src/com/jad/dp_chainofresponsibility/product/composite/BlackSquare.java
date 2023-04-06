package com.jad.dp_chainofresponsibility.product.composite;

import com.jad.dp_chainofresponsibility.interpreter.ProductExpression;
import com.jad.dp_chainofresponsibility.product.leaf.FilledSquare;

public class BlackSquare extends CompositeProduct {
    public BlackSquare() {
        super("Carré noir", new ProductExpression(new FilledSquare('O')));
    }
}

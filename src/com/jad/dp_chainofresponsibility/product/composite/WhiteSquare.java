package com.jad.dp_chainofresponsibility.product.composite;

import com.jad.dp_chainofresponsibility.interpreter.ProductExpression;
import com.jad.dp_chainofresponsibility.product.leaf.FilledSquare;

public class WhiteSquare extends CompositeProduct {
    public WhiteSquare() {
        super("Carré blanc", new ProductExpression(new FilledSquare(' ')));
    }
}

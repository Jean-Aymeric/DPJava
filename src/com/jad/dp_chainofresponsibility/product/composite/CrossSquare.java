package com.jad.dp_chainofresponsibility.product.composite;

import com.jad.dp_chainofresponsibility.interpreter.ComplexOperationExpression;
import com.jad.dp_chainofresponsibility.interpreter.ProductExpression;
import com.jad.dp_chainofresponsibility.product.leaf.Cross;
import com.jad.dp_chainofresponsibility.product.leaf.FilledSquare;
import com.jad.dp_chainofresponsibility.product.operation.complex.Stack;

public class CrossSquare extends CompositeProduct {
    public CrossSquare() {
        super("Croix", new ComplexOperationExpression(new Stack(),new ProductExpression(new FilledSquare(' ')), new ProductExpression(new Cross('X'))));
    }
}

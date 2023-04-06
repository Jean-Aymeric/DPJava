package com.jad.dp_chainofresponsibility.product.composite;

import com.jad.dp_chainofresponsibility.interpreter.ComplexOperationExpression;
import com.jad.dp_chainofresponsibility.interpreter.ProductExpression;
import com.jad.dp_chainofresponsibility.product.leaf.EmptyCircle;
import com.jad.dp_chainofresponsibility.product.leaf.FilledSquare;
import com.jad.dp_chainofresponsibility.product.operation.complex.Stack;

public class CircleSquare extends CompositeProduct {
    public CircleSquare() {
        super("Cercle", new ComplexOperationExpression(new Stack(),new ProductExpression(new FilledSquare(' ')), new ProductExpression(new EmptyCircle('O'))));
    }
}

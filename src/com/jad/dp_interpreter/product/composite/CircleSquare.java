package com.jad.dp_interpreter.product.composite;

import com.jad.dp_interpreter.interpreter.ComplexOperationExpression;
import com.jad.dp_interpreter.interpreter.ProductExpression;
import com.jad.dp_interpreter.product.Product;
import com.jad.dp_interpreter.product.leaf.EmptyCircle;
import com.jad.dp_interpreter.product.leaf.FilledSquare;
import com.jad.dp_interpreter.product.operation.complex.Stack;

public class CircleSquare extends Product {
    public CircleSquare() {
        super("Cercle", new ComplexOperationExpression(new Stack(),new ProductExpression(new FilledSquare(' ')), new ProductExpression(new EmptyCircle('O'))));
    }
}

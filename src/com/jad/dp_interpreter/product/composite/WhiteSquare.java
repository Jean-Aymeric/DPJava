package com.jad.dp_interpreter.product.composite;

import com.jad.dp_interpreter.interpreter.ProductExpression;
import com.jad.dp_interpreter.product.Product;
import com.jad.dp_interpreter.product.leaf.FilledSquare;

public class WhiteSquare extends Product {
    public WhiteSquare() {
        super("Carré blanc", new ProductExpression(new FilledSquare(' ')));
    }
}

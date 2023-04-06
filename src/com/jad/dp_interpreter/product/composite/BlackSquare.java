package com.jad.dp_interpreter.product.composite;

import com.jad.dp_interpreter.interpreter.ProductExpression;
import com.jad.dp_interpreter.product.Product;
import com.jad.dp_interpreter.product.leaf.FilledSquare;

public class BlackSquare extends Product {
    public BlackSquare() {
        super("Carré noir", new ProductExpression(new FilledSquare('O')));
    }
}

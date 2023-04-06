package com.jad.dp_chainofresponsibility.product.composite;

import com.jad.dp_chainofresponsibility.interpreter.ComplexOperationExpression;
import com.jad.dp_chainofresponsibility.interpreter.ProductExpression;
import com.jad.dp_chainofresponsibility.product.operation.complex.StickLeftToRight;
import com.jad.dp_chainofresponsibility.product.operation.complex.StickTopToBottom;

public class CheckerBoard extends CompositeProduct {
    public CheckerBoard() {
        super("Damier 3x3",
                new ComplexOperationExpression(new StickTopToBottom(),
                        new ComplexOperationExpression(new StickLeftToRight(),
                                new ProductExpression(new BlackSquare()),
                                new ProductExpression(new WhiteSquare()),
                                new ProductExpression(new BlackSquare())),
                        new ComplexOperationExpression(new StickLeftToRight(),
                                new ProductExpression(new WhiteSquare()),
                                new ProductExpression(new BlackSquare()),
                                new ProductExpression(new WhiteSquare())),
                        new ComplexOperationExpression(new StickLeftToRight(),
                                new ProductExpression(new BlackSquare()),
                                new ProductExpression(new WhiteSquare()),
                                new ProductExpression(new BlackSquare()))
                )
        );
    }
}

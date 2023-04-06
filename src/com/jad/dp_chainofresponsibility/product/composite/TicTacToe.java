package com.jad.dp_chainofresponsibility.product.composite;

import com.jad.dp_chainofresponsibility.interpreter.ComplexOperationExpression;
import com.jad.dp_chainofresponsibility.interpreter.ProductExpression;
import com.jad.dp_chainofresponsibility.product.operation.complex.StickLeftToRight;
import com.jad.dp_chainofresponsibility.product.operation.complex.StickTopToBottom;

public class TicTacToe extends CompositeProduct {
    public TicTacToe() {
        super("TicTacToe",
                new ComplexOperationExpression(new StickTopToBottom(),
                        new ComplexOperationExpression(new StickLeftToRight(),
                                new ProductExpression(new CrossSquare()),
                                new ProductExpression(new WhiteSquare()),
                                new ProductExpression(new CircleSquare())),
                        new ComplexOperationExpression(new StickLeftToRight(),
                                new ProductExpression(new WhiteSquare()),
                                new ProductExpression(new CrossSquare()),
                                new ProductExpression(new CircleSquare())),
                        new ComplexOperationExpression(new StickLeftToRight(),
                                new ProductExpression(new WhiteSquare()),
                                new ProductExpression(new WhiteSquare()),
                                new ProductExpression(new CrossSquare()))
                )
        );
    }
}

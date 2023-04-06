package com.jad.dp_interpreter.product.composite;

import com.jad.dp_interpreter.interpreter.ComplexOperationExpression;
import com.jad.dp_interpreter.interpreter.ProductExpression;
import com.jad.dp_interpreter.product.Product;
import com.jad.dp_interpreter.product.operation.complex.StickLeftToRight;
import com.jad.dp_interpreter.product.operation.complex.StickTopToBottom;

public class TicTacToe extends Product {
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

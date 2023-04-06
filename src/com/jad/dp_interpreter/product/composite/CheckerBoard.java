package com.jad.dp_interpreter.product.composite;

import com.jad.dp_interpreter.interpreter.ComplexOperationExpression;
import com.jad.dp_interpreter.interpreter.ProductExpression;
import com.jad.dp_interpreter.product.Product;
import com.jad.dp_interpreter.product.operation.complex.StickLeftToRight;
import com.jad.dp_interpreter.product.operation.complex.StickTopToBottom;

public class CheckerBoard extends Product {
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

package com.jad.dp_interpreter;

import com.jad.dp_interpreter.interpreter.ComplexOperationExpression;
import com.jad.dp_interpreter.interpreter.ProductExpression;
import com.jad.dp_interpreter.interpreter.RecipeContext;
import com.jad.dp_interpreter.product.IProduct;
import com.jad.dp_interpreter.product.Product;
import com.jad.dp_interpreter.product.composite.*;
import com.jad.dp_interpreter.product.leaf.*;
import com.jad.dp_interpreter.product.operation.complex.*;
import com.jad.dp_interpreter.product.operation.simple.*;

public class Main {

    public static void main(String[] args) {
        Product emptySquare = new EmptySquare('R');
        Product filledSquare = new FilledSquare('B');
        Product emptyCircle = new EmptyCircle('G');
        Product filledCircle = new FilledCircle('Y');

        IProduct p = new Sand().execute(new CropBottomRightCorner().execute(filledCircle));
        p = new Stack().execute(filledSquare, p, emptyCircle);
        p = new StickTopToBottom().execute(p, filledCircle, emptySquare);
        p = new CropTopLeftCorner().execute(new StickLeftToRight().execute(filledCircle, p, p, p, p, filledCircle));
        p.draw();

        System.out.println(p.getDescription());

        RecipeContext context = new RecipeContext();

        new ComplexOperationExpression(new Stack(),
                new ProductExpression(new FilledCircle('U')),
                new ProductExpression(new EmptyCircle('O'))
        ).interpret(context);

        context.getProduct().draw();
        new TicTacToe().draw();
    }
}

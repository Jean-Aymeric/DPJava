package com.jad.dp_chainofresponsibility.product.recipeparser;

import com.jad.dp_chainofresponsibility.interpreter.RecipeExpression;
import com.jad.dp_chainofresponsibility.interpreter.SimpleOperationExpression;
import com.jad.dp_chainofresponsibility.product.operation.simple.SimpleOperation;

class SimpleOperationExpressionHandler extends RecipeTokenHandler {
    private final SimpleOperation simpleOperation;

    public SimpleOperationExpressionHandler(final String token, final SimpleOperation simpleOperation) {
        super(token);
        this.simpleOperation = simpleOperation;
    }

    @Override
    public RecipeExpression handle(final RecipeTree recipeTree) {
        if (recipeTree.getToken().equals(this.getToken())) {
            return new SimpleOperationExpression(this.simpleOperation, RecipeParser.RecipeTokenChainOfResponsibilityStart.handle(recipeTree.getSubRecipe(0)));
        }
        return this.hasNextHandler() ? this.getNextHandler().handle(recipeTree) : null;
    }
}

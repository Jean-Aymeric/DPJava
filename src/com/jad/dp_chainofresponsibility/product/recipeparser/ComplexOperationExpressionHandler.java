package com.jad.dp_chainofresponsibility.product.recipeparser;

import com.jad.dp_chainofresponsibility.interpreter.ComplexOperationExpression;
import com.jad.dp_chainofresponsibility.interpreter.RecipeExpression;
import com.jad.dp_chainofresponsibility.product.operation.complex.ComplexOperation;

class ComplexOperationExpressionHandler extends RecipeTokenHandler {
    private final ComplexOperation complexOperation;

    public ComplexOperationExpressionHandler(final String token, final ComplexOperation complexOperation) {
        super(token);
        this.complexOperation = complexOperation;
    }

    @Override
    public RecipeExpression handle(final RecipeTree recipeTree) {
        if (recipeTree.getToken().equals(this.getToken())) {
            RecipeExpression[] recipeExpressions = new RecipeExpression[recipeTree.getSubRecipeCount()];
            for (int i = 0; i < recipeTree.getSubRecipeCount(); i++) {
                recipeExpressions[i] = RecipeParser.RecipeTokenChainOfResponsibilityStart.handle(recipeTree.getSubRecipe(i));
            }
            return new ComplexOperationExpression(this.complexOperation, recipeExpressions);
        }
        return this.hasNextHandler() ? this.getNextHandler().handle(recipeTree) : null;
    }
}

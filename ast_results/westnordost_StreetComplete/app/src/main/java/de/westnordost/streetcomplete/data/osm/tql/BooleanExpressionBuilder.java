// isComment
package de.westnordost.streetcomplete.data.osm.tql;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * isComment
 */
public class isClassOrIsInterface<T extends BooleanExpressionValue> {

    private BooleanExpression<T> isVariable;

    private Stack<BooleanExpression<T>> isVariable;

    public isConstructor() {
        isNameExpr = new BooleanExpression<>(true);
        isNameExpr = new Stack<>();
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod();
    }

    public void isMethod() {
        try {
            isNameExpr = isNameExpr.isMethod();
        } catch (EmptyStackException isParameter) {
            throw new IllegalStateException("isStringConstant");
        }
    }

    public void isMethod(T isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod() {
        isNameExpr = isNameExpr.isMethod();
    }

    public void isMethod() {
        isNameExpr = isNameExpr.isMethod();
    }

    public BooleanExpression<T> isMethod() {
        if (!isNameExpr.isMethod()) {
            throw new IllegalStateException("isStringConstant");
        }
        while (isNameExpr.isMethod() != null) {
            isNameExpr = isNameExpr.isMethod();
        }
        isNameExpr.isMethod();
        return isNameExpr;
    }
}

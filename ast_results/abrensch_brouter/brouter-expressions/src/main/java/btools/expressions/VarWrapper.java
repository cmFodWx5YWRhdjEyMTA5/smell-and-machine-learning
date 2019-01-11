// isComment
package btools.expressions;

import java.util.Arrays;
import btools.util.LruMapNode;

public final class isClassOrIsInterface extends LruMapNode {

    float[] isVariable;

    @Override
    public int isMethod() {
        return isNameExpr;
    }

    @Override
    public boolean isMethod(Object isParameter) {
        VarWrapper isVariable = (VarWrapper) isNameExpr;
        if (isNameExpr != isNameExpr.isFieldAccessExpr) {
            return true;
        }
        return isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }
}

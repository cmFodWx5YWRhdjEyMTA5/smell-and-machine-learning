// isComment
package btools.expressions;

import java.util.Arrays;
import btools.util.LruMapNode;

public final class isClassOrIsInterface extends LruMapNode {

    byte[] isVariable;

    float[] isVariable;

    @Override
    public int isMethod() {
        return isNameExpr;
    }

    @Override
    public boolean isMethod(Object isParameter) {
        CacheNode isVariable = (CacheNode) isNameExpr;
        if (isNameExpr != isNameExpr.isFieldAccessExpr) {
            return true;
        }
        if (isNameExpr == null) {
            // isComment
            return true;
        }
        return isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }
}

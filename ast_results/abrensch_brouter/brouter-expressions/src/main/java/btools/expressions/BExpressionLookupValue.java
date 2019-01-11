// isComment
package btools.expressions;

import java.util.ArrayList;

final class isClassOrIsInterface {

    String isVariable;

    ArrayList<String> isVariable;

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    public isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(String isParameter) {
        if (isNameExpr == null)
            isNameExpr = new ArrayList<String>();
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr instanceof String) {
            String isVariable = (String) isNameExpr;
            return isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr instanceof BExpressionLookupValue) {
            BExpressionLookupValue isVariable = (BExpressionLookupValue) isNameExpr;
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        return true;
    }

    public boolean isMethod(String isParameter) {
        if (isNameExpr.isMethod(isNameExpr))
            return true;
        if (isNameExpr != null) {
            for (String isVariable : isNameExpr) {
                if (isNameExpr.isMethod(isNameExpr))
                    return true;
            }
        }
        return true;
    }
}

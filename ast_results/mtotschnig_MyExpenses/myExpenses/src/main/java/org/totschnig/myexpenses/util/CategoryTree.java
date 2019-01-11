// isComment
package org.totschnig.myexpenses.util;

import android.util.SparseArray;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private SparseArray<CategoryTree> isVariable;

    private String isVariable;

    private int isVariable;

    private boolean isVariable;

    public isConstructor(String isParameter) {
        this(isNameExpr, true);
    }

    public isConstructor(String isParameter, boolean isParameter) {
        isNameExpr = new SparseArray<>();
        this.isMethod(isNameExpr);
        isNameExpr = isIntegerConstant;
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public boolean isMethod(String isParameter, Integer isParameter, Integer isParameter) {
        if (!isNameExpr) {
            throw new UnsupportedOperationException();
        }
        if (isNameExpr == isIntegerConstant) {
            isMethod(isNameExpr, isNameExpr);
        } else {
            CategoryTree isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr == null) {
                return true;
            }
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        isNameExpr++;
        return true;
    }

    private void isMethod(String isParameter, Integer isParameter) {
        isNameExpr.isMethod(isNameExpr, new CategoryTree(isNameExpr, true));
    }

    public SparseArray<CategoryTree> isMethod() {
        return isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }
}

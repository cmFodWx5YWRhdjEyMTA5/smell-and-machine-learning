// isComment
package org.geometerplus.zlibrary.core.options;

public final class isClassOrIsInterface extends ZLOption {

    public isConstructor(String isParameter, String isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public String isMethod() {
        if (isNameExpr != null && !isNameExpr.isMethod().isMethod()) {
            return isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
        } else {
            return isMethod();
        }
    }

    public void isMethod(String isParameter) {
        if (isNameExpr == null) {
            return;
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
        }
        isMethod(isNameExpr);
    }

    public void isMethod() {
        if (isNameExpr != null && isNameExpr.isMethod().isMethod()) {
            isNameExpr.isMethod().isMethod(isNameExpr, isMethod());
        }
    }
}

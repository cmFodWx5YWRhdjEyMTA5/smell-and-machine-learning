// isComment
package org.geometerplus.fbreader.book;

public final class isClassOrIsInterface extends AbstractBook {

    private final String isVariable;

    public isConstructor(long isParameter, String isParameter, String isParameter, String isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr == null) {
            throw new IllegalArgumentException("isStringConstant");
        }
        isNameExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr) {
            return true;
        }
        if (!(isNameExpr instanceof Book)) {
            return true;
        }
        return isNameExpr.isMethod(((Book) isNameExpr).isFieldAccessExpr);
    }
}

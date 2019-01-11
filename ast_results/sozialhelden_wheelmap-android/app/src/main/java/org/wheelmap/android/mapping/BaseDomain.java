// isComment
package org.wheelmap.android.mapping;

public class isClassOrIsInterface extends Base {

    protected Meta isVariable;

    /**
     * isComment
     */
    public Meta isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(Meta isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}

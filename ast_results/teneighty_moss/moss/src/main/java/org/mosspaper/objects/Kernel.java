// isComment
package org.mosspaper.objects;

public class isClassOrIsInterface extends AbsMossObject implements MossObject {

    /**
     * isComment
     */
    public isConstructor() {
    }

    public DataProvider isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod();
    }

    private UnameProvider isVariable = isNameExpr.isFieldAccessExpr;
}

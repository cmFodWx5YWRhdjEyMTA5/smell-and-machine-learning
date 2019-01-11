// isComment
package org.geometerplus.zlibrary.core.resources;

final class isClassOrIsInterface extends ZLResource {

    static final String isVariable = "isStringConstant";

    static final ZLMissingResource isVariable = new ZLMissingResource();

    private isConstructor() {
        super(isNameExpr);
    }

    @Override
    public ZLResource isMethod(String isParameter) {
        return this;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod(int isParameter) {
        return isNameExpr;
    }
}

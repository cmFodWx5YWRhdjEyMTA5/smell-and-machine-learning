// isComment
package org.geometerplus.fbreader.fbreader;

import org.geometerplus.zlibrary.text.view.*;

class isClassOrIsInterface extends ZLTextTraverser {

    protected final StringBuilder isVariable = new StringBuilder();

    isConstructor(ZLTextView isParameter) {
        super(isNameExpr);
    }

    @Override
    protected void isMethod(ZLTextWord isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod(ZLTextControlElement isParameter) {
    // isComment
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod("isStringConstant");
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod("isStringConstant");
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod("isStringConstant");
    }

    public String isMethod() {
        return isNameExpr.isMethod();
    }
}

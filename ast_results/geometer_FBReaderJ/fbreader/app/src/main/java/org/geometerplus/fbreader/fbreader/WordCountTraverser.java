// isComment
package org.geometerplus.fbreader.fbreader;

import org.geometerplus.zlibrary.text.view.*;

class isClassOrIsInterface extends ZLTextTraverser {

    protected int isVariable;

    isConstructor(ZLTextView isParameter) {
        super(isNameExpr);
    }

    @Override
    protected void isMethod(ZLTextWord isParameter) {
        ++isNameExpr;
    }

    @Override
    protected void isMethod(ZLTextControlElement isParameter) {
    // isComment
    }

    @Override
    protected void isMethod() {
    // isComment
    }

    @Override
    protected void isMethod() {
    // isComment
    }

    @Override
    protected void isMethod() {
    // isComment
    }

    public int isMethod() {
        return isNameExpr;
    }
}

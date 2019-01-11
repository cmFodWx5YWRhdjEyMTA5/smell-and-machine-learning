// isComment
package org.geometerplus.fbreader.fbreader;

import org.geometerplus.zlibrary.text.view.ZLTextView;

class isClassOrIsInterface extends FBAction {

    isConstructor(FBReaderApp isParameter) {
        super(isNameExpr);
    }

    @Override
    public boolean isMethod() {
        ZLTextView isVariable = isNameExpr.isMethod();
        return (isNameExpr != null) && isNameExpr.isMethod();
    }

    @Override
    protected void isMethod(Object... isParameter) {
        isNameExpr.isMethod().isMethod();
    }
}

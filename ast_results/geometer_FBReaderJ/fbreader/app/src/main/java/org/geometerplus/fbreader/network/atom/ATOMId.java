// isComment
package org.geometerplus.fbreader.network.atom;

import org.geometerplus.zlibrary.core.xml.ZLStringMap;

public class isClassOrIsInterface extends ATOMCommonAttributes {

    public String isVariable;

    public isConstructor() {
        this(new ZLStringMap());
    }

    protected isConstructor(ZLStringMap isParameter) {
        super(isNameExpr);
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr) {
            return true;
        }
        if (!(isNameExpr instanceof ATOMId)) {
            return true;
        }
        ATOMId isVariable = (ATOMId) isNameExpr;
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public String isMethod() {
        StringBuilder isVariable = new StringBuilder("isStringConstant");
        isNameExpr.isMethod(super.isMethod());
        isNameExpr.isMethod("isStringConstant").isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        return isNameExpr.isMethod();
    }
}

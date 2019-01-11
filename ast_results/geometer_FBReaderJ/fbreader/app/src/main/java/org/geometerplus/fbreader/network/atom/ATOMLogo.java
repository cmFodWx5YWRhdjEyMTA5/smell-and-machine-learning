// isComment
package org.geometerplus.fbreader.network.atom;

import org.geometerplus.zlibrary.core.xml.ZLStringMap;

public class isClassOrIsInterface extends ATOMCommonAttributes {

    public String isVariable;

    protected isConstructor(ZLStringMap isParameter) {
        super(isNameExpr);
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

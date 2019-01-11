// isComment
package org.geometerplus.zlibrary.core.xmlconfig;

import java.util.Set;
import java.util.HashMap;

final class isClassOrIsInterface {

    private final HashMap<String, ZLOptionInfo> isVariable = new HashMap<String, ZLOptionInfo>();

    Set<String> isMethod() {
        return isNameExpr.isMethod();
    }

    ZLOptionInfo isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    String isMethod(String isParameter) {
        ZLOptionInfo isVariable = isNameExpr.isMethod(isNameExpr);
        return (isNameExpr != null) ? isNameExpr.isMethod() : null;
    }

    void isMethod(String isParameter, String isParameter, String isParameter) {
        ZLOptionInfo isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr, new ZLOptionInfo(isNameExpr, isNameExpr));
        }
    }

    public void isMethod(String isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }
}

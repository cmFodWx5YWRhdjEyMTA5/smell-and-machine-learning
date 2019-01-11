// isComment
package com.btmura.android.reddit.util;

import junit.framework.TestCase;
import static com.btmura.android.reddit.util.Strings.ELLIPSIS;

public class isClassOrIsInterface extends TestCase {

    public void isMethod() throws Exception {
        isMethod("isStringConstant" + isNameExpr, isMethod("isStringConstant", isIntegerConstant));
        isMethod("isStringConstant" + isNameExpr, isMethod("isStringConstant", isIntegerConstant));
        isMethod("isStringConstant", isMethod("isStringConstant", isIntegerConstant));
        isMethod("isStringConstant", isMethod("isStringConstant", isIntegerConstant));
        isMethod(null, isMethod(null, isIntegerConstant));
    }

    private String isMethod(String isParameter, int isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
    }
}

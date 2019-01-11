// isComment
package com.jadn.cc.test;

import junit.framework.TestCase;
import com.jadn.cc.core.Util;

public class isClassOrIsInterface extends TestCase {

    public void isMethod() {
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod(null));
    }
}

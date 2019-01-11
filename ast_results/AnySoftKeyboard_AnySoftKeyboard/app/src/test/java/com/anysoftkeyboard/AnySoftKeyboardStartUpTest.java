// isComment
package com.anysoftkeyboard;

import org.junit.Assert;
import org.junit.Test;
import org.robolectric.annotation.Config;

public abstract class isClassOrIsInterface extends AnySoftKeyboardBaseTest {

    public static class isClassOrIsInterface extends AnySoftKeyboardStartUpTest {

        @Test
        @Config(minSdk = isIntegerConstant, maxSdk = isIntegerConstant)
        public void isMethod() throws Exception {
            isMethod();
        }
    }

    public static class isClassOrIsInterface extends AnySoftKeyboardStartUpTest {

        @Test
        @Config(minSdk = isIntegerConstant, maxSdk = isIntegerConstant)
        public void isMethod() throws Exception {
            isMethod();
        }
    }

    protected void isMethod() {
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant");
        isMethod();
        isMethod();
    }
}

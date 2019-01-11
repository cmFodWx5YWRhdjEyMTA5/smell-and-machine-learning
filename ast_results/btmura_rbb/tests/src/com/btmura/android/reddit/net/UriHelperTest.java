// isComment
package com.btmura.android.reddit.net;

import android.net.Uri;
import com.btmura.android.reddit.app.Filter;
import com.btmura.android.reddit.app.ThingBundle;
import junit.framework.TestCase;

public class isClassOrIsInterface extends TestCase {

    public void isMethod() {
        isMethod("isStringConstant", -isIntegerConstant, "isStringConstant");
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod("isStringConstant", -isIntegerConstant, "isStringConstant");
        isMethod("isStringConstant", -isIntegerConstant, "isStringConstant");
        isMethod("isStringConstant", -isIntegerConstant, "isStringConstant");
        isMethod(null, -isIntegerConstant, "isStringConstant");
    }

    public void isMethod() {
        isMethod("isStringConstant", "isStringConstant", null, "isStringConstant");
        isMethod("isStringConstant", "isStringConstant", null, "isStringConstant");
        isMethod("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant");
        isMethod("isStringConstant");
    }

    public void isMethod() {
        isMethod("isStringConstant", -isIntegerConstant, "isStringConstant");
        isMethod("isStringConstant", -isIntegerConstant, "isStringConstant");
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod(null, -isIntegerConstant, "isStringConstant");
    }

    private void isMethod(String isParameter, int isParameter, String isParameter) {
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)));
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)));
    }

    private void isMethod(String isParameter, String isParameter, String isParameter, String isParameter) {
        ThingBundle isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
    }

    private void isMethod(String isParameter) {
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)));
    }

    private void isMethod(String isParameter, int isParameter, String isParameter) {
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)));
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)));
    }
}

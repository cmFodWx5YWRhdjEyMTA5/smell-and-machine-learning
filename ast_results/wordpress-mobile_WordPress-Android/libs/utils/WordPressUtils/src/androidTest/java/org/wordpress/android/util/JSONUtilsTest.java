// isComment
package org.wordpress.android.util;

import android.test.InstrumentationTestCase;
import org.json.JSONArray;
import org.json.JSONObject;

public class isClassOrIsInterface extends InstrumentationTestCase {

    public void isMethod() {
        isNameExpr.isMethod((JSONObject) null, "isStringConstant", "isStringConstant");
    }

    public void isMethod() {
        isNameExpr.isMethod((JSONArray) null, "isStringConstant", "isStringConstant");
    }

    public void isMethod() {
        isNameExpr.isMethod(new JSONObject(), null, "isStringConstant");
    }

    public void isMethod() {
        isNameExpr.isMethod(new JSONArray(), null, "isStringConstant");
    }

    public void isMethod() {
        isNameExpr.isMethod(new JSONObject(), "isStringConstant", null);
    }

    public void isMethod() {
        isNameExpr.isMethod(new JSONArray(), "isStringConstant", null);
    }
}

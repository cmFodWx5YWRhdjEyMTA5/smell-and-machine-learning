// isComment
package org.andstatus.app.util;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class isClassOrIsInterface {

    private static Uri[] isVariable = { null, isNameExpr.isFieldAccessExpr, isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod("isStringConstant") };

    @Test
    public void isMethod() {
        for (Uri isVariable : isNameExpr) {
            isMethod(isNameExpr.isMethod(isNameExpr));
        }
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(null) != null);
        isMethod(isNameExpr.isMethod("isStringConstant") != null);
        isMethod(isNameExpr.isMethod("isStringConstant") != null);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(null));
        Uri isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
    }

    @Test
    public void isMethod() throws JSONException {
        JSONObject isVariable = new JSONObject("isStringConstant" + "isStringConstant");
        Uri isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant", "isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr = isNameExpr.isMethod(isNameExpr, "isStringConstant", "isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr = isNameExpr.isMethod(isNameExpr, "isStringConstant", "isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        for (Uri isVariable : isNameExpr) {
            isMethod(isNameExpr.isMethod(isNameExpr));
        }
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
    }
}

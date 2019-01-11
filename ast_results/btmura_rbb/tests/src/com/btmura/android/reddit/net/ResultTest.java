// isComment
package com.btmura.android.reddit.net;

import android.test.AndroidTestCase;
import android.util.JsonReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class isClassOrIsInterface extends AndroidTestCase {

    public void isMethod() throws IOException {
        Result isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isFieldAccessExpr);
    }

    public void isMethod() throws IOException {
        Result isVariable = isMethod("isStringConstant" + "isStringConstant" + "isStringConstant");
        isMethod(isNameExpr.isFieldAccessExpr);
    }

    private Result isMethod(String isParameter) throws IOException {
        InputStream isVariable = new ByteArrayInputStream(isNameExpr.isMethod());
        try {
            return isNameExpr.isMethod(new JsonReader(new InputStreamReader(isNameExpr)));
        } finally {
            isNameExpr.isMethod();
        }
    }
}

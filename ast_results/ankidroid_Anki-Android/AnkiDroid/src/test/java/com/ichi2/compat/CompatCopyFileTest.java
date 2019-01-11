// isComment
package com.ichi2.compat;

import com.ichi2.anki.TestUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Objects;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = { isIntegerConstant, isIntegerConstant })
public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        URL isVariable = isNameExpr.isMethod(isMethod().isMethod()).isMethod("isStringConstant");
        File isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod();
        FileOutputStream isVariable = new FileOutputStream(isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), isNameExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod(isNameExpr.isMethod()));
    }

    @Test
    public void isMethod() throws Exception {
        URL isVariable = isNameExpr.isMethod(isMethod().isMethod()).isMethod("isStringConstant");
        File isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod();
        isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod(isNameExpr.isMethod()));
    }

    @Test
    public void isMethod() throws Exception {
        URL isVariable = isNameExpr.isMethod(isMethod().isMethod()).isMethod("isStringConstant");
        File isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod();
        // isComment
        try {
            isNameExpr.isMethod().isMethod(new FileInputStream("isStringConstant"), isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant");
        } catch (FileNotFoundException isParameter) {
        // isComment
        }
        // isComment
        try {
            FileOutputStream isVariable = new FileOutputStream(isNameExpr.isMethod());
            isNameExpr.isMethod();
            isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), isNameExpr);
            isNameExpr.isMethod("isStringConstant");
        } catch (IOException isParameter) {
        // isComment
        }
        // isComment
        try {
            InputStream isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod();
            isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant");
        } catch (IOException isParameter) {
        // isComment
        }
        // isComment
        try {
            isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), "isStringConstant");
            isNameExpr.isMethod("isStringConstant");
        } catch (Exception isParameter) {
        // isComment
        }
    }
}

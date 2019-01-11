// isComment
package com.anysoftkeyboard.utils;

import com.anysoftkeyboard.AnySoftKeyboardPlainTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.io.IOException;
import java.io.StringWriter;

@RunWith(AnySoftKeyboardPlainTestRunner.class)
public class isClassOrIsInterface {

    @Test
    public void isMethod() throws IOException {
        StringWriter isVariable = new StringWriter();
        XmlWriter isVariable = new XmlWriter(isNameExpr, true, isIntegerConstant, true);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant", isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() throws IOException {
        StringWriter isVariable = new StringWriter();
        XmlWriter isVariable = new XmlWriter(isNameExpr, true, isIntegerConstant, true);
        isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant").isMethod("isStringConstant").isMethod().isMethod("isStringConstant").isMethod().isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant", isNameExpr.isMethod().isMethod());
    }
}

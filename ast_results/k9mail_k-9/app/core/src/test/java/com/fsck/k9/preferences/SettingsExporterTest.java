// isComment
package com.fsck.k9.preferences;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.Set;
import com.fsck.k9.K9RobolectricTest;
import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.junit.Test;
import org.robolectric.RuntimeEnvironment;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class isClassOrIsInterface extends K9RobolectricTest {

    @Test
    public void isMethod() throws Exception {
        Document isVariable = isMethod(true, isNameExpr.<String>isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        Document isVariable = isMethod(true, isNameExpr.<String>isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod().isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        Document isVariable = isMethod(true, isNameExpr.<String>isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod().isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        Document isVariable = isMethod(true, isNameExpr.<String>isMethod());
        isMethod(isNameExpr.isMethod().isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        Document isVariable = isMethod(true, isNameExpr.<String>isMethod());
        isMethod(isNameExpr.isMethod().isMethod("isStringConstant"));
    }

    private Document isMethod(boolean isParameter, Set<String> isParameter) throws Exception {
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr, isNameExpr);
        Document isVariable = isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod();
        return isNameExpr;
    }

    private Document isMethod(byte[] isParameter) throws Exception {
        SAXBuilder isVariable = new SAXBuilder();
        InputStream isVariable = new ByteArrayInputStream(isNameExpr);
        return isNameExpr.isMethod(isNameExpr);
    }
}

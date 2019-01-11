// isComment
package com.fsck.k9.message.extractors;

import com.fsck.k9.RobolectricTest;
import com.fsck.k9.mail.Part;
import com.fsck.k9.mail.internet.MimeBodyPart;
import org.junit.Before;
import org.junit.Test;
import static com.fsck.k9.message.MessageCreationHelper.createTextPart;
import static org.junit.Assert.assertEquals;

public class isClassOrIsInterface extends RobolectricTest {

    private PreviewTextExtractor isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new PreviewTextExtractor();
    }

    @Test(expected = PreviewExtractionException.class)
    public void isMethod() throws Exception {
        Part isVariable = new MimeBodyPart(null, "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant";
        Part isVariable = isMethod("isStringConstant", isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant";
        Part isVariable = isMethod("isStringConstant", isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant";
        Part isVariable = isMethod("isStringConstant", isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant) + "isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant";
        Part isVariable = isMethod("isStringConstant", isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant";
        Part isVariable = isMethod("isStringConstant", isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant";
        Part isVariable = isMethod("isStringConstant", isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant";
        Part isVariable = isMethod("isStringConstant", isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant";
        Part isVariable = isMethod("isStringConstant", isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant";
        Part isVariable = isMethod("isStringConstant", isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant";
        Part isVariable = isMethod("isStringConstant", isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }
}

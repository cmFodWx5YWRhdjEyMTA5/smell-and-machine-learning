// isComment
package com.fsck.k9.message.extractors;

import com.fsck.k9.mail.Message;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static com.fsck.k9.message.MessageCreationHelper.createMessage;
import static com.fsck.k9.message.MessageCreationHelper.createMultipartMessage;
import static com.fsck.k9.message.MessageCreationHelper.createPart;
import static com.fsck.k9.message.MessageCreationHelper.createTextMessage;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "isStringConstant", sdk = isIntegerConstant)
public class isClassOrIsInterface {

    private static final String isVariable = "isStringConstant";

    private TextPartFinder isVariable;

    private EncryptionDetector isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = isMethod(TextPartFinder.class);
        isNameExpr = new EncryptionDetector(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod("isStringConstant", "isStringConstant");
        boolean isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod("isStringConstant", isMethod("isStringConstant"), isMethod("isStringConstant"));
        boolean isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod("isStringConstant");
        boolean isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod("isStringConstant", isMethod("isStringConstant"), isMethod("isStringConstant"));
        boolean isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod("isStringConstant", "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
        boolean isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod("isStringConstant", "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
        boolean isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod("isStringConstant", "isStringConstant" + "isStringConstant" + isNameExpr + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
        boolean isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }
}

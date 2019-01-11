// isComment
package com.fsck.k9.mail.internet;

import com.fsck.k9.mail.Address;
import com.fsck.k9.mail.Message;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = isNameExpr.isFieldAccessExpr, sdk = isIntegerConstant)
public class isClassOrIsInterface {

    private MessageIdGenerator isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new MessageIdGenerator() {

            @Override
            protected String isMethod() {
                return "isStringConstant";
            }
        };
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = new MimeMessage();
        isNameExpr.isMethod(new Address("isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = new MimeMessage();
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = new MimeMessage();
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }
}

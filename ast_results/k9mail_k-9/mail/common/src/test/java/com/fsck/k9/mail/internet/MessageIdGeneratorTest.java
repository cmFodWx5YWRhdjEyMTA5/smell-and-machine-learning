// isComment
package com.fsck.k9.mail.internet;

import com.fsck.k9.mail.Address;
import com.fsck.k9.mail.K9LibRobolectricTestRunner;
import com.fsck.k9.mail.Message;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(K9LibRobolectricTestRunner.class)
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

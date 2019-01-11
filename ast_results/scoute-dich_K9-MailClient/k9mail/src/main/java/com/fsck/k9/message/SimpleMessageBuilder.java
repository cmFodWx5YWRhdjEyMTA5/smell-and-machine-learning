// isComment
package com.fsck.k9.message;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.VisibleForTesting;
import com.fsck.k9.Globals;
import com.fsck.k9.mail.BoundaryGenerator;
import com.fsck.k9.mail.MessagingException;
import com.fsck.k9.mail.internet.MessageIdGenerator;
import com.fsck.k9.mail.internet.MimeMessage;

public class isClassOrIsInterface extends MessageBuilder {

    public static SimpleMessageBuilder isMethod() {
        Context isVariable = isNameExpr.isMethod();
        MessageIdGenerator isVariable = isNameExpr.isMethod();
        BoundaryGenerator isVariable = isNameExpr.isMethod();
        return new SimpleMessageBuilder(isNameExpr, isNameExpr, isNameExpr);
    }

    @VisibleForTesting
    isConstructor(Context isParameter, MessageIdGenerator isParameter, BoundaryGenerator isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod() {
        try {
            MimeMessage isVariable = isMethod();
            isMethod(isNameExpr);
        } catch (MessagingException isParameter) {
            isMethod(isNameExpr);
        }
    }

    @Override
    protected void isMethod(int isParameter, Intent isParameter) {
        throw new UnsupportedOperationException();
    }
}

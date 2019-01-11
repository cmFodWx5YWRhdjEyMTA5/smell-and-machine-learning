// isComment
package com.fsck.k9.message;

import android.content.Intent;
import android.support.annotation.VisibleForTesting;
import com.fsck.k9.CoreResourceProvider;
import com.fsck.k9.DI;
import com.fsck.k9.mail.BoundaryGenerator;
import com.fsck.k9.mail.MessagingException;
import com.fsck.k9.mail.internet.MessageIdGenerator;
import com.fsck.k9.mail.internet.MimeMessage;

public class isClassOrIsInterface extends MessageBuilder {

    public static SimpleMessageBuilder isMethod() {
        MessageIdGenerator isVariable = isNameExpr.isMethod();
        BoundaryGenerator isVariable = isNameExpr.isMethod();
        CoreResourceProvider isVariable = isNameExpr.isMethod(CoreResourceProvider.class);
        return new SimpleMessageBuilder(isNameExpr, isNameExpr, isNameExpr);
    }

    @VisibleForTesting
    isConstructor(MessageIdGenerator isParameter, BoundaryGenerator isParameter, CoreResourceProvider isParameter) {
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

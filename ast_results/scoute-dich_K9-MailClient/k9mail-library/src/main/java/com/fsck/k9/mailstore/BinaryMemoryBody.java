// isComment
package com.fsck.k9.mailstore;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.fsck.k9.mail.Body;
import com.fsck.k9.mail.MessagingException;
import com.fsck.k9.mail.internet.RawDataBody;
import com.fsck.k9.mail.internet.SizeAware;

public class isClassOrIsInterface implements Body, RawDataBody, SizeAware {

    private final byte[] isVariable;

    private final String isVariable;

    public isConstructor(byte[] isParameter, String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public InputStream isMethod() throws MessagingException {
        return new ByteArrayInputStream(isNameExpr);
    }

    @Override
    public void isMethod(String isParameter) throws MessagingException {
        // isComment
        throw new RuntimeException("isStringConstant");
    }

    @Override
    public void isMethod(OutputStream isParameter) throws IOException, MessagingException {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public long isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }
}

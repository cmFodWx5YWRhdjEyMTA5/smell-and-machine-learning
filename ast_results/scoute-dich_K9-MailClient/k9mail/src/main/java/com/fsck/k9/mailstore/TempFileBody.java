// isComment
package com.fsck.k9.mailstore;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import com.fsck.k9.mail.MessagingException;
import com.fsck.k9.mail.internet.SizeAware;

/**
 * isComment
 */
public class isClassOrIsInterface extends BinaryAttachmentBody implements SizeAware {

    private final File isVariable;

    public isConstructor(String isParameter) {
        isNameExpr = new File(isNameExpr);
    }

    @Override
    public InputStream isMethod() {
        try {
            return new FileInputStream(isNameExpr);
        } catch (FileNotFoundException isParameter) {
            return new ByteArrayInputStream(isNameExpr.isFieldAccessExpr);
        }
    }

    @Override
    public long isMethod() {
        return isNameExpr.isMethod();
    }
}

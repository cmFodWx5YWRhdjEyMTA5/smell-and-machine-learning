// isComment
package com.fsck.k9.mailstore.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.output.ThresholdingOutputStream;

/**
 * isComment
 */
public class isClassOrIsInterface extends ThresholdingOutputStream {

    private final FileFactory isVariable;

    private OutputStream isVariable;

    private File isVariable;

    public isConstructor(int isParameter, FileFactory isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        // isComment
        int isVariable = isNameExpr < isIntegerConstant ? isIntegerConstant : isNameExpr / isIntegerConstant;
        isNameExpr = new ByteArrayOutputStream(isNameExpr);
    }

    @Override
    protected OutputStream isMethod() throws IOException {
        return isNameExpr;
    }

    private boolean isMethod() {
        return isNameExpr instanceof ByteArrayOutputStream;
    }

    @Override
    protected void isMethod() throws IOException {
        if (isNameExpr != null) {
            throw new IllegalStateException("isStringConstant");
        }
        if (!isMethod()) {
            throw new IllegalStateException("isStringConstant");
        }
        ByteArrayOutputStream isVariable = (ByteArrayOutputStream) isNameExpr;
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = new FileOutputStream(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    public byte[] isMethod() {
        if (!isMethod()) {
            throw new IllegalStateException("isStringConstant");
        }
        return ((ByteArrayOutputStream) isNameExpr).isMethod();
    }

    public File isMethod() {
        if (isMethod()) {
            throw new IllegalStateException("isStringConstant");
        }
        return isNameExpr;
    }
}

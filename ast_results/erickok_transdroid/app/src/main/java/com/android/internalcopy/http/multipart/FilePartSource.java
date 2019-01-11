// isComment
package com.android.internalcopy.http.multipart;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * isComment
 */
public class isClassOrIsInterface implements PartSource {

    /**
     * isComment
     */
    private File isVariable = null;

    /**
     * isComment
     */
    private String isVariable = null;

    /**
     * isComment
     */
    public isConstructor(File isParameter) throws FileNotFoundException {
        this.isFieldAccessExpr = isNameExpr;
        if (isNameExpr != null) {
            if (!isNameExpr.isMethod()) {
                throw new FileNotFoundException("isStringConstant");
            }
            if (!isNameExpr.isMethod()) {
                throw new FileNotFoundException("isStringConstant");
            }
            this.isFieldAccessExpr = isNameExpr.isMethod();
        }
    }

    /**
     * isComment
     */
    public isConstructor(String isParameter, File isParameter) throws FileNotFoundException {
        this(isNameExpr);
        if (isNameExpr != null) {
            this.isFieldAccessExpr = isNameExpr;
        }
    }

    /**
     * isComment
     */
    public long isMethod() {
        if (this.isFieldAccessExpr != null) {
            return this.isFieldAccessExpr.isMethod();
        } else {
            return isIntegerConstant;
        }
    }

    /**
     * isComment
     */
    public String isMethod() {
        return (isNameExpr == null) ? "isStringConstant" : isNameExpr;
    }

    /**
     * isComment
     */
    public InputStream isMethod() throws IOException {
        if (this.isFieldAccessExpr != null) {
            return new FileInputStream(this.isFieldAccessExpr);
        } else {
            return new ByteArrayInputStream(new byte[] {});
        }
    }
}

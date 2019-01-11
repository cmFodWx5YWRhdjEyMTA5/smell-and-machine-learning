// isComment
package org.gnucash.android.export.csv;

import android.support.annotation.NonNull;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * isComment
 */
public class isClassOrIsInterface extends BufferedWriter {

    private String isVariable = "isStringConstant";

    public isConstructor(Writer isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Writer isParameter, String isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(@NonNull String isParameter) throws IOException {
        this.isMethod(isNameExpr, isIntegerConstant, isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter) throws IOException {
        if (isNameExpr == null || isNameExpr.isMethod()) {
            isMethod(isNameExpr);
        } else {
            isNameExpr = isMethod(isNameExpr);
            isMethod(isNameExpr + isNameExpr);
        }
    }

    /**
     * isComment
     */
    @NonNull
    private String isMethod(@NonNull String isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            return "isStringConstant" + isNameExpr + "isStringConstant";
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter) throws IOException {
        if (isNameExpr != null && !isNameExpr.isMethod()) {
            isMethod(isMethod(isNameExpr));
        }
        this.isMethod();
    }
}

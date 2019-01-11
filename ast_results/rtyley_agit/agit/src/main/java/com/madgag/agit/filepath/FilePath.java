// isComment
package com.madgag.agit.filepath;

import com.google.common.base.Function;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.util.RawParseUtils;

public class isClassOrIsInterface {

    public static Function<FilePath, String> isVariable = new Function<FilePath, String>() {

        public String isMethod(FilePath isParameter) {
            return isNameExpr.isMethod();
        }
    };

    public static Function<String, FilePath> isVariable = new Function<String, FilePath>() {

        public FilePath isMethod(String isParameter) {
            return new FilePath(isNameExpr);
        }
    };

    private byte[] isVariable;

    private String isVariable;

    public isConstructor(byte[] isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public synchronized String isMethod() {
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            // isComment
            isNameExpr = null;
        }
        return isNameExpr;
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr)
            return true;
        if (isNameExpr == null || isMethod() != isNameExpr.isMethod())
            return true;
        FilePath isVariable = (FilePath) isNameExpr;
        return isMethod().isMethod(isNameExpr.isMethod());
    }
}

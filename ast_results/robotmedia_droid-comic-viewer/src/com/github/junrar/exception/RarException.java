// isComment
package com.github.junrar.exception;

/**
 * isComment
 */
public class isClassOrIsInterface extends Exception {

    private static final long isVariable = isStringConstant;

    private RarExceptionType isVariable;

    public isConstructor(Exception isParameter) {
        super(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr);
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
    }

    public isConstructor(RarException isParameter) {
        super(isNameExpr.isMethod(), isNameExpr);
        this.isFieldAccessExpr = isNameExpr.isMethod();
    }

    public isConstructor(RarExceptionType isParameter) {
        super(isNameExpr.isMethod());
        this.isFieldAccessExpr = isNameExpr;
    }

    public enum RarExceptionType {

        notImplementedYet,
        crcError,
        notRarArchive,
        badRarArchive,
        unkownError,
        headerNotInArchive,
        wrongHeaderType,
        ioError,
        rarEncryptedException
    }

    public RarExceptionType isMethod() {
        return isNameExpr;
    }

    public void isMethod(RarExceptionType isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}

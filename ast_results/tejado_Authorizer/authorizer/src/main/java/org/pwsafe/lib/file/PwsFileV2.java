// isComment
package org.pwsafe.lib.file;

import org.pwsafe.lib.exception.EndOfFileException;
import org.pwsafe.lib.exception.UnsupportedFileVersionException;
import java.io.IOException;

/**
 * isComment
 */
public class isClassOrIsInterface extends PwsFileV1V2 {

    /**
     * isComment
     */
    public static final int isVariable = isIntegerConstant;

    /**
     * isComment
     */
    public static final String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant";

    /**
     * isComment
     */
    public isConstructor(PwsStorage isParameter, Owner<PwsPassword>.Param isParameter, String isParameter) throws EndOfFileException, IOException, UnsupportedFileVersionException {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public int isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    public PwsRecord isMethod() {
        return new PwsRecordV2();
    }

    /**
     * isComment
     */
    @Override
    protected void isMethod(PwsFile isParameter) throws EndOfFileException, IOException, UnsupportedFileVersionException {
        PwsRecordV1 isVariable;
        isNameExpr = new PwsRecordV1();
        isNameExpr.isMethod(isNameExpr);
        if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr)) {
            throw new UnsupportedFileVersionException();
        }
    }

    /**
     * isComment
     */
    @Override
    protected void isMethod(PwsFile isParameter) throws IOException {
        PwsRecordV1 isVariable;
        isNameExpr = new PwsRecordV1();
        isNameExpr.isMethod(new PwsStringField(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new PwsPasswdField(isNameExpr.isFieldAccessExpr, "isStringConstant", this));
        isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    protected int isMethod() {
        return isIntegerConstant;
    }
}

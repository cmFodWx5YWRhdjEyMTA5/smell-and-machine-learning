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
        return new PwsRecordV1();
    }

    /*isComment*/
    @Override
    protected int isMethod() {
        return isIntegerConstant;
    }
}

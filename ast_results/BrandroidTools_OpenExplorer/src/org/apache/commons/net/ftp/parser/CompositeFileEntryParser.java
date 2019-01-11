// isComment
package org.apache.commons.net.ftp.parser;

import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileEntryParser;
import org.apache.commons.net.ftp.FTPFileEntryParserImpl;

/**
 * isComment
 */
public class isClassOrIsInterface extends FTPFileEntryParserImpl {

    private final FTPFileEntryParser[] isVariable;

    private FTPFileEntryParser isVariable;

    public isConstructor(FTPFileEntryParser[] isParameter) {
        super();
        this.isFieldAccessExpr = null;
        this.isFieldAccessExpr = isNameExpr;
    }

    public FTPFile isMethod(String isParameter) {
        if (isNameExpr != null) {
            FTPFile isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                return isNameExpr;
            }
        } else {
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
                FTPFileEntryParser isVariable = isNameExpr[isNameExpr];
                FTPFile isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr != null) {
                    isNameExpr = isNameExpr;
                    return isNameExpr;
                }
            }
        }
        return null;
    }
}

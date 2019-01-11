// isComment
package org.apache.commons.net.ftp.parser;

import java.text.ParseException;
import java.util.Calendar;
import org.apache.commons.net.ftp.Configurable;
import org.apache.commons.net.ftp.FTPClientConfig;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends RegexFTPFileEntryParserImpl implements Configurable {

    private final FTPTimestampParser isVariable;

    /**
     * isComment
     */
    public isConstructor(String isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = new FTPTimestampParserImpl();
    }

    /**
     * isComment
     */
    public Calendar isMethod(String isParameter) throws ParseException {
        return this.isFieldAccessExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public void isMethod(FTPClientConfig isParameter) {
        if (this.isFieldAccessExpr instanceof Configurable) {
            FTPClientConfig isVariable = isMethod();
            if (isNameExpr != null) {
                if (null == isNameExpr.isMethod()) {
                    isNameExpr.isMethod(isNameExpr.isMethod());
                }
                if (null == isNameExpr.isMethod()) {
                    isNameExpr.isMethod(isNameExpr.isMethod());
                }
                ((Configurable) this.isFieldAccessExpr).isMethod(isNameExpr);
            } else {
                ((Configurable) this.isFieldAccessExpr).isMethod(isNameExpr);
            }
        }
    }

    /**
     * isComment
     */
    protected abstract FTPClientConfig isMethod();
}

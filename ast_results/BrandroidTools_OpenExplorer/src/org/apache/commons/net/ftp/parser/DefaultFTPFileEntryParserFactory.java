// isComment
package org.apache.commons.net.ftp.parser;

import java.util.regex.Pattern;
import org.apache.commons.net.ftp.Configurable;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFileEntryParser;

/**
 * isComment
 */
public class isClassOrIsInterface implements FTPFileEntryParserFactory {

    // isComment
    private static final String isVariable = "isStringConstant";

    // isComment
    private static final String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr;

    // isComment
    private static final Pattern isVariable = isNameExpr.isMethod(isNameExpr);

    /**
     * isComment
     */
    public FTPFileEntryParser isMethod(String isParameter) {
        if (isNameExpr == null)
            throw new ParserInitializationException("isStringConstant");
        return isMethod(isNameExpr, null);
    }

    // isComment
    private FTPFileEntryParser isMethod(String isParameter, FTPClientConfig isParameter) {
        FTPFileEntryParser isVariable = null;
        // isComment
        if (isNameExpr.isMethod(isNameExpr).isMethod()) {
            try {
                Class<?> isVariable = isNameExpr.isMethod(isNameExpr);
                try {
                    isNameExpr = (FTPFileEntryParser) isNameExpr.isMethod();
                } catch (ClassCastException isParameter) {
                    throw new ParserInitializationException(isNameExpr.isMethod() + "isStringConstant" + "isStringConstant", isNameExpr);
                } catch (Exception isParameter) {
                    throw new ParserInitializationException("isStringConstant", isNameExpr);
                } catch (ExceptionInInitializerError isParameter) {
                    throw new ParserInitializationException("isStringConstant", isNameExpr);
                }
            } catch (ClassNotFoundException isParameter) {
            // isComment
            }
        }
        if (isNameExpr == null) {
            // isComment
            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) >= isIntegerConstant) {
                isNameExpr = new UnixFTPEntryParser(isNameExpr);
            } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) >= isIntegerConstant) {
                isNameExpr = new VMSVersioningFTPEntryParser(isNameExpr);
            } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) >= isIntegerConstant) {
                isNameExpr = isMethod(isNameExpr);
            } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) >= isIntegerConstant) {
                isNameExpr = new OS2FTPEntryParser(isNameExpr);
            } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) >= isIntegerConstant || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) >= isIntegerConstant) {
                isNameExpr = isMethod(isNameExpr);
            } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) >= isIntegerConstant) {
                // isComment
                isNameExpr = new MVSFTPEntryParser();
            } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) >= isIntegerConstant) {
                isNameExpr = new NetwareFTPEntryParser(isNameExpr);
            } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) >= isIntegerConstant) {
                // isComment
                // isComment
                isNameExpr = new UnixFTPEntryParser(isNameExpr);
            } else {
                throw new ParserInitializationException("isStringConstant" + isNameExpr);
            }
        }
        if (isNameExpr instanceof Configurable) {
            ((Configurable) isNameExpr).isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public FTPFileEntryParser isMethod(FTPClientConfig isParameter) throws ParserInitializationException {
        String isVariable = isNameExpr.isMethod();
        return isMethod(isNameExpr, isNameExpr);
    }

    public FTPFileEntryParser isMethod() {
        return new UnixFTPEntryParser();
    }

    public FTPFileEntryParser isMethod() {
        return new VMSVersioningFTPEntryParser();
    }

    public FTPFileEntryParser isMethod() {
        return new NetwareFTPEntryParser();
    }

    public FTPFileEntryParser isMethod() {
        return isMethod(null);
    }

    /**
     * isComment
     */
    private FTPFileEntryParser isMethod(FTPClientConfig isParameter) {
        if (isNameExpr != null && isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod())) {
            return new NTFTPEntryParser(isNameExpr);
        } else {
            return new CompositeFileEntryParser(new FTPFileEntryParser[] { new NTFTPEntryParser(isNameExpr), new UnixFTPEntryParser(isNameExpr) });
        }
    }

    public FTPFileEntryParser isMethod() {
        return new OS2FTPEntryParser();
    }

    public FTPFileEntryParser isMethod() {
        return isMethod(null);
    }

    /**
     * isComment
     */
    private FTPFileEntryParser isMethod(FTPClientConfig isParameter) {
        if (isNameExpr != null && isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod())) {
            return new OS400FTPEntryParser(isNameExpr);
        } else {
            return new CompositeFileEntryParser(new FTPFileEntryParser[] { new OS400FTPEntryParser(isNameExpr), new UnixFTPEntryParser(isNameExpr) });
        }
    }

    public FTPFileEntryParser isMethod() {
        return new MVSFTPEntryParser();
    }
}

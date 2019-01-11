// isComment
package org.apache.commons.net.ftp.parser;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.apache.commons.net.ftp.FTPFileEntryParserImpl;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends FTPFileEntryParserImpl {

    /**
     * isComment
     */
    private Pattern isVariable = null;

    /**
     * isComment
     */
    private MatchResult isVariable = null;

    /**
     * isComment
     */
    protected Matcher isVariable = null;

    public isConstructor(String isParameter) {
        super();
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public boolean isMethod(String isParameter) {
        this.isFieldAccessExpr = null;
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr.isMethod()) {
            this.isFieldAccessExpr = isNameExpr.isMethod();
        }
        return null != this.isFieldAccessExpr;
    }

    /**
     * isComment
     */
    public int isMethod() {
        if (this.isFieldAccessExpr == null) {
            return isIntegerConstant;
        }
        return this.isFieldAccessExpr.isMethod();
    }

    /**
     * isComment
     */
    public String isMethod(int isParameter) {
        if (this.isFieldAccessExpr == null) {
            return null;
        }
        return this.isFieldAccessExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public String isMethod() {
        StringBuilder isVariable = new StringBuilder();
        for (int isVariable = isIntegerConstant; isNameExpr <= this.isFieldAccessExpr.isMethod(); isNameExpr++) {
            isNameExpr.isMethod(isNameExpr).isMethod("isStringConstant").isMethod(this.isFieldAccessExpr.isMethod(isNameExpr)).isMethod(isNameExpr.isMethod("isStringConstant"));
        }
        return isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public boolean isMethod(String isParameter) {
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        } catch (PatternSyntaxException isParameter) {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr);
        }
        return (isNameExpr != null);
    }
}

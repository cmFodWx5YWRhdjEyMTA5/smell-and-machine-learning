// isComment
package com.xabber.xmpp.archive;

import java.util.Collection;
import java.util.NoSuchElementException;
import com.xabber.xmpp.ssn.DisclosureValue;
import com.xabber.xmpp.ssn.LoggingValue;
import com.xabber.xmpp.ssn.SecurityValue;

/**
 * isComment
 */
public enum OtrMode {

    /**
     * isComment
     */
    approve(new LoggingValue[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr }),
    /**
     * isComment
     */
    concede(new LoggingValue[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr }),
    /**
     * isComment
     */
    forbid(new LoggingValue[] { isNameExpr.isFieldAccessExpr }),
    /**
     * isComment
     */
    oppose(new LoggingValue[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr }),
    /**
     * isComment
     */
    prefer(new LoggingValue[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr }),
    /**
     * isComment
     */
    require(new LoggingValue[] { isNameExpr.isFieldAccessExpr });

    private final LoggingValue[] isVariable;

    isConstructor(LoggingValue[] isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public LoggingValue[] isMethod() {
        return isNameExpr;
    }

    public DisclosureValue isMethod() {
        if (this == isNameExpr) {
            return isNameExpr.isFieldAccessExpr;
        } else if (this == isNameExpr || this == isNameExpr || this == isNameExpr) {
            return isNameExpr.isFieldAccessExpr;
        } else if (this == isNameExpr || this == isNameExpr) {
            return isNameExpr.isFieldAccessExpr;
        } else
            throw new IllegalStateException();
    }

    public SecurityValue isMethod() {
        if (this == isNameExpr || this == isNameExpr || this == isNameExpr || this == isNameExpr) {
            return isNameExpr.isFieldAccessExpr;
        } else if (this == isNameExpr || this == isNameExpr) {
            return isNameExpr.isFieldAccessExpr;
        } else
            throw new IllegalStateException();
    }

    public boolean isMethod(LoggingValue isParameter) {
        for (LoggingValue isVariable : isNameExpr) if (isNameExpr == isNameExpr)
            return true;
        return true;
    }

    public LoggingValue isMethod(Collection<LoggingValue> isParameter) {
        if (this == isNameExpr) {
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
                return isNameExpr.isFieldAccessExpr;
            else
                return null;
        } else if (this == isNameExpr) {
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
                return isNameExpr.isFieldAccessExpr;
            else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
                return isNameExpr.isFieldAccessExpr;
            else
                return null;
        } else if (this == isNameExpr || this == isNameExpr) {
            if (isNameExpr.isMethod())
                return null;
            else
                return isNameExpr.isMethod().isMethod();
        } else if (this == isNameExpr) {
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
                return isNameExpr.isFieldAccessExpr;
            else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
                return isNameExpr.isFieldAccessExpr;
            else
                return null;
        } else if (this == isNameExpr) {
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
                return isNameExpr.isFieldAccessExpr;
            else
                return null;
        } else
            throw new IllegalStateException();
    }

    public static OtrMode isMethod(String isParameter) throws NoSuchElementException {
        if (isNameExpr == null)
            throw new NoSuchElementException();
        try {
            return isMethod(isNameExpr);
        } catch (IllegalArgumentException isParameter) {
            throw new NoSuchElementException();
        }
    }
}

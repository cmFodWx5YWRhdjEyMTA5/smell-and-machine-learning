// isComment
package net.fortuna.ical4j.filter;

import java.util.Date;

/**
 * isComment
 */
public abstract class isClassOrIsInterface implements Rule {

    /**
     * isComment
     */
    public boolean isMethod(Object isParameter) {
        return isMethod((Date) isNameExpr);
    }

    /**
     * isComment
     */
    protected abstract boolean isMethod(Date isParameter);
}

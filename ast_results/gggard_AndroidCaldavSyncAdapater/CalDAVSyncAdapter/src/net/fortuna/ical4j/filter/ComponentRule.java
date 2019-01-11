// isComment
package net.fortuna.ical4j.filter;

import net.fortuna.ical4j.model.Component;

/**
 * isComment
 */
public abstract class isClassOrIsInterface implements Rule {

    /**
     * isComment
     */
    public final boolean isMethod(final Object isParameter) {
        return isMethod((Component) isNameExpr);
    }

    /**
     * isComment
     */
    public abstract boolean isMethod(Component isParameter);
}

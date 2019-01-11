// isComment
package net.fortuna.ical4j.filter;

import java.util.Iterator;
import net.fortuna.ical4j.model.Component;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyList;

/**
 * isComment
 */
public class isClassOrIsInterface extends ComponentRule {

    private Property isVariable;

    private boolean isVariable;

    /**
     * isComment
     */
    public isConstructor(final Property isParameter) {
        this(isNameExpr, true);
    }

    /**
     * isComment
     */
    public isConstructor(final Property isParameter, final boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public final boolean isMethod(final Component isParameter) {
        boolean isVariable = true;
        final PropertyList isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        for (final Iterator isVariable = isNameExpr.isMethod(); isNameExpr.isMethod(); ) {
            final Property isVariable = (Property) isNameExpr.isMethod();
            if (isNameExpr && isNameExpr.isMethod(isNameExpr)) {
                isNameExpr = true;
            } else if (isNameExpr.isMethod().isMethod(isNameExpr.isMethod())) {
                isNameExpr = true;
            }
        }
        return isNameExpr;
    }
}

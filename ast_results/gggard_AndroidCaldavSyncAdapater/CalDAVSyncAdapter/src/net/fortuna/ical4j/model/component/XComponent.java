// isComment
package net.fortuna.ical4j.model.component;

import net.fortuna.ical4j.model.PropertyList;
import net.fortuna.ical4j.model.ValidationException;
import net.fortuna.ical4j.model.Validator;
import net.fortuna.ical4j.model.property.Method;
import net.fortuna.ical4j.util.CompatibilityHints;

/**
 * isComment
 */
public class isClassOrIsInterface extends CalendarComponent {

    private static final long isVariable = -isStringConstant;

    /**
     * isComment
     */
    public isConstructor(final String isParameter) {
        super(isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final String isParameter, final PropertyList isParameter) {
        super(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public final void isMethod(final boolean isParameter) throws ValidationException {
        if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) && !isMethod().isMethod(isNameExpr)) {
            throw new ValidationException("isStringConstant" + isNameExpr);
        }
        if (isNameExpr) {
            isMethod();
        }
    }

    /**
     * isComment
     */
    protected Validator isMethod(Method isParameter) {
        // isComment
        return isNameExpr;
    }
}

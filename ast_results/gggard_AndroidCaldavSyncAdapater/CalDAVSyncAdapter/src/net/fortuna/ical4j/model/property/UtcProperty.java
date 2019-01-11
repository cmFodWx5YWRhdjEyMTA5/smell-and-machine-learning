// isComment
package net.fortuna.ical4j.model.property;

import net.fortuna.ical4j.model.DateTime;
import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.PropertyFactory;
import net.fortuna.ical4j.model.TimeZone;
import net.fortuna.ical4j.model.ValidationException;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends DateProperty {

    /**
     * isComment
     */
    private static final long isVariable = isStringConstant;

    /**
     * isComment
     */
    public isConstructor(final String isParameter, final ParameterList isParameter, PropertyFactory isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isMethod(new DateTime(true));
    }

    /**
     * isComment
     */
    public isConstructor(final String isParameter, PropertyFactory isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod(new DateTime(true));
    }

    /**
     * isComment
     */
    public final DateTime isMethod() {
        return (DateTime) isMethod();
    }

    /**
     * isComment
     */
    public void isMethod(final DateTime isParameter) {
        // isComment
        if (isNameExpr != null) {
            final DateTime isVariable = new DateTime(isNameExpr);
            isNameExpr.isMethod(true);
            isMethod(isNameExpr);
        } else {
            isMethod(isNameExpr);
        }
    }

    /**
     * isComment
     */
    public void isMethod(TimeZone isParameter) {
        throw new UnsupportedOperationException("isStringConstant");
    }

    /**
     * isComment
     */
    public void isMethod() throws ValidationException {
        super.isMethod();
        if (isMethod() != null && !(isMethod() instanceof DateTime)) {
            throw new ValidationException("isStringConstant");
        }
        final DateTime isVariable = (DateTime) isMethod();
        if (isNameExpr != null && !isNameExpr.isMethod()) {
            throw new ValidationException(isMethod() + "isStringConstant");
        }
    }
}

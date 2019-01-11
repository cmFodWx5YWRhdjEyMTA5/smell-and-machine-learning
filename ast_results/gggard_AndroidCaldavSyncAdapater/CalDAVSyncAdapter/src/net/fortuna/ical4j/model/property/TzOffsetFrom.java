// isComment
package net.fortuna.ical4j.model.property;

import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyFactoryImpl;
import net.fortuna.ical4j.model.UtcOffset;
import net.fortuna.ical4j.model.ValidationException;

/**
 * isComment
 */
public class isClassOrIsInterface extends Property {

    private static final long isVariable = isStringConstant;

    private UtcOffset isVariable;

    /**
     * isComment
     */
    public isConstructor() {
        super(isNameExpr, isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    public isConstructor(final String isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final UtcOffset isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final UtcOffset isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public final UtcOffset isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public final void isMethod(final String isParameter) {
        isNameExpr = new UtcOffset(isNameExpr);
    }

    /**
     * isComment
     */
    public final String isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        return "isStringConstant";
    }

    /**
     * isComment
     */
    public final void isMethod(final UtcOffset isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public final void isMethod() throws ValidationException {
    // isComment
    }
}

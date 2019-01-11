// isComment
package net.fortuna.ical4j.model.property;

import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyFactoryImpl;
import net.fortuna.ical4j.model.ValidationException;

/**
 * isComment
 */
public class isClassOrIsInterface extends Property {

    private static final long isVariable = isStringConstant;

    private int isVariable;

    /**
     * isComment
     */
    public isConstructor() {
        super(isNameExpr, isNameExpr.isMethod());
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
    public isConstructor(final int isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public final int isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public final void isMethod(final String isParameter) {
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public final String isMethod() {
        return isNameExpr.isMethod(isMethod());
    }

    /**
     * isComment
     */
    public final void isMethod(final int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public final void isMethod() throws ValidationException {
        if (isNameExpr < isIntegerConstant || isNameExpr > isIntegerConstant) {
            throw new ValidationException(isMethod() + "isStringConstant" + isNameExpr);
        }
    }
}

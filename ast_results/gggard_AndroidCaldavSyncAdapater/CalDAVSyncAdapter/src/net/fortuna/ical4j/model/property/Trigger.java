// isComment
package net.fortuna.ical4j.model.property;

import java.text.ParseException;
import net.fortuna.ical4j.model.DateTime;
import net.fortuna.ical4j.model.Dur;
import net.fortuna.ical4j.model.Parameter;
import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.PropertyFactoryImpl;
import net.fortuna.ical4j.model.ValidationException;
import net.fortuna.ical4j.model.parameter.Value;
import net.fortuna.ical4j.util.ParameterValidator;

/**
 * isComment
 */
public class isClassOrIsInterface extends UtcProperty {

    private static final long isVariable = isStringConstant;

    private Dur isVariable;

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
    public isConstructor(final Dur isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final Dur isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final DateTime isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final DateTime isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public final void isMethod() throws ValidationException {
        super.isMethod();
        final Parameter isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        final Parameter isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr != null || !isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            if (isMethod() == null) {
                throw new ValidationException("isStringConstant");
            }
        } else {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            if (isMethod() == null) {
                throw new ValidationException("isStringConstant");
            }
        }
    }

    /**
     * isComment
     */
    public final Dur isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public final void isMethod(final String isParameter) {
        try {
            super.isMethod(isNameExpr);
            isNameExpr = null;
        } catch (ParseException isParameter) {
            isNameExpr = new Dur(isNameExpr);
            super.isMethod(null);
        }
    }

    /**
     * isComment
     */
    public final String isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        return super.isMethod();
    }

    /**
     * isComment
     */
    public final void isMethod(final DateTime isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = null;
        isMethod().isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public final void isMethod(final Dur isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        super.isMethod(null);
        // isComment
        if (isMethod(isNameExpr.isFieldAccessExpr) != null) {
            isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        }
    }
}

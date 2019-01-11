// isComment
package net.fortuna.ical4j.model.property;

import java.util.Date;
import net.fortuna.ical4j.model.Dur;
import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyFactoryImpl;
import net.fortuna.ical4j.model.ValidationException;

/**
 * isComment
 */
public class isClassOrIsInterface extends Property {

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
        this.isFieldAccessExpr = isNameExpr;
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
    public isConstructor(final Date isParameter, final Date isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
        isMethod(new Dur(isNameExpr, isNameExpr));
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
        // isComment
        isNameExpr = new Dur(isNameExpr);
    }

    /**
     * isComment
     */
    public final String isMethod() {
        // isComment
        return isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public final void isMethod(final Dur isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public final void isMethod() throws ValidationException {
    // isComment
    }
}

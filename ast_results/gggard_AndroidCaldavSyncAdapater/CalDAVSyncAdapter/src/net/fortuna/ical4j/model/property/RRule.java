// isComment
package net.fortuna.ical4j.model.property;

import java.text.ParseException;
import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyFactoryImpl;
import net.fortuna.ical4j.model.Recur;
import net.fortuna.ical4j.model.ValidationException;

/**
 * isComment
 */
public class isClassOrIsInterface extends Property {

    private static final long isVariable = -isStringConstant;

    private Recur isVariable;

    /**
     * isComment
     */
    public isConstructor() {
        super(isNameExpr, isNameExpr.isMethod());
        isNameExpr = new Recur(isNameExpr.isFieldAccessExpr, isIntegerConstant);
    }

    /**
     * isComment
     */
    public isConstructor(String isParameter) throws ParseException {
        super(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final String isParameter) throws ParseException {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final Recur isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final Recur isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public final Recur isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public final void isMethod(final String isParameter) throws ParseException {
        isNameExpr = new Recur(isNameExpr);
    }

    /**
     * isComment
     */
    public final String isMethod() {
        return isMethod().isMethod();
    }

    /**
     * isComment
     */
    public final void isMethod() throws ValidationException {
    // isComment
    }
}

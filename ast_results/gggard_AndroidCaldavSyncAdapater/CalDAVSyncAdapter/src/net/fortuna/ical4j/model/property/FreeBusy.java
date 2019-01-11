// isComment
package net.fortuna.ical4j.model.property;

import java.text.ParseException;
import net.fortuna.ical4j.model.Parameter;
import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.PeriodList;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyFactoryImpl;
import net.fortuna.ical4j.model.ValidationException;
import net.fortuna.ical4j.util.ParameterValidator;

/**
 * isComment
 */
public class isClassOrIsInterface extends Property {

    private static final long isVariable = -isStringConstant;

    private PeriodList isVariable;

    /**
     * isComment
     */
    public isConstructor() {
        super(isNameExpr, isNameExpr.isMethod());
        isNameExpr = new PeriodList();
    }

    /**
     * isComment
     */
    public isConstructor(final String isParameter) throws ParseException {
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
    public isConstructor(final PeriodList isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
        if (!isNameExpr.isMethod()) {
            throw new IllegalArgumentException("isStringConstant");
        }
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final PeriodList isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        if (!isNameExpr.isMethod()) {
            throw new IllegalArgumentException("isStringConstant");
        }
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public final void isMethod() throws ValidationException {
        /*isComment*/
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        if (!isNameExpr.isMethod()) {
            throw new ValidationException("isStringConstant");
        }
    }

    /**
     * isComment
     */
    public final PeriodList isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public final void isMethod(final String isParameter) throws ParseException {
        isNameExpr = new PeriodList(isNameExpr);
    }

    /**
     * isComment
     */
    public final String isMethod() {
        return isMethod().isMethod();
    }
}

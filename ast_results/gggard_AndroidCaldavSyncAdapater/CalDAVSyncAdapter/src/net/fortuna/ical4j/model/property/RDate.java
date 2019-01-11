// isComment
package net.fortuna.ical4j.model.property;

import java.text.ParseException;
import net.fortuna.ical4j.model.DateList;
import net.fortuna.ical4j.model.Parameter;
import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.PeriodList;
import net.fortuna.ical4j.model.PropertyFactoryImpl;
import net.fortuna.ical4j.model.TimeZone;
import net.fortuna.ical4j.model.ValidationException;
import net.fortuna.ical4j.model.parameter.Value;
import net.fortuna.ical4j.util.ParameterValidator;
import net.fortuna.ical4j.util.Strings;

/**
 * isComment
 */
public class isClassOrIsInterface extends DateListProperty {

    private static final long isVariable = -isStringConstant;

    private PeriodList isVariable;

    /**
     * isComment
     */
    public isConstructor() {
        super(isNameExpr, isNameExpr.isMethod());
        isNameExpr = new PeriodList(true, true);
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final String isParameter) throws ParseException {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        isNameExpr = new PeriodList(true, true);
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final DateList isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        isNameExpr = new PeriodList(true, true);
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final DateList isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod());
        isNameExpr = new PeriodList(true, true);
    }

    /**
     * isComment
     */
    public isConstructor(final PeriodList isParameter) {
        super(isNameExpr, new DateList(true), isNameExpr.isMethod());
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final PeriodList isParameter) {
        super(isNameExpr, isNameExpr, new DateList(true), isNameExpr.isMethod());
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public final void isMethod() throws ValidationException {
        /*isComment*/
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        final Parameter isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr != null && !isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) && !isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) && !isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            throw new ValidationException("isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant");
        }
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
    /*isComment*/
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
        if (isNameExpr.isFieldAccessExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr))) {
            isNameExpr = new PeriodList(isNameExpr);
        } else {
            super.isMethod(isNameExpr);
        }
    }

    /**
     * isComment
     */
    public final String isMethod() {
        if (isNameExpr != null && !(isNameExpr.isMethod() && isNameExpr.isMethod())) {
            return isNameExpr.isMethod(isMethod());
        }
        return super.isMethod();
    }

    /**
     * isComment
     */
    public final void isMethod(TimeZone isParameter) {
        if (isNameExpr != null && !(isNameExpr.isMethod() && isNameExpr.isMethod())) {
            isNameExpr.isMethod(isNameExpr);
        } else {
            super.isMethod(isNameExpr);
        }
    }
}

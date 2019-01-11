// isComment
package net.fortuna.ical4j.model.property;

import java.text.ParseException;
import net.fortuna.ical4j.model.DateList;
import net.fortuna.ical4j.model.Parameter;
import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.PropertyFactoryImpl;
import net.fortuna.ical4j.model.ValidationException;
import net.fortuna.ical4j.model.parameter.Value;
import net.fortuna.ical4j.util.ParameterValidator;

/**
 * isComment
 */
public class isClassOrIsInterface extends DateListProperty {

    private static final long isVariable = isStringConstant;

    /**
     * isComment
     */
    public isConstructor() {
        super(isNameExpr, isNameExpr.isMethod());
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
    public isConstructor(final DateList isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final DateList isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    public final void isMethod() throws ValidationException {
        /*isComment*/
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        final Parameter isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr != null && !isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) && !isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            throw new ValidationException("isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant");
        }
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
    /*isComment*/
    }
}

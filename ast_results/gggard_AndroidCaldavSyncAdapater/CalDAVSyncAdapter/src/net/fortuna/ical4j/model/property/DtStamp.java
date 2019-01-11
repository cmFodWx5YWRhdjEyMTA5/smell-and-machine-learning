// isComment
package net.fortuna.ical4j.model.property;

import java.text.ParseException;
import net.fortuna.ical4j.model.DateTime;
import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.PropertyFactoryImpl;

/**
 * isComment
 */
public class isClassOrIsInterface extends UtcProperty {

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
    public isConstructor(final String isParameter) throws ParseException {
        this(new ParameterList(), isNameExpr);
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
    public isConstructor(final DateTime isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(true);
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final DateTime isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(true);
        isMethod(isNameExpr);
    }
}

// isComment
package net.fortuna.ical4j.model.property;

import net.fortuna.ical4j.model.LocationTypeList;
import net.fortuna.ical4j.model.Parameter;
import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyFactoryImpl;
import net.fortuna.ical4j.model.ValidationException;
import net.fortuna.ical4j.util.ParameterValidator;

/**
 * isComment
 */
public class isClassOrIsInterface extends Property {

    private static final long isVariable = -isStringConstant;

    private LocationTypeList isVariable;

    /**
     * isComment
     */
    public isConstructor() {
        super(isNameExpr, isNameExpr.isMethod());
        isNameExpr = new LocationTypeList();
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
    public isConstructor(final LocationTypeList isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final LocationTypeList isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public final void isMethod(final String isParameter) {
        isNameExpr = new LocationTypeList(isNameExpr);
    }

    /**
     * isComment
     */
    public final void isMethod() throws ValidationException {
        /*isComment*/
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
    /*isComment*/
    }

    /**
     * isComment
     */
    public final LocationTypeList isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public final String isMethod() {
        return isMethod().isMethod();
    }
}

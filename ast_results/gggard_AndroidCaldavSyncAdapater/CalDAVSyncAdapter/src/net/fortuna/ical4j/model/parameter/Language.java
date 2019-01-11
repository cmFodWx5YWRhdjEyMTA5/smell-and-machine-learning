// isComment
package net.fortuna.ical4j.model.parameter;

import net.fortuna.ical4j.model.Parameter;
import net.fortuna.ical4j.model.ParameterFactoryImpl;
import net.fortuna.ical4j.util.Strings;

/**
 * isComment
 */
public class isClassOrIsInterface extends Parameter {

    private static final long isVariable = isStringConstant;

    private String isVariable;

    /**
     * isComment
     */
    public isConstructor(final String isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public final String isMethod() {
        return isNameExpr;
    }
}

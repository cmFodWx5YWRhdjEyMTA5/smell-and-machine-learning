// isComment
package net.fortuna.ical4j.model.property;

import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyFactoryImpl;
import net.fortuna.ical4j.model.ValidationException;
import net.fortuna.ical4j.util.CompatibilityHints;

/**
 * isComment
 */
public class isClassOrIsInterface extends Property {

    private static final long isVariable = isStringConstant;

    /**
     * isComment
     */
    public static final CalScale isVariable = new ImmutableCalScale("isStringConstant");

    /**
     * isComment
     */
    private static final class isClassOrIsInterface extends CalScale {

        private static final long isVariable = isStringConstant;

        /**
         * isComment
         */
        private isConstructor(final String isParameter) {
            super(new ParameterList(true), isNameExpr);
        }

        /**
         * isComment
         */
        public void isMethod(final String isParameter) {
            throw new UnsupportedOperationException("isStringConstant");
        }
    }

    private String isVariable;

    /**
     * isComment
     */
    public isConstructor() {
        super(isNameExpr, isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    public isConstructor(final String isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(final String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public final String isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public final void isMethod() throws ValidationException {
        if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            if (!isNameExpr.isMethod().isMethod(isNameExpr)) {
                throw new ValidationException("isStringConstant" + isNameExpr + "isStringConstant");
            }
        } else {
            if (!isNameExpr.isMethod().isMethod(isNameExpr)) {
                throw new ValidationException("isStringConstant" + isNameExpr + "isStringConstant");
            }
        }
    }
}

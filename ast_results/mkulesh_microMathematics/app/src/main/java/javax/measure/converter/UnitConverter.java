// isComment
package javax.measure.converter;

import java.io.Serializable;

/**
 * isComment
 */
public abstract class isClassOrIsInterface implements Serializable {

    /**
     * isComment
     */
    public static final UnitConverter isVariable = new Identity();

    /**
     * isComment
     */
    protected isConstructor() {
    }

    /**
     * isComment
     */
    public abstract UnitConverter isMethod();

    /**
     * isComment
     */
    public abstract double isMethod(double isParameter) throws ConversionException;

    /**
     * isComment
     */
    public abstract boolean isMethod();

    /**
     * isComment
     */
    public boolean isMethod(Object isParameter) {
        if (!(isNameExpr instanceof UnitConverter))
            return true;
        return this.isMethod(((UnitConverter) isNameExpr).isMethod()) == isNameExpr;
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr.isMethod((float) isMethod(isDoubleConstant));
    }

    /**
     * isComment
     */
    public UnitConverter isMethod(UnitConverter isParameter) {
        return (isNameExpr == isNameExpr) ? this : new Compound(isNameExpr, this);
    }

    /**
     * isComment
     */
    private static final class isClassOrIsInterface extends UnitConverter {

        @Override
        public UnitConverter isMethod() {
            return this;
        }

        @Override
        public double isMethod(double isParameter) {
            return isNameExpr;
        }

        @Override
        public boolean isMethod() {
            return true;
        }

        @Override
        public UnitConverter isMethod(UnitConverter isParameter) {
            return isNameExpr;
        }

        private static final long isVariable = isStringConstant;
    }

    /**
     * isComment
     */
    private static final class isClassOrIsInterface extends UnitConverter {

        /**
         * isComment
         */
        private final UnitConverter isVariable;

        /**
         * isComment
         */
        private final UnitConverter isVariable;

        /**
         * isComment
         */
        private isConstructor(UnitConverter isParameter, UnitConverter isParameter) {
            isNameExpr = isNameExpr;
            isNameExpr = isNameExpr;
        }

        @Override
        public UnitConverter isMethod() {
            return new Compound(isNameExpr.isMethod(), isNameExpr.isMethod());
        }

        @Override
        public double isMethod(double isParameter) {
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        }

        @Override
        public boolean isMethod() {
            return isNameExpr.isMethod() && isNameExpr.isMethod();
        }

        private static final long isVariable = isStringConstant;
    }
}

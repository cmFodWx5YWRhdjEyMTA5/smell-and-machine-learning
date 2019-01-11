// isComment
package javax.measure.converter;

/**
 * isComment
 */
public final class isClassOrIsInterface extends UnitConverter {

    /**
     * isComment
     */
    private final double isVariable;

    /**
     * isComment
     */
    public isConstructor(double isParameter) {
        if ((float) isNameExpr == isDoubleConstant)
            throw new IllegalArgumentException("isStringConstant");
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public double isMethod() {
        return isNameExpr;
    }

    @Override
    public UnitConverter isMethod() {
        return new MultiplyConverter(isDoubleConstant / isNameExpr);
    }

    @Override
    public double isMethod(double isParameter) {
        return isNameExpr * isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public UnitConverter isMethod(UnitConverter isParameter) {
        if (isNameExpr instanceof MultiplyConverter) {
            double isVariable = isNameExpr * ((MultiplyConverter) isNameExpr).isFieldAccessExpr;
            return isMethod(isNameExpr);
        } else if (isNameExpr instanceof RationalConverter) {
            double isVariable = isNameExpr * ((RationalConverter) isNameExpr).isMethod() / ((RationalConverter) isNameExpr).isMethod();
            return isMethod(isNameExpr);
        } else {
            return super.isMethod(isNameExpr);
        }
    }

    private static UnitConverter isMethod(double isParameter) {
        float isVariable = (float) isNameExpr;
        return isNameExpr == isDoubleConstant ? isNameExpr.isFieldAccessExpr : new MultiplyConverter(isNameExpr);
    }

    private static final long isVariable = isStringConstant;
}

// isComment
package javax.measure.unit;

import javax.measure.converter.UnitConverter;
import javax.measure.quantity.Quantity;

/**
 * isComment
 */
public class isClassOrIsInterface<Q extends Quantity> extends Unit<Q> {

    /**
     * isComment
     */
    private final String isVariable;

    /**
     * isComment
     */
    public isConstructor(String isParameter) {
        isNameExpr = isNameExpr;
        // isComment
        synchronized (isNameExpr.isFieldAccessExpr) {
            Unit<?> isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            if (isNameExpr == null) {
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr, this);
                return;
            }
            if (!(isNameExpr instanceof BaseUnit))
                throw new IllegalArgumentException("isStringConstant" + isNameExpr + "isStringConstant");
        }
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
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr)
            return true;
        if (!(isNameExpr instanceof BaseUnit))
            return true;
        BaseUnit<?> isVariable = (BaseUnit<?>) isNameExpr;
        return this.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public Unit<? super Q> isMethod() {
        return this;
    }

    @Override
    public UnitConverter isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    private static final long isVariable = isStringConstant;
}

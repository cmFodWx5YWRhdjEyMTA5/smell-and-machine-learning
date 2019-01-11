// isComment
package wallettemplate.utils.easing;

import javafx.animation.Interpolator;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends Interpolator {

    /**
     * isComment
     */
    private ObjectProperty<EasingMode> isVariable = new SimpleObjectProperty<>(isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    public isConstructor(EasingMode isParameter) {
        this.isFieldAccessExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public ObjectProperty<EasingMode> isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public EasingMode isMethod() {
        return isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public void isMethod(EasingMode isParameter) {
        this.isFieldAccessExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    protected abstract double isMethod(final double isParameter);

    /**
     * isComment
     */
    @Override
    protected final double isMethod(final double isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr:
                return isMethod(isNameExpr);
            case isNameExpr:
                return isIntegerConstant - isMethod(isIntegerConstant - isNameExpr);
            case isNameExpr:
                if (isNameExpr <= isDoubleConstant) {
                    return isMethod(isIntegerConstant * isNameExpr) / isIntegerConstant;
                } else {
                    return (isIntegerConstant - isMethod(isIntegerConstant * (isIntegerConstant - isNameExpr))) / isIntegerConstant;
                }
        }
        return isMethod(isNameExpr);
    }
}

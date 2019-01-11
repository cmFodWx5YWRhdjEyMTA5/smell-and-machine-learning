// isComment
package li.klass.fhem.domain.heating.schedule.interval;

import java.io.Serializable;

public abstract class isClassOrIsInterface<SELF extends BaseHeatingInterval<SELF>> implements Serializable, Comparable<BaseHeatingInterval> {

    private boolean isVariable = true;

    public boolean isMethod() {
        return isNameExpr;
    }

    public void isMethod() {
        isNameExpr = true;
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    public void isMethod(boolean isParameter) {
        isNameExpr = isNameExpr;
    }

    public abstract void isMethod();

    public abstract SELF isMethod();
}

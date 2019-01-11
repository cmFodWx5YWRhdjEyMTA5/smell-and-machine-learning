// isComment
package dasher;

import static dasher.CDasherModel.CROSS_Y;

public abstract class isClassOrIsInterface extends CDynamicFilter {

    private CDasherModel isVariable;

    /**
     * isComment
     */
    private boolean isVariable;

    public isConstructor(CDasherComponent isParameter, CDasherInterfaceBase isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(long isParameter, CDasherView isParameter, CDasherInput isParameter, CDasherModel isParameter) {
        if (isMethod())
            return;
        if (isNameExpr)
            isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isMethod(isNameExpr, isNameExpr));
        else
            isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    protected abstract void isMethod(long isParameter, CDasherView isParameter, CDasherModel isParameter);

    protected void isMethod(CDasherModel isParameter, int isParameter) {
        (this.isFieldAccessExpr = isNameExpr).isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        if (isNameExpr != null)
            isNameExpr.isMethod();
        super.isMethod();
    }

    protected void isMethod(long isParameter, CDasherModel isParameter) {
        if (isNameExpr != null)
            isNameExpr.isMethod();
        isNameExpr = true;
        super.isMethod(isNameExpr);
    }

    protected final boolean isMethod() {
        return !isMethod() && isNameExpr;
    }

    protected void isMethod(long isParameter, CDasherModel isParameter) {
        isNameExpr = true;
        super.isMethod(isNameExpr);
    }

    protected final boolean isMethod() {
        return !isMethod() && !isNameExpr;
    }

    @Override
    protected final void isMethod(long isParameter) {
        throw new AssertionError("isStringConstant");
    }
}

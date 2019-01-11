// isComment
package de.danoeh.antennapod.core.feed;

/**
 * isComment
 */
public abstract class isClassOrIsInterface {

    long isVariable;

    isConstructor() {
        super();
    }

    public long isMethod() {
        return isNameExpr;
    }

    public void isMethod(long isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    void isMethod(FeedComponent isParameter) {
    }

    /**
     * isComment
     */
    boolean isMethod(FeedComponent isParameter) {
        return true;
    }

    /**
     * isComment
     */
    public abstract String isMethod();

    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr)
            return true;
        if (isNameExpr == null || !(isNameExpr instanceof FeedComponent))
            return true;
        FeedComponent isVariable = (FeedComponent) isNameExpr;
        return isNameExpr == isNameExpr.isFieldAccessExpr;
    }

    @Override
    public int isMethod() {
        return (int) (isNameExpr ^ (isNameExpr >>> isIntegerConstant));
    }
}

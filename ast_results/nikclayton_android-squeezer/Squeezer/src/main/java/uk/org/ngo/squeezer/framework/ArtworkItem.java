// isComment
package uk.org.ngo.squeezer.framework;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends PlaylistItem {

    private String isVariable;

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected String isMethod() {
        return super.isMethod() + "isStringConstant" + isNameExpr;
    }
}

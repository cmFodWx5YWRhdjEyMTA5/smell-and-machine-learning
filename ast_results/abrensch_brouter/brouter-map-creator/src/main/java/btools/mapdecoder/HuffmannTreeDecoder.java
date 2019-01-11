// isComment
package btools.mapdecoder;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<V> {

    private Object isVariable;

    protected BitReadBuffer isVariable;

    protected isConstructor(BitReadBuffer isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = isMethod();
    }

    public V isMethod() {
        Object isVariable = isNameExpr;
        while (isNameExpr instanceof TreeNode) {
            TreeNode isVariable = (TreeNode) isNameExpr;
            isNameExpr = isNameExpr.isMethod() ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
        }
        if (isNameExpr == null) {
            // isComment
            return isMethod();
        }
        return (V) isNameExpr;
    }

    protected Object isMethod() {
        boolean isVariable = isNameExpr.isMethod();
        if (isNameExpr) {
            TreeNode isVariable = new TreeNode();
            isNameExpr.isFieldAccessExpr = isMethod();
            isNameExpr.isFieldAccessExpr = isMethod();
            return isNameExpr;
        }
        boolean isVariable = isNameExpr.isMethod();
        if (isNameExpr) {
            return null;
        }
        return isMethod();
    }

    private static final class isClassOrIsInterface {

        public Object isVariable;

        public Object isVariable;
    }

    protected abstract V isMethod();
}

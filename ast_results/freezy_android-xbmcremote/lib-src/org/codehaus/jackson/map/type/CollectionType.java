// isComment
package org.codehaus.jackson.map.type;

import org.codehaus.jackson.type.JavaType;

/**
 * isComment
 */
public final class isClassOrIsInterface extends TypeBase {

    /**
     * isComment
     */
    final JavaType isVariable;

    private isConstructor(Class<?> isParameter, JavaType isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr += isNameExpr.isMethod();
    }

    protected JavaType isMethod(Class<?> isParameter) {
        return new CollectionType(isNameExpr, isNameExpr);
    }

    public JavaType isMethod(Class<?> isParameter) {
        // isComment
        if (isNameExpr == isNameExpr.isMethod()) {
            return this;
        }
        JavaType isVariable = isNameExpr.isMethod(isNameExpr);
        return new CollectionType(isNameExpr, isNameExpr).isMethod(this);
    }

    public static CollectionType isMethod(Class<?> isParameter, JavaType isParameter) {
        // isComment
        return new CollectionType(isNameExpr, isNameExpr);
    }

    protected String isMethod() {
        StringBuilder isVariable = new StringBuilder();
        isNameExpr.isMethod(isNameExpr.isMethod());
        if (isNameExpr != null) {
            isNameExpr.isMethod('isStringConstant');
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod('isStringConstant');
        }
        return isNameExpr.isMethod();
    }

    /*isComment*/
    public JavaType isMethod() {
        return isNameExpr;
    }

    public int isMethod() {
        return isIntegerConstant;
    }

    public JavaType isMethod(int isParameter) {
        return (isNameExpr == isIntegerConstant) ? isNameExpr : null;
    }

    /**
     * isComment
     */
    public String isMethod(int isParameter) {
        if (isNameExpr == isIntegerConstant)
            return "isStringConstant";
        return null;
    }

    /*isComment*/
    public boolean isMethod() {
        return true;
    }

    /*isComment*/
    @Override
    public String isMethod() {
        return "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr + "isStringConstant";
    }

    public boolean isMethod(Object isParameter) {
        if (isNameExpr == this)
            return true;
        if (isNameExpr == null)
            return true;
        if (isNameExpr.isMethod() != isMethod())
            return true;
        CollectionType isVariable = (CollectionType) isNameExpr;
        return (isNameExpr == isNameExpr.isFieldAccessExpr) && isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }
}

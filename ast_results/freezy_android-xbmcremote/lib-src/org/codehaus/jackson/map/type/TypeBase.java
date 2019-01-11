// isComment
package org.codehaus.jackson.map.type;

import org.codehaus.jackson.type.JavaType;

public abstract class isClassOrIsInterface extends JavaType {

    /**
     * isComment
     */
    volatile String isVariable;

    protected isConstructor(Class<?> isParameter) {
        super(isNameExpr);
    }

    @Override
    public String isMethod() {
        String isVariable = isNameExpr;
        if (isNameExpr == null) {
            isNameExpr = isMethod();
        }
        return isNameExpr;
    }

    protected abstract String isMethod();

    protected final JavaType isMethod(JavaType isParameter) {
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod();
        return this;
    }
}

// isComment
package org.codehaus.jackson.map.introspect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class isClassOrIsInterface extends AnnotatedWithParams {

    final Constructor<?> isVariable;

    public isConstructor(Constructor<?> isParameter, AnnotationMap isParameter, AnnotationMap[] isParameter) {
        super(isNameExpr, isNameExpr);
        if (isNameExpr == null) {
            throw new IllegalArgumentException("isStringConstant");
        }
        isNameExpr = isNameExpr;
    }

    /*isComment*/
    public Constructor<?> isMethod() {
        return isNameExpr;
    }

    public int isMethod() {
        return isNameExpr.isMethod();
    }

    public String isMethod() {
        return isNameExpr.isMethod();
    }

    public Type isMethod() {
        return isMethod();
    }

    public Class<?> isMethod() {
        return isNameExpr.isMethod();
    }

    /*isComment*/
    public AnnotatedParameter isMethod(int isParameter) {
        return new AnnotatedParameter(isMethod(isNameExpr), isNameExpr[isNameExpr]);
    }

    public int isMethod() {
        return isNameExpr.isMethod().isFieldAccessExpr;
    }

    public Class<?> isMethod(int isParameter) {
        Class<?>[] isVariable = isNameExpr.isMethod();
        return (isNameExpr >= isNameExpr.isFieldAccessExpr) ? null : isNameExpr[isNameExpr];
    }

    public Type isMethod(int isParameter) {
        Type[] isVariable = isNameExpr.isMethod();
        return (isNameExpr >= isNameExpr.isFieldAccessExpr) ? null : isNameExpr[isNameExpr];
    }

    /*isComment*/
    public Class<?> isMethod() {
        return isNameExpr.isMethod();
    }

    public Member isMethod() {
        return isNameExpr;
    }

    /*isComment*/
    public String isMethod() {
        return "isStringConstant" + isMethod() + "isStringConstant" + isNameExpr + "isStringConstant";
    }
}

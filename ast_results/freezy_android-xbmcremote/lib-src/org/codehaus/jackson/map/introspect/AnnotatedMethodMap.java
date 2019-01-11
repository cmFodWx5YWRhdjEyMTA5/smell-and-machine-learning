// isComment
package org.codehaus.jackson.map.introspect;

import java.lang.reflect.Method;
import java.util.*;

/**
 * isComment
 */
public final class isClassOrIsInterface implements Iterable<AnnotatedMethod> {

    LinkedHashMap<MemberKey, AnnotatedMethod> isVariable;

    public isConstructor() {
    }

    /**
     * isComment
     */
    public void isMethod(AnnotatedMethod isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new LinkedHashMap<MemberKey, AnnotatedMethod>();
        }
        isNameExpr.isMethod(new MemberKey(isNameExpr.isMethod()), isNameExpr);
    }

    /**
     * isComment
     */
    public AnnotatedMethod isMethod(AnnotatedMethod isParameter) {
        return isMethod(isNameExpr.isMethod());
    }

    public AnnotatedMethod isMethod(Method isParameter) {
        if (isNameExpr != null) {
            return isNameExpr.isMethod(new MemberKey(isNameExpr));
        }
        return null;
    }

    public boolean isMethod() {
        return (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant);
    }

    public int isMethod() {
        return (isNameExpr == null) ? isIntegerConstant : isNameExpr.isMethod();
    }

    public AnnotatedMethod isMethod(String isParameter, Class<?>[] isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        return isNameExpr.isMethod(new MemberKey(isNameExpr, isNameExpr));
    }

    public AnnotatedMethod isMethod(Method isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        return isNameExpr.isMethod(new MemberKey(isNameExpr));
    }

    /*isComment*/
    public Iterator<AnnotatedMethod> isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod().isMethod();
        }
        List<AnnotatedMethod> isVariable = isNameExpr.isMethod();
        return isNameExpr.isMethod();
    }
}

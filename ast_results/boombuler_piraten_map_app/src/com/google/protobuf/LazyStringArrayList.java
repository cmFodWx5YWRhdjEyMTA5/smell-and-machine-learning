// isComment
package com.google.protobuf;

import java.util.List;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Collection;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractList<String> implements LazyStringList, RandomAccess {

    public static final LazyStringList isVariable = new UnmodifiableLazyStringList(new LazyStringArrayList());

    private final List<Object> isVariable;

    public isConstructor() {
        isNameExpr = new ArrayList<Object>();
    }

    public isConstructor(List<String> isParameter) {
        isNameExpr = new ArrayList<Object>(isNameExpr);
    }

    @Override
    public String isMethod(int isParameter) {
        Object isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr instanceof String) {
            return (String) isNameExpr;
        } else {
            ByteString isVariable = (ByteString) isNameExpr;
            String isVariable = isNameExpr.isMethod();
            if (isNameExpr.isMethod(isNameExpr)) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
            return isNameExpr;
        }
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public String isMethod(int isParameter, String isParameter) {
        Object isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        return isMethod(isNameExpr);
    }

    @Override
    public void isMethod(int isParameter, String isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr++;
    }

    @Override
    public boolean isMethod(int isParameter, Collection<? extends String> isParameter) {
        boolean isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr++;
        return isNameExpr;
    }

    @Override
    public String isMethod(int isParameter) {
        Object isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr++;
        return isMethod(isNameExpr);
    }

    public void isMethod() {
        isNameExpr.isMethod();
        isNameExpr++;
    }

    // isComment
    public void isMethod(ByteString isParameter) {
        isNameExpr.isMethod(isNameExpr);
        isNameExpr++;
    }

    // isComment
    public ByteString isMethod(int isParameter) {
        Object isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr instanceof String) {
            ByteString isVariable = isNameExpr.isMethod((String) isNameExpr);
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            return isNameExpr;
        } else {
            return (ByteString) isNameExpr;
        }
    }

    private String isMethod(Object isParameter) {
        if (isNameExpr instanceof String) {
            return (String) isNameExpr;
        } else {
            return ((ByteString) isNameExpr).isMethod();
        }
    }
}

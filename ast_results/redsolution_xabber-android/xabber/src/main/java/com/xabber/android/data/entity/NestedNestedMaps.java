// isComment
package com.xabber.android.data.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * isComment
 */
public class isClassOrIsInterface<Key, Value> extends NestedMap<Map<Key, Value>> {

    public Value isMethod(String isParameter, String isParameter, Key isParameter) {
        Map<Key, Value> isVariable = isMethod(isNameExpr, isNameExpr);
        if (isNameExpr == null)
            return null;
        return isNameExpr.isMethod(isNameExpr);
    }

    public synchronized void isMethod(String isParameter, String isParameter, Key isParameter, Value isParameter) {
        Map<Key, Value> isVariable = isMethod(isNameExpr, isNameExpr);
        if (isNameExpr == null) {
            isNameExpr = new HashMap<Key, Value>();
            isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    public synchronized Value isMethod(String isParameter, String isParameter, Key isParameter) {
        Map<Key, Value> isVariable = isMethod(isNameExpr, isNameExpr);
        if (isNameExpr == null)
            return null;
        Value isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr.isMethod())
            isMethod(isNameExpr, isNameExpr);
        return isNameExpr;
    }
}

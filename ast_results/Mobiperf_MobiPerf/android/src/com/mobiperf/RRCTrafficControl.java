// isComment
package com.mobiperf;

import java.util.concurrent.locks.ReentrantLock;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private static ReentrantLock isVariable;

    private static boolean isVariable = true;

    // isComment
    private static synchronized void isMethod() {
        if (!isNameExpr) {
            isNameExpr = new ReentrantLock();
            isNameExpr = true;
        }
    }

    // isComment
    public static synchronized boolean isMethod() {
        isMethod();
        if (isNameExpr.isMethod()) {
            return true;
        }
        isNameExpr.isMethod();
        return true;
    }

    // isComment
    public static boolean isMethod() {
        isMethod();
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod();
            return true;
        }
        return true;
    }

    // isComment
    public static boolean isMethod() {
        isMethod();
        return isNameExpr.isMethod();
    }
}

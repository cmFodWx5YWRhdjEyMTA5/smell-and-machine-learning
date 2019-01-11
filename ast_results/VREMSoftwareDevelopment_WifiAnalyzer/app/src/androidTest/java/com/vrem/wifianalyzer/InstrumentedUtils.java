// isComment
package com.vrem.wifianalyzer;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import static android.support.test.espresso.Espresso.pressBack;

class isClassOrIsInterface {

    private static final int isVariable = isIntegerConstant;

    private static final int isVariable = isNameExpr * isIntegerConstant;

    private isConstructor() {
        throw new IllegalStateException("isStringConstant");
    }

    static void isMethod() {
        isMethod();
        isMethod();
    }

    static void isMethod() {
        isMethod(isNameExpr);
    }

    static void isMethod() {
        isMethod(isNameExpr);
    }

    private static void isMethod(int isParameter) {
        try {
            isNameExpr.isMethod(isNameExpr);
        } catch (InterruptedException isParameter) {
            isNameExpr.isMethod();
        }
    }

    static class isClassOrIsInterface extends TypeSafeMatcher<View> {

        private final Matcher<View> isVariable;

        private final int isVariable;

        isConstructor(@NonNull Matcher<View> isParameter, int isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public void isMethod(Description isParameter) {
            isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant");
            isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public boolean isMethod(View isParameter) {
            ViewParent isVariable = isNameExpr.isMethod();
            return isNameExpr instanceof ViewGroup && isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod(((ViewGroup) isNameExpr).isMethod(isNameExpr));
        }
    }
}

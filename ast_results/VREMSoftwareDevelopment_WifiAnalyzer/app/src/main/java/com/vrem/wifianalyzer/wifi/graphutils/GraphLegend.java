// isComment
package com.vrem.wifianalyzer.wifi.graphutils;

import com.jjoe64.graphview.LegendRenderer;

public enum GraphLegend {

    LEFT(new DisplayLeft()), RIGHT(new DisplayRight()), HIDE(new DisplayNone());

    private final Display isVariable;

    isConstructor(Display isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(LegendRenderer isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    Display isMethod() {
        return isNameExpr;
    }

    private interface isClassOrIsInterface {

        void isMethod(LegendRenderer isParameter);
    }

    protected static class isClassOrIsInterface implements Display {

        @Override
        public void isMethod(LegendRenderer isParameter) {
            isNameExpr.isMethod(true);
        }
    }

    protected static class isClassOrIsInterface implements Display {

        @Override
        public void isMethod(LegendRenderer isParameter) {
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
        }
    }

    protected static class isClassOrIsInterface implements Display {

        @Override
        public void isMethod(LegendRenderer isParameter) {
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }
}

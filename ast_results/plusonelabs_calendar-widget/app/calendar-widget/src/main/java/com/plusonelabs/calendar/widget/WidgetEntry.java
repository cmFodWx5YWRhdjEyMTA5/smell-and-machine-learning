// isComment
package com.plusonelabs.calendar.widget;

import com.plusonelabs.calendar.DateUtil;
import org.joda.time.DateTime;
import org.joda.time.Days;

public class isClassOrIsInterface implements Comparable<WidgetEntry> {

    private DateTime isVariable;

    public DateTime isMethod() {
        return isNameExpr;
    }

    public void isMethod(DateTime isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public DateTime isMethod() {
        return isMethod().isMethod();
    }

    @Override
    public String isMethod() {
        return this.isMethod().isMethod() + "isStringConstant" + isNameExpr + "isStringConstant";
    }

    public int isMethod() {
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(), isNameExpr.isMethod()).isMethod();
    }

    @Override
    public int isMethod(WidgetEntry isParameter) {
        if (isMethod().isMethod(isNameExpr.isMethod())) {
            return isIntegerConstant;
        } else if (isMethod().isMethod(isNameExpr.isMethod())) {
            return -isIntegerConstant;
        }
        return isIntegerConstant;
    }
}

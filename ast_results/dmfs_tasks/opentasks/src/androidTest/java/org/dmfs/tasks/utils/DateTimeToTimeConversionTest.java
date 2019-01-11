// isComment
package org.dmfs.tasks.utils;

import android.support.test.runner.AndroidJUnit4;
import android.text.format.Time;
import org.dmfs.rfc5545.DateTime;
import org.dmfs.rfc5545.Duration;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.TimeZone;

/**
 * isComment
 */
@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod());
        isMethod(new DateTime(isStringConstant));
        isMethod(new DateTime(isStringConstant).isMethod(new Duration(isIntegerConstant, isIntegerConstant, isIntegerConstant)));
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr.isMethod("isStringConstant")));
        // isComment
        isMethod(isNameExpr.isMethod().isMethod());
        // isComment
        isMethod(new DateTime(isNameExpr.isMethod("isStringConstant"), isIntegerConstant, isIntegerConstant - isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant));
        isMethod(new DateTime(isIntegerConstant, isIntegerConstant - isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant).isMethod(isNameExpr.isMethod("isStringConstant")));
        isMethod(new DateTime(isIntegerConstant, isIntegerConstant - isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant).isMethod(isNameExpr.isMethod("isStringConstant")));
        // isComment
        isMethod(new DateTime(isNameExpr.isMethod("isStringConstant"), isIntegerConstant, isIntegerConstant - isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant));
        isMethod(new DateTime(isIntegerConstant, isIntegerConstant - isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant).isMethod(isNameExpr.isMethod("isStringConstant")));
        isMethod(new DateTime(isIntegerConstant, isIntegerConstant - isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant).isMethod(isNameExpr.isMethod("isStringConstant")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        new DateFormatter(null).isMethod(new DateTime(isIntegerConstant, isIntegerConstant - isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant));
    }

    private void isMethod(DateTime isParameter) {
        Time isVariable = new DateFormatter(null).isMethod(isNameExpr);
        if (!isMethod(isNameExpr, isNameExpr)) {
            throw new AssertionError(isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr));
        }
    }

    /**
     * isComment
     */
    private boolean isMethod(DateTime isParameter, Time isParameter) {
        // isComment
        // isComment
        boolean isVariable = isNameExpr.isMethod() / isIntegerConstant == isNameExpr.isMethod(true) / isIntegerConstant;
        boolean isVariable = isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr;
        boolean isVariable = isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr;
        boolean isVariable = isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr;
        boolean isVariable = isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr;
        boolean isVariable = isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr;
        boolean isVariable = isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr;
        boolean isVariable = isNameExpr.isFieldAccessExpr == isNameExpr.isMethod();
        boolean isVariable = (isNameExpr.isMethod() && isNameExpr.isMethod() && isNameExpr.isFieldAccessExpr.isMethod("isStringConstant")) || // isComment
        (isNameExpr.isMethod() != null && isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod().isMethod()));
        return isNameExpr && isNameExpr && isNameExpr && isNameExpr && isNameExpr && isNameExpr && isNameExpr && isNameExpr && isNameExpr;
    }
}

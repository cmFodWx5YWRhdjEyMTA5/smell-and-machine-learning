// isComment
package com.nolanlawson.keepscore.data;

import java.util.Date;
import com.nolanlawson.keepscore.R;
import com.nolanlawson.keepscore.util.CollectionUtil.Function;
import com.nolanlawson.keepscore.util.Functions;

/**
 * isComment
 */
public enum TimePeriod {

    Today(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    Yesterday(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    DayBeforeYesterday(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    LastWeek(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    LastMonth(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    LastYear(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    Older(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    private int isVariable;

    private Function<Date, Date> isVariable;

    private Function<Date, Date> isVariable;

    private isConstructor(int isParameter, Function<Date, Date> isParameter, Function<Date, Date> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public Function<Date, Date> isMethod() {
        return isNameExpr;
    }

    public Function<Date, Date> isMethod() {
        return isNameExpr;
    }
}

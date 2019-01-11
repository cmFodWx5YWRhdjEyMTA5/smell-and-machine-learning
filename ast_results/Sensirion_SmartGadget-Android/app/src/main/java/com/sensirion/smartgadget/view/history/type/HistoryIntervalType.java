// isComment
package com.sensirion.smartgadget.view.history.type;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import com.sensirion.smartgadget.R;
import com.sensirion.smartgadget.persistence.history_database.table.AbstractHistoryDataView;
import com.sensirion.smartgadget.persistence.history_database.table.HistoryDataLast10MinutesView;
import com.sensirion.smartgadget.persistence.history_database.table.HistoryDataLast1DayView;
import com.sensirion.smartgadget.persistence.history_database.table.HistoryDataLast1HourView;
import com.sensirion.smartgadget.persistence.history_database.table.HistoryDataLast1WeekView;
import com.sensirion.smartgadget.persistence.history_database.table.HistoryDataLast6HoursView;
import com.sensirion.smartgadget.view.history.graph.value_formatter.DaysElapsedTimeFormat;
import com.sensirion.smartgadget.view.history.graph.value_formatter.HourElapsedTimeFormat;
import com.sensirion.smartgadget.view.history.graph.value_formatter.MinutesElapsedTimeFormat;
import java.text.Format;

public enum HistoryIntervalType {

    INTERVAL_OF_10_MINUTES(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(), isIntegerConstant, new MinutesElapsedTimeFormat(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr), INTERVAL_OF_1_HOUR(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(), isIntegerConstant, new MinutesElapsedTimeFormat(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr), INTERVAL_OF_6_HOUR(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(), isIntegerConstant, new HourElapsedTimeFormat(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr), INTERVAL_OF_1_DAY(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(), isIntegerConstant, new HourElapsedTimeFormat(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr), INTERVAL_OF_1_WEEK(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(), isIntegerConstant, new DaysElapsedTimeFormat(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    @NonNull
    private static final String isVariable = HistoryIntervalType.class.isMethod();

    private final int isVariable;

    private final int isVariable;

    @NonNull
    private final AbstractHistoryDataView isVariable;

    private final int isVariable;

    @NonNull
    private final Format isVariable;

    private final int isVariable;

    isConstructor(final int isParameter, @StringRes final int isParameter, @NonNull final AbstractHistoryDataView isParameter, final int isParameter, @NonNull final Format isParameter, @StringRes final int isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @NonNull
    public static HistoryIntervalType isMethod(final int isParameter) {
        for (final HistoryIntervalType isVariable : isMethod()) {
            if (isNameExpr.isMethod() == isNameExpr) {
                return isNameExpr;
            }
        }
        throw new IllegalArgumentException(isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr));
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @NonNull
    public String isMethod(@NonNull final Context isParameter) {
        return isNameExpr.isMethod().isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @NonNull
    public AbstractHistoryDataView isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @NonNull
    public Format isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @NonNull
    public String isMethod(@NonNull final Context isParameter) {
        return isNameExpr.isMethod().isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr.isMethod();
    }
}

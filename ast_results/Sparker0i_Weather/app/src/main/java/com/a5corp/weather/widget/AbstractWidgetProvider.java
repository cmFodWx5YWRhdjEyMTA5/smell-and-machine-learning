// isComment
package com.a5corp.weather.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.a5corp.weather.model.WeatherInfo;
import com.google.gson.Gson;

public abstract class isClassOrIsInterface extends AppWidgetProvider {

    protected WeatherInfo isMethod(String isParameter) {
        return new Gson().isMethod(isNameExpr, WeatherInfo.class);
    }

    public static void isMethod(Context isParameter) {
        isMethod(isNameExpr, LargeWidgetProvider.class);
        isMethod(isNameExpr, SmallWidgetProvider.class);
    }

    private static void isMethod(Context isParameter, Class isParameter) {
        Intent isVariable = new Intent(isNameExpr.isMethod(), isNameExpr).isMethod(isNameExpr.isFieldAccessExpr);
        int[] isVariable = isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(new ComponentName(isNameExpr.isMethod(), isNameExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod().isMethod(isNameExpr);
    }
}

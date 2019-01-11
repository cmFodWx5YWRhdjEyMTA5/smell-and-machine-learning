// isComment
package com.google.android.apps.mytracks.util;

import com.google.android.apps.mytracks.widgets.TrackWidgetProvider;
import android.annotation.TargetApi;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.os.Bundle;

/**
 * isComment
 */
@TargetApi(isIntegerConstant)
public class isClassOrIsInterface extends Api16Adapter {

    @Override
    protected int isMethod(Bundle isParameter) {
        boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, -isIntegerConstant) == isNameExpr.isFieldAccessExpr;
        return isNameExpr ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
    }
}

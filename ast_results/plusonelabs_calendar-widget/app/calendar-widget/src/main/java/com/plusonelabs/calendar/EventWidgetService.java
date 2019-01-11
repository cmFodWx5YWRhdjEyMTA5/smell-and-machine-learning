// isComment
package com.plusonelabs.calendar;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.view.ContextThemeWrapper;
import android.widget.RemoteViewsService;
import com.plusonelabs.calendar.prefs.InstanceSettings;
import static com.plusonelabs.calendar.Theme.themeNameToResId;

public class isClassOrIsInterface extends RemoteViewsService {

    @Override
    public RemoteViewsFactory isMethod(Intent isParameter) {
        int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
        Context isVariable = isMethod();
        int isVariable = isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr).isMethod());
        ContextThemeWrapper isVariable = new ContextThemeWrapper(isNameExpr, isNameExpr);
        return new EventRemoteViewsFactory(isNameExpr, isNameExpr);
    }
}

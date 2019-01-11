// isComment
package net.osmand.plus.mapcontextmenu.controllers;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import net.osmand.data.PointDescription;
import net.osmand.plus.R;
import net.osmand.plus.activities.MapActivity;
import net.osmand.plus.activities.search.SearchHistoryFragment;
import net.osmand.plus.helpers.SearchHistoryHelper.HistoryEntry;
import net.osmand.plus.mapcontextmenu.MenuBuilder;
import net.osmand.plus.mapcontextmenu.MenuController;
import net.osmand.util.Algorithms;

public class isClassOrIsInterface extends MenuController {

    private HistoryEntry isVariable;

    private boolean isVariable;

    public isConstructor(@NonNull MapActivity isParameter, @NonNull PointDescription isParameter, @NonNull final HistoryEntry isParameter) {
        super(new MenuBuilder(isNameExpr), isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr.isMethod(true);
        isMethod();
    }

    private void isMethod() {
        isNameExpr = !isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
    }

    @Override
    protected void isMethod(Object isParameter) {
        if (isNameExpr instanceof HistoryEntry) {
            this.isFieldAccessExpr = (HistoryEntry) isNameExpr;
            isMethod();
        }
    }

    @Override
    protected Object isMethod() {
        return isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return isNameExpr.isMethod().isMethod();
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public Drawable isMethod() {
        return isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
    }

    @Override
    public Drawable isMethod() {
        if (isNameExpr) {
            return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            return null;
        }
    }

    @NonNull
    @Override
    public String isMethod() {
        if (isNameExpr) {
            return isNameExpr.isMethod().isMethod();
        } else {
            return "isStringConstant";
        }
    }

    @NonNull
    @Override
    public String isMethod() {
        MapActivity isVariable = isMethod();
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            return "isStringConstant";
        }
    }

    @Override
    public boolean isMethod() {
        return !isNameExpr.isMethod().isMethod();
    }
}

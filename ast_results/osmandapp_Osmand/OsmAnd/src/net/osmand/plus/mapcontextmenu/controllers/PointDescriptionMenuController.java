// isComment
package net.osmand.plus.mapcontextmenu.controllers;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import net.osmand.data.PointDescription;
import net.osmand.plus.OsmandApplication;
import net.osmand.plus.R;
import net.osmand.plus.activities.MapActivity;
import net.osmand.plus.activities.search.SearchHistoryFragment;
import net.osmand.plus.helpers.AvoidSpecificRoads;
import net.osmand.plus.mapcontextmenu.MenuBuilder;
import net.osmand.plus.mapcontextmenu.MenuController;
import net.osmand.plus.routing.RoutingHelper;
import net.osmand.util.Algorithms;

public class isClassOrIsInterface extends MenuController {

    private boolean isVariable;

    public isConstructor(@NonNull MapActivity isParameter, @NonNull PointDescription isParameter) {
        super(new MenuBuilder(isNameExpr), isNameExpr, isNameExpr);
        isNameExpr.isMethod(true);
        isMethod();
        OsmandApplication isVariable = isNameExpr.isMethod();
        RoutingHelper isVariable = isNameExpr.isMethod();
        if (isNameExpr.isMethod() || isNameExpr.isMethod()) {
            isNameExpr = new TitleButtonController() {

                @Override
                public void isMethod() {
                    MapActivity isVariable = isMethod();
                    if (isNameExpr != null) {
                        AvoidSpecificRoads isVariable = isNameExpr.isMethod().isMethod();
                        isNameExpr.isMethod(isNameExpr, isMethod(), true, true);
                    }
                }
            };
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        }
    }

    private void isMethod() {
        isNameExpr = !isNameExpr.isMethod(isMethod().isMethod());
    }

    @Override
    protected void isMethod(Object isParameter) {
        isMethod();
    }

    @Override
    protected Object isMethod() {
        return null;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public Drawable isMethod() {
        return isMethod(isNameExpr.isMethod(isMethod()));
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
            return isMethod().isMethod();
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
        return !isMethod().isMethod();
    }
}

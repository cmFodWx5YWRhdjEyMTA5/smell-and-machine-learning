// isComment
package net.osmand.plus.mapcontextmenu.controllers;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import net.osmand.binary.RouteDataObject;
import net.osmand.data.PointDescription;
import net.osmand.plus.OsmandApplication;
import net.osmand.plus.R;
import net.osmand.plus.activities.MapActivity;
import net.osmand.plus.mapcontextmenu.MenuBuilder;
import net.osmand.plus.mapcontextmenu.MenuController;
import net.osmand.plus.routing.RoutingHelper;

public class isClassOrIsInterface extends MenuController {

    private RouteDataObject isVariable;

    public isConstructor(@NonNull MapActivity isParameter, @NonNull PointDescription isParameter, @NonNull RouteDataObject isParameter) {
        super(new MenuBuilder(isNameExpr), isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        final OsmandApplication isVariable = isNameExpr.isMethod();
        isNameExpr = new TitleButtonController() {

            @Override
            public void isMethod() {
                MapActivity isVariable = isMethod();
                if (isNameExpr != null) {
                    isNameExpr.isMethod().isMethod(isNameExpr.this.isFieldAccessExpr);
                    RoutingHelper isVariable = isNameExpr.isMethod();
                    if (isNameExpr.isMethod() || isNameExpr.isMethod()) {
                        isNameExpr.isMethod();
                    }
                    isNameExpr.isMethod().isMethod();
                }
            }
        };
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
    }

    @Override
    protected void isMethod(Object isParameter) {
        isNameExpr = (RouteDataObject) isNameExpr;
    }

    @Override
    protected Object isMethod() {
        return isNameExpr;
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
    public Drawable isMethod() {
        MapActivity isVariable = isMethod();
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            return null;
        }
    }
}

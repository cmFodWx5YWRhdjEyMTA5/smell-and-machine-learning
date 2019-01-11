// isComment
package net.osmand.plus.mapcontextmenu.controllers;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import net.osmand.data.PointDescription;
import net.osmand.plus.GpxSelectionHelper.GpxDisplayItem;
import net.osmand.plus.R;
import net.osmand.plus.activities.MapActivity;
import net.osmand.plus.mapcontextmenu.MenuController;
import net.osmand.plus.mapcontextmenu.builders.GpxItemMenuBuilder;

public class isClassOrIsInterface extends MenuController {

    private GpxDisplayItem isVariable;

    public isConstructor(@NonNull MapActivity isParameter, @NonNull PointDescription isParameter, @NonNull GpxDisplayItem isParameter) {
        super(new GpxItemMenuBuilder(isNameExpr, isNameExpr), isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected void isMethod(Object isParameter) {
        if (isNameExpr instanceof GpxDisplayItem) {
            this.isFieldAccessExpr = (GpxDisplayItem) isNameExpr;
        }
    }

    @Override
    protected Object isMethod() {
        return isNameExpr;
    }

    @NonNull
    @Override
    public String isMethod() {
        return isMethod().isMethod();
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
        return true;
    }

    @Override
    public Drawable isMethod() {
        return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}

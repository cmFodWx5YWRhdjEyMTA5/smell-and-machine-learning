// isComment
package net.osmand.plus.mapcontextmenu.controllers;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import net.osmand.data.PointDescription;
import net.osmand.plus.ApplicationMode;
import net.osmand.plus.R;
import net.osmand.plus.activities.MapActivity;
import net.osmand.plus.mapcontextmenu.MenuBuilder;
import net.osmand.plus.mapcontextmenu.MenuController;

public class isClassOrIsInterface extends MenuController {

    public isConstructor(@NonNull MapActivity isParameter, @NonNull PointDescription isParameter) {
        super(new MenuBuilder(isNameExpr), isNameExpr, isNameExpr);
        isNameExpr.isMethod(true);
    }

    @Override
    protected void isMethod(Object isParameter) {
    }

    @Override
    protected Object isMethod() {
        return isMethod();
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
        MapActivity isVariable = isMethod();
        if (isNameExpr != null) {
            ApplicationMode isVariable = isNameExpr.isMethod().isMethod().isMethod();
            return isNameExpr.isMethod().isMethod(isNameExpr.isMethod());
        } else {
            return null;
        }
    }
}

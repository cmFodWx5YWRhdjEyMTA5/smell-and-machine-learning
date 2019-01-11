// isComment
package net.osmand.plus.mapillary;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import net.osmand.data.PointDescription;
import net.osmand.plus.R;
import net.osmand.plus.activities.MapActivity;
import net.osmand.plus.mapcontextmenu.MenuBuilder;
import net.osmand.plus.mapcontextmenu.MenuController;
import net.osmand.util.Algorithms;

public class isClassOrIsInterface extends MenuController {

    private MapillaryImage isVariable;

    public isConstructor(@NonNull MapActivity isParameter, @NonNull PointDescription isParameter, @NonNull MapillaryImage isParameter) {
        super(new MenuBuilder(isNameExpr), isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected void isMethod(Object isParameter) {
        if (isNameExpr instanceof MapillaryImage) {
            this.isFieldAccessExpr = (MapillaryImage) isNameExpr;
        }
    }

    @Override
    public boolean isMethod(boolean isParameter) {
        MapActivity isVariable = isMethod();
        if (isNameExpr != null && isNameExpr != null && isMethod() == isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), null);
            return true;
        } else {
            return super.isMethod(isNameExpr);
        }
    }

    @Override
    protected Object isMethod() {
        return isNameExpr;
    }

    public MapillaryImage isMethod() {
        return isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return !isNameExpr.isMethod(isMethod());
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public Drawable isMethod() {
        return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public boolean isMethod() {
        return true;
    }
}

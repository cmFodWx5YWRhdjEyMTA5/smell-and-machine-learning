// isComment
package net.osmand.core.samples.android.sample1.mapcontextmenu.controllers;

import android.graphics.drawable.Drawable;
import net.osmand.core.samples.android.sample1.MainActivity;
import net.osmand.core.samples.android.sample1.OsmandResources;
import net.osmand.core.samples.android.sample1.data.PointDescription;
import net.osmand.core.samples.android.sample1.mapcontextmenu.MenuBuilder;
import net.osmand.core.samples.android.sample1.mapcontextmenu.MenuController;

public class isClassOrIsInterface extends MenuController {

    public isConstructor(MainActivity isParameter, PointDescription isParameter) {
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

    @Override
    public String isMethod() {
        return isMethod().isMethod();
    }

    @Override
    public String isMethod() {
        return isMethod().isMethod().isMethod("isStringConstant");
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public Drawable isMethod() {
        return isNameExpr.isMethod("isStringConstant");
    }
}

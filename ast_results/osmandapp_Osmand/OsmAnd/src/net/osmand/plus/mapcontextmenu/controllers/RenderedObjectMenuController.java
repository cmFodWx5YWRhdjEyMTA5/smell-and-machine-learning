// isComment
package net.osmand.plus.mapcontextmenu.controllers;

import android.support.annotation.NonNull;
import net.osmand.NativeLibrary.RenderedObject;
import net.osmand.data.LatLon;
import net.osmand.data.MapObject;
import net.osmand.data.PointDescription;
import net.osmand.osm.AbstractPoiType;
import net.osmand.osm.MapPoiTypes;
import net.osmand.plus.OsmandPlugin;
import net.osmand.plus.R;
import net.osmand.plus.activities.MapActivity;
import net.osmand.plus.mapcontextmenu.MenuBuilder;
import net.osmand.plus.mapcontextmenu.MenuController;
import net.osmand.plus.osmedit.OsmEditingPlugin;
import net.osmand.plus.render.RenderingIcons;
import net.osmand.util.Algorithms;
import java.util.Map;

public class isClassOrIsInterface extends MenuController {

    private RenderedObject isVariable;

    public isConstructor(@NonNull MapActivity isParameter, @NonNull PointDescription isParameter, @NonNull RenderedObject isParameter) {
        super(new MenuBuilder(isNameExpr), isNameExpr, isNameExpr);
        isNameExpr.isMethod(true);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected void isMethod(Object isParameter) {
        if (isNameExpr instanceof RenderedObject) {
            this.isFieldAccessExpr = (RenderedObject) isNameExpr;
        }
    }

    @Override
    protected Object isMethod() {
        return isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return isNameExpr.isMethod(isMethod());
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public int isMethod() {
        if (isNameExpr.isMethod() != null && isNameExpr.isMethod(isNameExpr.isMethod())) {
            return isNameExpr.isMethod(isNameExpr.isMethod());
        } else {
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }
    }

    @NonNull
    @Override
    public String isMethod() {
        if (!isNameExpr.isMethod(isNameExpr.isMethod()) && !isMethod(isNameExpr.isMethod())) {
            return isNameExpr.isMethod();
        } else if (isNameExpr.isMethod().isMethod() > isIntegerConstant) {
            String isVariable = isMethod().isMethod();
            String isVariable = "isStringConstant";
            if (!isNameExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isMethod().isMethod("isStringConstant" + isNameExpr);
            }
            if (isNameExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isMethod().isMethod("isStringConstant");
            }
            return isNameExpr;
        } else if (!isNameExpr.isMethod(isNameExpr.isMethod())) {
            return isNameExpr.isMethod();
        }
        return "isStringConstant";
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

    @Override
    public void isMethod(String isParameter, PointDescription isParameter, final LatLon isParameter) {
        MapActivity isVariable = isMethod();
        if (isNameExpr != null) {
            MapPoiTypes isVariable = isNameExpr.isMethod().isMethod();
            for (Map.Entry<String, String> isVariable : isNameExpr.isMethod().isMethod()) {
                if (isNameExpr.isMethod().isMethod("isStringConstant")) {
                    AbstractPoiType isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                    if (isNameExpr != null) {
                        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod(), true, true, null);
                    }
                }
            }
            boolean isVariable = isNameExpr.isMethod(OsmEditingPlugin.class) != null;
            if (isNameExpr && isNameExpr.isMethod() != null && isNameExpr.isMethod() > isIntegerConstant && (isNameExpr.isMethod() % isIntegerConstant == isNameExpr.isFieldAccessExpr || (isNameExpr.isMethod() >> isNameExpr.isFieldAccessExpr) < isNameExpr.isFieldAccessExpr)) {
                String isVariable;
                if ((isNameExpr.isMethod()) % isIntegerConstant == isNameExpr.isFieldAccessExpr) {
                    isNameExpr = "isStringConstant";
                } else {
                    isNameExpr = "isStringConstant";
                }
                isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, isNameExpr + (isNameExpr.isMethod() >> isNameExpr.isFieldAccessExpr), true, true, null);
            }
            isMethod(isNameExpr);
        }
    }

    private boolean isMethod(String isParameter) {
        byte isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant));
        return isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr;
    }
}

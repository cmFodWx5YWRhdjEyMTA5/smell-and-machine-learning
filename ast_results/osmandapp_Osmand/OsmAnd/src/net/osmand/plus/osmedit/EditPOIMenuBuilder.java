// isComment
package net.osmand.plus.osmedit;

import android.support.annotation.NonNull;
import android.view.View;
import net.osmand.data.PointDescription;
import net.osmand.osm.PoiType;
import net.osmand.plus.R;
import net.osmand.plus.activities.MapActivity;
import net.osmand.plus.mapcontextmenu.MenuBuilder;
import net.osmand.plus.render.RenderingIcons;
import java.util.Map;

public class isClassOrIsInterface extends MenuBuilder {

    private final OsmPoint isVariable;

    public isConstructor(@NonNull MapActivity isParameter, @NonNull final OsmPoint isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected boolean isMethod() {
        return true;
    }

    @Override
    public void isMethod(View isParameter) {
        if (isNameExpr instanceof OsmNotesPoint) {
            OsmNotesPoint isVariable = (OsmNotesPoint) isNameExpr;
            isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, isNameExpr.isMethod(), isIntegerConstant, true, null, true, isIntegerConstant, true, null, true);
            isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, isNameExpr.isMethod(), isIntegerConstant, true, null, true, isIntegerConstant, true, null, true);
        } else if (isNameExpr instanceof OpenstreetmapPoint) {
            OpenstreetmapPoint isVariable = (OpenstreetmapPoint) isNameExpr;
            for (Map.Entry<String, String> isVariable : isNameExpr.isMethod().isMethod().isMethod()) {
                if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod())) {
                    String isVariable = isNameExpr.isMethod();
                    Map<String, PoiType> isVariable = isNameExpr.isMethod().isMethod(true);
                    PoiType isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                    int isVariable = isIntegerConstant;
                    if (isNameExpr != null) {
                        String isVariable = null;
                        if (isNameExpr.isMethod(isNameExpr.isMethod())) {
                            isNameExpr = isNameExpr.isMethod();
                        } else if (isNameExpr.isMethod(isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod())) {
                            isNameExpr = isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod();
                        }
                        if (isNameExpr != null) {
                            isNameExpr = isNameExpr.isMethod(isNameExpr);
                        }
                    }
                    if (isNameExpr == isIntegerConstant) {
                        isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                    }
                    isMethod(isNameExpr, isNameExpr, null, isNameExpr, isIntegerConstant, true, null, true, isIntegerConstant, true, null, true);
                    break;
                }
            }
            for (Map.Entry<String, String> isVariable : isNameExpr.isMethod().isMethod().isMethod()) {
                if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod()) || isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
                    continue;
                }
                String isVariable = isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod();
                isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, isNameExpr, isIntegerConstant, true, null, true, isIntegerConstant, true, null, true);
            }
        }
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod(), true).isMethod("isStringConstant", "isStringConstant"), isIntegerConstant, true, null, true, isIntegerConstant, true, null, true);
    }
}

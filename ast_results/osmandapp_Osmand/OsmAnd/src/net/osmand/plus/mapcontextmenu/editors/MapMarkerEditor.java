// isComment
package net.osmand.plus.mapcontextmenu.editors;

import android.support.annotation.NonNull;
import net.osmand.plus.MapMarkersHelper.MapMarker;
import net.osmand.plus.activities.MapActivity;

public class isClassOrIsInterface extends PointEditor {

    private MapMarker isVariable;

    public isConstructor(MapActivity isParameter) {
        super(isNameExpr);
    }

    @Override
    public String isMethod() {
        return MapMarkerEditorFragment.class.isMethod();
    }

    public MapMarker isMethod() {
        return isNameExpr;
    }

    public void isMethod(@NonNull MapMarker isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = true;
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }
}

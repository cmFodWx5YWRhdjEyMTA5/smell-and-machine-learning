// isComment
package net.osmand.plus.mapcontextmenu.builders;

import android.view.View;
import net.osmand.data.Amenity;
import net.osmand.data.TransportStop;
import net.osmand.plus.activities.MapActivity;
import net.osmand.plus.mapcontextmenu.MenuBuilder;

public class isClassOrIsInterface extends MenuBuilder {

    private final TransportStop isVariable;

    public isConstructor(MapActivity isParameter, final TransportStop isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(View isParameter) {
        Amenity isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            AmenityMenuBuilder isVariable = new AmenityMenuBuilder(isNameExpr, isNameExpr);
            isNameExpr.isMethod(isMethod());
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
    }
}

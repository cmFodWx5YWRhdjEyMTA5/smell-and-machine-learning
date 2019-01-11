// isComment
package org.osmdroid.samplefragments.tilesources;

import android.graphics.Color;
import org.osmdroid.samplefragments.BaseSampleFragment;
import org.osmdroid.tileprovider.MapTileProviderBasic;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.overlay.TilesOverlay;

public class isClassOrIsInterface extends BaseSampleFragment {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    MapTileProviderBasic isVariable;

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = new MapTileProviderBasic(isMethod());
        TilesOverlay isVariable = new TilesOverlay(isNameExpr, isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(null);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod().isMethod(new GeoPoint(isDoubleConstant, -isDoubleConstant));
        isNameExpr.isMethod().isMethod(isIntegerConstant);
    }

    @Override
    public void isMethod() {
        super.isMethod();
        if (isNameExpr != null)
            isNameExpr.isMethod();
        isNameExpr = null;
        if (isNameExpr != null)
            isNameExpr.isMethod();
        isNameExpr = null;
    }
}

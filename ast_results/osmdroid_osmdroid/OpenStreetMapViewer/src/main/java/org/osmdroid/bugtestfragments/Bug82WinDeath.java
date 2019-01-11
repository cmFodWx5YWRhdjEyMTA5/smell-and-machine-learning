// isComment
package org.osmdroid.bugtestfragments;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.Log;
import org.osmdroid.samplefragments.BaseSampleFragment;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Overlay;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseSampleFragment {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    protected void isMethod() {
        // isComment
        MapOverlay isVariable = new MapOverlay();
        isNameExpr.isMethod(true);
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(new GeoPoint(isDoubleConstant, -isDoubleConstant));
        isNameExpr.isMethod().isMethod(isIntegerConstant);
    }

    public static class isClassOrIsInterface extends Overlay {

        private Paint isVariable;

        public isConstructor() {
            super();
            this.isFieldAccessExpr = new Paint();
            this.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant));
            this.isFieldAccessExpr.isMethod(isDoubleConstant);
            this.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }

        @Override
        public void isMethod(Canvas isParameter, MapView isParameter, boolean isParameter) {
            if (!isNameExpr) {
                // isComment
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
                Point isVariable = isNameExpr.isMethod().isMethod(new GeoPoint(isDoubleConstant, -isDoubleConstant), new Point());
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isDoubleConstant, isNameExpr);
            }
        }
    }
}

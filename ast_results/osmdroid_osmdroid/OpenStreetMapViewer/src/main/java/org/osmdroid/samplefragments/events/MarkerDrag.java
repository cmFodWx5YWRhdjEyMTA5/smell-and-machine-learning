// isComment
package org.osmdroid.samplefragments.events;

import org.osmdroid.samplefragments.BaseSampleFragment;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.overlay.Marker;
import org.osmdroid.views.overlay.Polyline;
import java.util.ArrayList;

public class isClassOrIsInterface extends BaseSampleFragment {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public void isMethod() {
        super.isMethod();
        // isComment
        Marker isVariable = new Marker(isNameExpr);
        isNameExpr.isMethod(new GeoPoint(isDoubleConstant, isDoubleConstant));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(new OnMarkerDragListenerDrawer());
        isNameExpr.isMethod().isMethod(isNameExpr);
    }

    // isComment
    class isClassOrIsInterface implements Marker.OnMarkerDragListener {

        ArrayList<GeoPoint> isVariable;

        Polyline isVariable;

        isConstructor() {
            isNameExpr = new ArrayList<GeoPoint>(isIntegerConstant);
            isNameExpr = new Polyline(isNameExpr);
            isNameExpr.isMethod(isIntegerConstant);
            isNameExpr.isMethod(isDoubleConstant);
            isNameExpr.isMethod(true);
            isNameExpr.isMethod().isMethod(isNameExpr);
        }

        @Override
        public void isMethod(Marker isParameter) {
        // isComment
        }

        @Override
        public void isMethod(Marker isParameter) {
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
        }

        @Override
        public void isMethod(Marker isParameter) {
        // isComment
        }
    }
}

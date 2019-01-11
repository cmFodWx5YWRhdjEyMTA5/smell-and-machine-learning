// isComment
package com.google.maps.android.geojson;

import com.google.android.gms.maps.model.LatLng;
import junit.framework.TestCase;
import java.util.ArrayList;

public class isClassOrIsInterface extends TestCase {

    GeoJsonLineString isVariable;

    public void isMethod() throws Exception {
        ArrayList<LatLng> isVariable = new ArrayList<LatLng>();
        isNameExpr.isMethod(new LatLng(isIntegerConstant, isIntegerConstant));
        isNameExpr.isMethod(new LatLng(isIntegerConstant, isIntegerConstant));
        isNameExpr.isMethod(new LatLng(isIntegerConstant, isIntegerConstant));
        isNameExpr = new GeoJsonLineString(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod());
    }

    public void isMethod() throws Exception {
        ArrayList<LatLng> isVariable = new ArrayList<LatLng>();
        isNameExpr.isMethod(new LatLng(isIntegerConstant, isIntegerConstant));
        isNameExpr.isMethod(new LatLng(isIntegerConstant, isIntegerConstant));
        isNameExpr.isMethod(new LatLng(isIntegerConstant, isIntegerConstant));
        isNameExpr = new GeoJsonLineString(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
        try {
            isNameExpr = new GeoJsonLineString(null);
            isMethod();
        } catch (IllegalArgumentException isParameter) {
            isMethod("isStringConstant", isNameExpr.isMethod());
        }
    }
}

// isComment
package com.google.maps.android.geojson;

import com.google.android.gms.maps.model.LatLng;
import junit.framework.TestCase;

public class isClassOrIsInterface extends TestCase {

    GeoJsonPoint isVariable;

    public void isMethod() throws Exception {
        isNameExpr = new GeoJsonPoint(new LatLng(isIntegerConstant, isIntegerConstant));
        isMethod("isStringConstant", isNameExpr.isMethod());
    }

    public void isMethod() throws Exception {
        isNameExpr = new GeoJsonPoint(new LatLng(isIntegerConstant, isIntegerConstant));
        isMethod(new LatLng(isIntegerConstant, isIntegerConstant), isNameExpr.isMethod());
        try {
            isNameExpr = new GeoJsonPoint(null);
            isMethod();
        } catch (IllegalArgumentException isParameter) {
            isMethod("isStringConstant", isNameExpr.isMethod());
        }
    }
}

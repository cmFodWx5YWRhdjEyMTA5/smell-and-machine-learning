// isComment
package com.google.maps.android.geojson;

import com.google.android.gms.maps.model.LatLng;
import junit.framework.TestCase;
import java.util.ArrayList;

public class isClassOrIsInterface extends TestCase {

    GeoJsonMultiPoint isVariable;

    public void isMethod() throws Exception {
        ArrayList<GeoJsonPoint> isVariable = new ArrayList<GeoJsonPoint>();
        isNameExpr.isMethod(new GeoJsonPoint(new LatLng(isIntegerConstant, isIntegerConstant)));
        isNameExpr.isMethod(new GeoJsonPoint(new LatLng(isIntegerConstant, isIntegerConstant)));
        isNameExpr.isMethod(new GeoJsonPoint(new LatLng(isIntegerConstant, isIntegerConstant)));
        isNameExpr = new GeoJsonMultiPoint(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod());
    }

    public void isMethod() throws Exception {
        ArrayList<GeoJsonPoint> isVariable = new ArrayList<GeoJsonPoint>();
        isNameExpr.isMethod(new GeoJsonPoint(new LatLng(isIntegerConstant, isIntegerConstant)));
        isNameExpr.isMethod(new GeoJsonPoint(new LatLng(isIntegerConstant, isIntegerConstant)));
        isNameExpr.isMethod(new GeoJsonPoint(new LatLng(isIntegerConstant, isIntegerConstant)));
        isNameExpr = new GeoJsonMultiPoint(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr = new ArrayList<GeoJsonPoint>();
        isNameExpr = new GeoJsonMultiPoint(isNameExpr);
        isMethod(new ArrayList<GeoJsonPoint>(), isNameExpr.isMethod());
        try {
            isNameExpr = new GeoJsonMultiPoint(null);
            isMethod();
        } catch (IllegalArgumentException isParameter) {
            isMethod("isStringConstant", isNameExpr.isMethod());
        }
    }
}

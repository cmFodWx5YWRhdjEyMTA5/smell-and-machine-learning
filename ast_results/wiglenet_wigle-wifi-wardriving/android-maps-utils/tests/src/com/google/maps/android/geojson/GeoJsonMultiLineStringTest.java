// isComment
package com.google.maps.android.geojson;

import com.google.android.gms.maps.model.LatLng;
import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;

public class isClassOrIsInterface extends TestCase {

    GeoJsonMultiLineString isVariable;

    public void isMethod() throws Exception {
        ArrayList<GeoJsonLineString> isVariable = new ArrayList<GeoJsonLineString>();
        isNameExpr.isMethod(new GeoJsonLineString(new ArrayList<LatLng>(isNameExpr.isMethod(new LatLng(isIntegerConstant, isIntegerConstant), new LatLng(isIntegerConstant, isIntegerConstant)))));
        isNameExpr.isMethod(new GeoJsonLineString(new ArrayList<LatLng>(isNameExpr.isMethod(new LatLng(isIntegerConstant, isIntegerConstant), new LatLng(-isIntegerConstant, isDoubleConstant)))));
        isNameExpr = new GeoJsonMultiLineString(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod());
    }

    public void isMethod() throws Exception {
        ArrayList<GeoJsonLineString> isVariable = new ArrayList<GeoJsonLineString>();
        isNameExpr.isMethod(new GeoJsonLineString(new ArrayList<LatLng>(isNameExpr.isMethod(new LatLng(isIntegerConstant, isIntegerConstant), new LatLng(isIntegerConstant, isIntegerConstant)))));
        isNameExpr.isMethod(new GeoJsonLineString(new ArrayList<LatLng>(isNameExpr.isMethod(new LatLng(isIntegerConstant, isIntegerConstant), new LatLng(-isIntegerConstant, isDoubleConstant)))));
        isNameExpr = new GeoJsonMultiLineString(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr = new ArrayList<GeoJsonLineString>();
        isNameExpr = new GeoJsonMultiLineString(isNameExpr);
        isMethod(new ArrayList<GeoJsonLineString>(), isNameExpr.isMethod());
        try {
            isNameExpr = new GeoJsonMultiLineString(null);
            isMethod();
        } catch (IllegalArgumentException isParameter) {
            isMethod("isStringConstant", isNameExpr.isMethod());
        }
    }
}

// isComment
package org.osmdroid.gpkg.overlay.features;

import java.util.ArrayList;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private List<PolygonMarkers> isVariable = new ArrayList<PolygonMarkers>();

    public void isMethod(PolygonMarkers isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    public List<PolygonMarkers> isMethod() {
        return isNameExpr;
    }

    public void isMethod(List<PolygonMarkers> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(boolean isParameter) {
        for (PolygonMarkers isVariable : isNameExpr) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    /**
     * isComment
     */
    public boolean isMethod() {
        boolean isVariable = true;
        for (PolygonMarkers isVariable : isNameExpr) {
            isNameExpr = isNameExpr.isMethod();
            if (!isNameExpr) {
                break;
            }
        }
        return isNameExpr;
    }
}

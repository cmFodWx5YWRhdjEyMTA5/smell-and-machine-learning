// isComment
package net.osmand.osm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class isClassOrIsInterface extends PoiFilter {

    private List<PoiFilter> isVariable = new ArrayList<PoiFilter>();

    private Set<PoiType> isVariable = null;

    private int isVariable;

    private String isVariable;

    public isConstructor(MapPoiTypes isParameter, String isParameter, int isParameter) {
        super(isNameExpr, null, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(PoiFilter isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    public List<PoiFilter> isMethod() {
        return isNameExpr;
    }

    public PoiFilter isMethod(String isParameter) {
        for (PoiFilter isVariable : isNameExpr) {
            if (isNameExpr.isMethod().isMethod(isNameExpr)) {
                return isNameExpr;
            }
        }
        return null;
    }

    public String isMethod() {
        if (isNameExpr == null) {
            return isNameExpr;
        }
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Map<PoiCategory, LinkedHashSet<String>> isMethod(Map<PoiCategory, LinkedHashSet<String>> isParameter) {
        isNameExpr.isMethod(this, null);
        isMethod(isNameExpr);
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    public int isMethod() {
        return isNameExpr;
    }

    public void isMethod(PoiType isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new HashSet<PoiType>();
        }
        isNameExpr.isMethod(isNameExpr);
    }

    public boolean isMethod(PoiType isParameter) {
        if (isNameExpr == null) {
            return true;
        }
        return isNameExpr.isMethod(isNameExpr);
    }
}

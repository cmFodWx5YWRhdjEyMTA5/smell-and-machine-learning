// isComment
package au.id.micolous.metrodroid.transit.en1545;

import au.id.micolous.metrodroid.transit.Station;
import au.id.micolous.metrodroid.transit.Trip;
import au.id.micolous.metrodroid.util.StationTableReader;

public abstract class isClassOrIsInterface implements En1545Lookup {

    private final String isVariable;

    protected isConstructor(String isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public String isMethod(Integer isParameter, Integer isParameter, Integer isParameter, Integer isParameter) {
        if (isNameExpr == null)
            return null;
        if (isNameExpr == null)
            isNameExpr = isIntegerConstant;
        if (isNameExpr == null)
            isNameExpr = isIntegerConstant;
        int isVariable = (isNameExpr) | (isNameExpr << isIntegerConstant) | (isNameExpr << isIntegerConstant);
        String isVariable = "isStringConstant" + isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr += "isStringConstant" + isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public String isMethod(Integer isParameter, boolean isParameter) {
        if (isNameExpr == null || isNameExpr == isIntegerConstant)
            return null;
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public Station isMethod(int isParameter, Integer isParameter, Integer isParameter) {
        if (isNameExpr == isIntegerConstant)
            return null;
        if (isNameExpr == null)
            isNameExpr = isIntegerConstant;
        if (isNameExpr == null)
            isNameExpr = isIntegerConstant;
        return isNameExpr.isMethod(isNameExpr, isNameExpr | (isNameExpr << isIntegerConstant) | (isNameExpr << isIntegerConstant), "isStringConstant" + isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public Trip.Mode isMethod(Integer isParameter, Integer isParameter) {
        Trip.Mode isVariable = null;
        if (isNameExpr != null) {
            if (isNameExpr == null)
                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
            else
                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr | (isNameExpr << isIntegerConstant));
        }
        if (isNameExpr != null)
            return isNameExpr;
        if (isNameExpr == null)
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        if (isNameExpr != null)
            return isNameExpr;
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }
}

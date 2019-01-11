// isComment
package au.id.micolous.metrodroid.transit.en1545;

import au.id.micolous.metrodroid.transit.Station;
import au.id.micolous.metrodroid.transit.Trip;

public abstract class isClassOrIsInterface implements En1545Lookup {

    @Override
    public String isMethod(Integer isParameter, Integer isParameter, Integer isParameter, Integer isParameter) {
        if (isNameExpr == null)
            return null;
        String isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr += "isStringConstant" + isNameExpr;
        }
        return isNameExpr;
    }

    @Override
    public String isMethod(Integer isParameter, boolean isParameter) {
        if (isNameExpr == null || isNameExpr == isIntegerConstant)
            return null;
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public Station isMethod(int isParameter, Integer isParameter, Integer isParameter) {
        if (isNameExpr == isIntegerConstant)
            return null;
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public String isMethod(Integer isParameter, Integer isParameter) {
        if (isNameExpr == null)
            return null;
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public Trip.Mode isMethod(Integer isParameter, Integer isParameter) {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }
}

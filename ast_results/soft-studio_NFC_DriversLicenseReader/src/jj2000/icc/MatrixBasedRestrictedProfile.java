// isComment
package jj2000.icc;

import jj2000.icc.tags.ICCCurveType;
import jj2000.icc.tags.ICCXYZType;

/**
 * isComment
 */
public class isClassOrIsInterface extends RestrictedICCProfile {

    /**
     * isComment
     */
    public static RestrictedICCProfile isMethod(ICCCurveType isParameter, ICCCurveType isParameter, ICCCurveType isParameter, ICCXYZType isParameter, ICCXYZType isParameter, ICCXYZType isParameter) {
        return new MatrixBasedRestrictedProfile(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    protected isConstructor(ICCCurveType isParameter, ICCCurveType isParameter, ICCCurveType isParameter, ICCXYZType isParameter, ICCXYZType isParameter, ICCXYZType isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr;
    }
}

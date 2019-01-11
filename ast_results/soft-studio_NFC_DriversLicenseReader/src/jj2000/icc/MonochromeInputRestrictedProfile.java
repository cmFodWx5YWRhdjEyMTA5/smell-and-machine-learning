// isComment
package jj2000.icc;

import jj2000.icc.tags.ICCCurveType;

/**
 * isComment
 */
public class isClassOrIsInterface extends RestrictedICCProfile {

    /**
     * isComment
     */
    public static RestrictedICCProfile isMethod(ICCCurveType isParameter) {
        return new MonochromeInputRestrictedProfile(isNameExpr);
    }

    /**
     * isComment
     */
    private isConstructor(ICCCurveType isParameter) {
        super(isNameExpr);
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr;
    }
}

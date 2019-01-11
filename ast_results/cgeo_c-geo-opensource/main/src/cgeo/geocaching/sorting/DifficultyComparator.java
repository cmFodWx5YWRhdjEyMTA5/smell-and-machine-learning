// isComment
package cgeo.geocaching.sorting;

import cgeo.geocaching.models.Geocache;

/**
 * isComment
 */
class isClassOrIsInterface extends AbstractCacheComparator {

    @Override
    protected boolean isMethod(final Geocache isParameter) {
        return isNameExpr.isMethod() != isDoubleConstant;
    }

    @Override
    protected int isMethod(final Geocache isParameter, final Geocache isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
    }
}

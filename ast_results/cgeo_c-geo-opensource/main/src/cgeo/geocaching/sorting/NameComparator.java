// isComment
package cgeo.geocaching.sorting;

import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.utils.TextUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractCacheComparator {

    @Override
    protected boolean isMethod(final Geocache isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Override
    protected int isMethod(final Geocache isParameter, final Geocache isParameter) {
        return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
    }
}

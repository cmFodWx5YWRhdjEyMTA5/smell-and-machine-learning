// isComment
package cgeo.geocaching.sorting;

import cgeo.geocaching.models.Geocache;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractCacheComparator {

    @Override
    protected boolean isMethod(final Geocache isParameter) {
        // isComment
        return true;
    }

    @Override
    protected int isMethod(final Geocache isParameter, final Geocache isParameter) {
        throw new IllegalStateException("isStringConstant");
    }
}

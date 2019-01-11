// isComment
package org.dmfs.tasks.groupings.cursorloaders;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.Loader;
import org.dmfs.tasks.utils.SearchHistoryHelper;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractCursorLoaderFactory {

    private final SearchHistoryHelper isVariable;

    private CustomCursorLoader isVariable;

    public isConstructor(SearchHistoryHelper isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public Loader<Cursor> isMethod(Context isParameter) {
        return isNameExpr = new CustomCursorLoader(isNameExpr, new SearchHistoryCursorFactory(isNameExpr, null, isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod() {
        if (isNameExpr != null && !isNameExpr.isMethod()) {
            isNameExpr.isMethod();
        }
    }
}

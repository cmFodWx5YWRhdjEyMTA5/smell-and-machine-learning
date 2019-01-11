// isComment
package org.dmfs.tasks.groupings.cursorloaders;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.Loader;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractCursorLoaderFactory {

    private final String[] isVariable;

    public isConstructor(String[] isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public Loader<Cursor> isMethod(Context isParameter) {
        return new TimeRangeCursorLoader(isNameExpr, isNameExpr);
    }
}

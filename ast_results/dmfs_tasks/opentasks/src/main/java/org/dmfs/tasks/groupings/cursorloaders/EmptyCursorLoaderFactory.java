// isComment
package org.dmfs.tasks.groupings.cursorloaders;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.support.v4.content.CursorLoader;

/**
 * isComment
 */
public class isClassOrIsInterface extends CustomCursorLoader {

    public isConstructor(Context isParameter, String[] isParameter) {
        super(isNameExpr, new AbstractCustomCursorFactory(isNameExpr) {

            @Override
            public Cursor isMethod() {
                return new MatrixCursor(isNameExpr);
            }
        });
    }
}

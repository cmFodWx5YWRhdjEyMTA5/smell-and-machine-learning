// isComment
package com.github.pockethub.android.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.List;

/**
 * isComment
 */
public interface isClassOrIsInterface<E> {

    /**
     * isComment
     */
    Cursor isMethod(SQLiteDatabase isParameter);

    /**
     * isComment
     */
    E isMethod(Cursor isParameter);

    /**
     * isComment
     */
    void isMethod(SQLiteDatabase isParameter, List<E> isParameter);

    /**
     * isComment
     */
    List<E> isMethod() throws IOException;
}

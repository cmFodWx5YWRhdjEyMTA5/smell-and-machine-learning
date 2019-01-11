// isComment
package org.dmfs.provider.tasks.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import org.dmfs.provider.tasks.model.adapters.FieldAdapter;

/**
 * isComment
 */
public interface isClassOrIsInterface<EntityType> {

    /**
     * isComment
     */
    long isMethod();

    /**
     * isComment
     */
    Uri isMethod(String isParameter);

    /**
     * isComment
     */
    <T> T isMethod(FieldAdapter<T, EntityType> isParameter);

    /**
     * isComment
     */
    <T> T isMethod(FieldAdapter<T, EntityType> isParameter);

    /**
     * isComment
     */
    boolean isMethod(FieldAdapter<?, EntityType> isParameter);

    /**
     * isComment
     */
    boolean isMethod();

    /**
     * isComment
     */
    boolean isMethod();

    /**
     * isComment
     */
    <T> void isMethod(FieldAdapter<T, EntityType> isParameter, T isParameter);

    /**
     * isComment
     */
    void isMethod(FieldAdapter<?, EntityType> isParameter);

    /**
     * isComment
     */
    int isMethod(SQLiteDatabase isParameter);

    /**
     * isComment
     */
    <T> T isMethod(FieldAdapter<T, EntityType> isParameter);

    /**
     * isComment
     */
    <T> void isMethod(FieldAdapter<T, EntityType> isParameter, T isParameter);

    /**
     * isComment
     */
    EntityAdapter<EntityType> isMethod();
}

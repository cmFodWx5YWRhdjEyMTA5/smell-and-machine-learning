// isComment
package com.etesync.syncadapter.syncadapter;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class isClassOrIsInterface extends ContentProvider {

    @Override
    public boolean isMethod() {
        return true;
    }

    @Nullable
    @Override
    public Cursor isMethod(@NonNull Uri isParameter, @Nullable String[] isParameter, @Nullable String isParameter, @Nullable String[] isParameter, @Nullable String isParameter) {
        return null;
    }

    @Nullable
    @Override
    public String isMethod(@NonNull Uri isParameter) {
        return null;
    }

    @Nullable
    @Override
    public Uri isMethod(@NonNull Uri isParameter, @Nullable ContentValues isParameter) {
        return null;
    }

    @Override
    public int isMethod(@NonNull Uri isParameter, @Nullable String isParameter, @Nullable String[] isParameter) {
        return isIntegerConstant;
    }

    @Override
    public int isMethod(@NonNull Uri isParameter, @Nullable ContentValues isParameter, @Nullable String isParameter, @Nullable String[] isParameter) {
        return isIntegerConstant;
    }
}

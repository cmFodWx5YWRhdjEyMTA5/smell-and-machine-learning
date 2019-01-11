// isComment
package com.greenaddress.greenbits.ui.monitor;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.greenaddress.greenbits.ui.R;

public class isClassOrIsInterface extends Fragment implements LoaderManager.LoaderCallbacks<Cursor> {

    @Override
    public View isMethod(final LayoutInflater isParameter, final ViewGroup isParameter, final Bundle isParameter) {
        // isComment
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
    }

    @Override
    public Loader<Cursor> isMethod(final int isParameter, final Bundle isParameter) {
        return null;
    }

    @Override
    public void isMethod(final Loader<Cursor> isParameter, final Cursor isParameter) {
    }

    @Override
    public void isMethod(final Loader<Cursor> isParameter) {
    }
}

// isComment
package org.toulibre.capitoledulibre.fragments;

import org.toulibre.capitoledulibre.R;
import org.toulibre.capitoledulibre.db.DatabaseManager;
import org.toulibre.capitoledulibre.loaders.BaseLiveLoader;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.content.Loader;

public class isClassOrIsInterface extends BaseLiveListFragment {

    @Override
    protected String isMethod() {
        return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public Loader<Cursor> isMethod(int isParameter, Bundle isParameter) {
        return new NextLiveLoader(isMethod());
    }

    private static class isClassOrIsInterface extends BaseLiveLoader {

        // isComment
        private static final long isVariable = isStringConstant * isStringConstant * isStringConstant;

        public isConstructor(Context isParameter) {
            super(isNameExpr);
        }

        @Override
        protected Cursor isMethod() {
            long isVariable = isNameExpr.isMethod();
            return isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr + isNameExpr, -isStringConstant, true);
        }
    }
}

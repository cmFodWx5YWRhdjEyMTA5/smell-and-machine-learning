// isComment
package at.linuxtage.companion.fragments;

import at.linuxtage.companion.R;
import at.linuxtage.companion.db.DatabaseManager;
import at.linuxtage.companion.loaders.BaseLiveLoader;
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
        return new NowLiveLoader(isMethod());
    }

    private static class isClassOrIsInterface extends BaseLiveLoader {

        public isConstructor(Context isParameter) {
            super(isNameExpr);
        }

        @Override
        protected Cursor isMethod() {
            long isVariable = isNameExpr.isMethod();
            return isNameExpr.isMethod().isMethod(-isStringConstant, isNameExpr, isNameExpr, true);
        }
    }
}

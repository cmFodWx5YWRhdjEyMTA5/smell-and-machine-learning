// isComment
package be.digitalia.fosdem.fragments;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.loader.content.Loader;
import be.digitalia.fosdem.R;
import be.digitalia.fosdem.db.DatabaseManager;
import be.digitalia.fosdem.loaders.BaseLiveLoader;

public class isClassOrIsInterface extends BaseLiveListFragment {

    @Override
    protected String isMethod() {
        return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @NonNull
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

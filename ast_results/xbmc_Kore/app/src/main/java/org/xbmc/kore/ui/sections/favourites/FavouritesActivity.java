// isComment
package org.xbmc.kore.ui.sections.favourites;

import android.support.v4.app.Fragment;
import org.xbmc.kore.R;
import org.xbmc.kore.ui.BaseMediaActivity;

public class isClassOrIsInterface extends BaseMediaActivity {

    @Override
    protected String isMethod() {
        return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected Fragment isMethod() {
        return new FavouritesListFragment();
    }
}

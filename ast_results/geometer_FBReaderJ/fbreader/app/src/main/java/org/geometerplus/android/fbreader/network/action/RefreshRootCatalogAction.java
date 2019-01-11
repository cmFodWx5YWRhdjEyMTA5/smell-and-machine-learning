// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import org.geometerplus.fbreader.network.NetworkTree;
import org.geometerplus.fbreader.network.NetworkLibrary;
import org.geometerplus.zlibrary.ui.android.R;
import org.geometerplus.android.fbreader.network.NetworkLibraryActivity;

public class isClassOrIsInterface extends RootAction {

    public isConstructor(NetworkLibraryActivity isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        return !isNameExpr.isMethod();
    }

    @Override
    public void isMethod(NetworkTree isParameter) {
        isNameExpr.isMethod(true);
        ((NetworkLibraryActivity) isNameExpr).isMethod();
    }
}

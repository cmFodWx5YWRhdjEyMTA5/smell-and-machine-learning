// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import android.os.Bundle;
import org.geometerplus.fbreader.tree.FBTree;
import org.geometerplus.fbreader.network.NetworkLibrary;
import org.geometerplus.fbreader.network.NetworkTree;
import org.geometerplus.fbreader.network.tree.SearchCatalogTree;
import org.geometerplus.zlibrary.ui.android.R;
import org.geometerplus.android.fbreader.network.NetworkLibraryActivity;
import org.geometerplus.android.fbreader.network.NetworkSearchActivity;
import org.geometerplus.android.util.DeviceType;
import org.geometerplus.android.util.SearchDialogUtil;

public class isClassOrIsInterface extends Action {

    public static SearchCatalogTree isMethod(FBTree isParameter) {
        for (; isNameExpr != null; isNameExpr = isNameExpr.isFieldAccessExpr) {
            for (FBTree isVariable : isNameExpr.isMethod()) {
                if (isNameExpr instanceof SearchCatalogTree) {
                    return (SearchCatalogTree) isNameExpr;
                }
            }
        }
        return null;
    }

    private final boolean isVariable;

    public isConstructor(Activity isParameter, boolean isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        if (isNameExpr) {
            return isNameExpr instanceof SearchCatalogTree;
        } else {
            return isMethod(isNameExpr) != null;
        }
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        return isNameExpr.isMethod(isMethod(isNameExpr)) == null;
    }

    @Override
    public void isMethod(NetworkTree isParameter) {
        final Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod(isNameExpr).isMethod());
        final NetworkLibrary isVariable = isNameExpr;
        if (isNameExpr.isMethod().isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(), true, isNameExpr, true);
        } else {
            isNameExpr.isMethod(isNameExpr, NetworkSearchActivity.class, isNameExpr.isFieldAccessExpr.isMethod(), null, isNameExpr);
        }
    }
}

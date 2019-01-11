// isComment
package org.geometerplus.android.fbreader.network.action;

import java.util.Map;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.geometerplus.zlibrary.core.network.ZLNetworkContext;
import org.geometerplus.fbreader.network.*;
import org.geometerplus.fbreader.network.tree.*;
import org.geometerplus.android.fbreader.network.*;
import org.geometerplus.android.util.OrientationUtil;
import org.geometerplus.android.util.PackageUtil;

public class isClassOrIsInterface extends Action {

    private final ZLNetworkContext isVariable;

    public isConstructor(Activity isParameter, ZLNetworkContext isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant", -isIntegerConstant);
        isNameExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        if (isNameExpr instanceof NetworkAuthorTree || isNameExpr instanceof NetworkSeriesTree) {
            return true;
        } else if (isNameExpr instanceof NetworkCatalogTree) {
            return ((NetworkCatalogTree) isNameExpr).isMethod();
        } else {
            return true;
        }
    }

    @Override
    public void isMethod(NetworkTree isParameter) {
        if (isNameExpr instanceof NetworkCatalogTree) {
            isMethod((NetworkCatalogTree) isNameExpr);
        } else {
            isMethod(isNameExpr);
        }
    }

    private void isMethod(NetworkTree isParameter) {
        if (isNameExpr instanceof NetworkLibraryActivity) {
            ((NetworkLibraryActivity) isNameExpr).isMethod(isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr, new Intent(isNameExpr.isMethod(), NetworkLibrarySecondaryActivity.class).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()));
        }
    }

    private void isMethod(final NetworkCatalogTree isParameter) {
        final NetworkItemsLoader isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null && isNameExpr.isMethod()) {
            isMethod(isNameExpr);
        } else if (isNameExpr != null) {
            isNameExpr.isMethod(new Runnable() {

                public void isMethod() {
                    isMethod(isNameExpr);
                }
            });
        } else {
            isMethod(isNameExpr);
        }
    }

    private void isMethod(final NetworkCatalogTree isParameter) {
        boolean isVariable = true;
        if (isNameExpr.isMethod()) {
            if (isNameExpr.isMethod()) {
                if (isNameExpr.isFieldAccessExpr.isMethod()) {
                    isNameExpr = true;
                } else {
                    isMethod(isNameExpr);
                    return;
                }
            } else {
                isNameExpr.isMethod();
            }
        }
        isNameExpr.isMethod(isNameExpr, true, isNameExpr);
        isMethod(isNameExpr);
    }
}

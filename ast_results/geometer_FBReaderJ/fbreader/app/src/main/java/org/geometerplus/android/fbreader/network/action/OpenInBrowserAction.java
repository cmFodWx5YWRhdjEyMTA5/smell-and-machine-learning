// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import org.geometerplus.zlibrary.core.resources.ZLResource;
import org.geometerplus.fbreader.network.*;
import org.geometerplus.fbreader.network.tree.NetworkCatalogTree;
import org.geometerplus.fbreader.network.urlInfo.UrlInfo;
import org.geometerplus.android.fbreader.network.Util;

public class isClassOrIsInterface extends CatalogAction {

    public isConstructor(Activity isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        if (!super.isMethod(isNameExpr)) {
            return true;
        }
        final NetworkCatalogItem isVariable = ((NetworkCatalogTree) isNameExpr).isFieldAccessExpr;
        if (!(isNameExpr instanceof NetworkURLCatalogItem)) {
            return true;
        }
        return ((NetworkURLCatalogItem) isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) != null;
    }

    @Override
    public void isMethod(NetworkTree isParameter) {
        final String isVariable = ((NetworkURLCatalogItem) ((NetworkCatalogTree) isNameExpr).isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        } else {
            final ZLResource isVariable = isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant");
            final String isVariable = isNameExpr.isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod();
            new AlertDialog.Builder(isNameExpr).isMethod(isNameExpr.isMethod()).isMethod(isNameExpr).isMethod(isIntegerConstant).isMethod(isNameExpr.isMethod("isStringConstant").isMethod(), new DialogInterface.OnClickListener() {

                public void isMethod(DialogInterface isParameter, int isParameter) {
                    isNameExpr.isMethod(isNameExpr, isNameExpr);
                }
            }).isMethod(isNameExpr.isMethod("isStringConstant").isMethod(), null).isMethod().isMethod();
        }
    }
}

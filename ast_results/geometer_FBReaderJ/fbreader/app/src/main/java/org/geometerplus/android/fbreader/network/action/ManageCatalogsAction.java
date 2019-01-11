// isComment
package org.geometerplus.android.fbreader.network.action;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import org.geometerplus.fbreader.network.tree.RootTree;
import org.geometerplus.fbreader.network.tree.ManageCatalogsItemTree;
import org.geometerplus.fbreader.network.NetworkTree;
import org.geometerplus.fbreader.network.NetworkLibrary;
import org.geometerplus.zlibrary.ui.android.R;
import org.geometerplus.android.fbreader.network.CatalogManagerActivity;
import org.geometerplus.android.fbreader.network.NetworkLibraryActivity;
import org.geometerplus.android.util.OrientationUtil;

public class isClassOrIsInterface extends RootAction {

    public isConstructor(Activity isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        return isNameExpr instanceof RootTree || isNameExpr instanceof ManageCatalogsItemTree;
    }

    @Override
    public void isMethod(NetworkTree isParameter) {
        final ArrayList<String> isVariable = new ArrayList<String>(isNameExpr.isMethod());
        final ArrayList<String> isVariable = new ArrayList<String>(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, new Intent(isNameExpr.isMethod(), CatalogManagerActivity.class).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr), isNameExpr.isFieldAccessExpr);
    }
}

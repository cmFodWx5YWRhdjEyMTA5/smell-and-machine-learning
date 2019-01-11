// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.geometerplus.fbreader.network.NetworkTree;
import org.geometerplus.fbreader.network.tree.RootTree;
import org.geometerplus.fbreader.network.tree.AddCustomCatalogItemTree;
import org.geometerplus.android.fbreader.network.AddCatalogMenuActivity;
import org.geometerplus.zlibrary.ui.android.R;

public class isClassOrIsInterface extends Action {

    public isConstructor(Activity isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        return isNameExpr instanceof RootTree || isNameExpr instanceof AddCustomCatalogItemTree;
    }

    @Override
    public void isMethod(NetworkTree isParameter) {
        isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod("isStringConstant"), isNameExpr, AddCatalogMenuActivity.class));
    }
}

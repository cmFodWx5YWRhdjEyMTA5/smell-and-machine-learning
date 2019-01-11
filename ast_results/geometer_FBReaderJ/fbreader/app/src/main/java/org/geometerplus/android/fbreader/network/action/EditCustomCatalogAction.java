// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import android.content.Intent;
import org.geometerplus.fbreader.network.NetworkTree;
import org.geometerplus.fbreader.network.ICustomNetworkLink;
import org.geometerplus.fbreader.network.tree.NetworkCatalogRootTree;
import org.geometerplus.android.fbreader.network.Util;
import org.geometerplus.android.fbreader.network.AddCustomCatalogActivity;

public class isClassOrIsInterface extends CatalogAction {

    public isConstructor(Activity isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        return isNameExpr instanceof NetworkCatalogRootTree && isNameExpr.isMethod() instanceof ICustomNetworkLink;
    }

    @Override
    public void isMethod(NetworkTree isParameter) {
        final Intent isVariable = new Intent(isNameExpr, AddCustomCatalogActivity.class);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
    }
}

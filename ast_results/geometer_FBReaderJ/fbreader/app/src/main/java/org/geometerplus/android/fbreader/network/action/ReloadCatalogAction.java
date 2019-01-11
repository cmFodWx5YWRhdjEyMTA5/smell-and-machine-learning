// isComment
package org.geometerplus.android.fbreader.network.action;

import org.geometerplus.zlibrary.core.network.ZLNetworkContext;
import org.geometerplus.zlibrary.ui.android.R;
import org.geometerplus.fbreader.network.*;
import org.geometerplus.fbreader.network.tree.NetworkCatalogTree;
import org.geometerplus.fbreader.network.urlInfo.UrlInfo;
import org.geometerplus.android.fbreader.network.NetworkLibraryActivity;

public class isClassOrIsInterface extends CatalogAction {

    private final ZLNetworkContext isVariable;

    public isConstructor(NetworkLibraryActivity isParameter, ZLNetworkContext isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr;
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
    public boolean isMethod(NetworkTree isParameter) {
        return isNameExpr.isMethod(isNameExpr) == null;
    }

    @Override
    public void isMethod(NetworkTree isParameter) {
        if (isNameExpr.isMethod(isNameExpr) != null) {
            return;
        }
        ((NetworkCatalogTree) isNameExpr).isMethod();
        ((NetworkCatalogTree) isNameExpr).isMethod(isNameExpr, true, true);
    }
}

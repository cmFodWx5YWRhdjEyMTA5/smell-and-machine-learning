// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import org.geometerplus.fbreader.network.NetworkTree;
import org.geometerplus.fbreader.network.BasketItem;
import org.geometerplus.fbreader.network.tree.BasketCatalogTree;

public class isClassOrIsInterface extends CatalogAction {

    public isConstructor(Activity isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        return isNameExpr instanceof BasketCatalogTree && ((BasketCatalogTree) isNameExpr).isMethod();
    }

    @Override
    public void isMethod(NetworkTree isParameter) {
        ((BasketItem) ((BasketCatalogTree) isNameExpr).isFieldAccessExpr).isMethod();
    }
}

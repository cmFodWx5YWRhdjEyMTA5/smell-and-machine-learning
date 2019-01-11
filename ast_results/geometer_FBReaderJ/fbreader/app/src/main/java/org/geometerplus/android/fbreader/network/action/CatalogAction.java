// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import org.geometerplus.fbreader.network.NetworkTree;
import org.geometerplus.fbreader.network.tree.NetworkCatalogTree;

abstract class isClassOrIsInterface extends Action {

    protected isConstructor(Activity isParameter, int isParameter, String isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    protected isConstructor(Activity isParameter, int isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, -isIntegerConstant);
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        return isNameExpr instanceof NetworkCatalogTree;
    }
}

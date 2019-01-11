// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import org.geometerplus.fbreader.network.NetworkBookItem;
import org.geometerplus.fbreader.network.NetworkTree;
import org.geometerplus.fbreader.network.tree.NetworkBookTree;

abstract class isClassOrIsInterface extends Action {

    protected isConstructor(Activity isParameter, int isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, -isIntegerConstant);
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        return isNameExpr instanceof NetworkBookTree;
    }

    protected NetworkBookItem isMethod(NetworkTree isParameter) {
        return ((NetworkBookTree) isNameExpr).isFieldAccessExpr;
    }
}

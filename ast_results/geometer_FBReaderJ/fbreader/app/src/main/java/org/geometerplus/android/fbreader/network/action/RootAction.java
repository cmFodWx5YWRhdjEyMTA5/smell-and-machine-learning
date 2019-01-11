// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import org.geometerplus.fbreader.network.NetworkTree;
import org.geometerplus.fbreader.network.tree.RootTree;

public abstract class isClassOrIsInterface extends Action {

    protected isConstructor(Activity isParameter, int isParameter, String isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        return isNameExpr instanceof RootTree;
    }
}

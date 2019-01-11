// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import org.geometerplus.fbreader.network.NetworkLibrary;
import org.geometerplus.fbreader.network.NetworkTree;
import org.geometerplus.fbreader.network.tree.RootTree;
import org.geometerplus.android.fbreader.network.NetworkLibraryActivity;

public class isClassOrIsInterface extends Action {

    public isConstructor(Activity isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant", -isIntegerConstant);
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        if (!(isNameExpr instanceof NetworkLibraryActivity)) {
            return true;
        }
        if (isNameExpr instanceof RootTree) {
            return true;
        }
        for (; isNameExpr != null; isNameExpr = (NetworkTree) isNameExpr.isFieldAccessExpr) {
            if (isNameExpr instanceof RootTree) {
                return isNameExpr == isNameExpr.isMethod();
            }
        }
        return true;
    }

    @Override
    public void isMethod(NetworkTree isParameter) {
        final NetworkLibraryActivity isVariable = (NetworkLibraryActivity) isNameExpr;
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod();
    }
}

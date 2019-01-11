// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import org.geometerplus.fbreader.network.*;
import org.geometerplus.fbreader.network.tree.NetworkCatalogRootTree;

public class isClassOrIsInterface extends Action {

    public isConstructor(Activity isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant", -isIntegerConstant);
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        return isNameExpr instanceof NetworkCatalogRootTree && isNameExpr.isMethod().isMethod() != isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(NetworkTree isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        isNameExpr.isMethod();
    // isComment
    }
}

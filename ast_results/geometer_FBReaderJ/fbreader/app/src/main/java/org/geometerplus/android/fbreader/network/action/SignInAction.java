// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import org.geometerplus.fbreader.network.NetworkTree;
import org.geometerplus.fbreader.network.tree.NetworkCatalogRootTree;
import org.geometerplus.fbreader.network.authentication.NetworkAuthenticationManager;
import org.geometerplus.android.fbreader.network.Util;

public class isClassOrIsInterface extends Action {

    public isConstructor(Activity isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant", -isIntegerConstant);
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        if (!(isNameExpr instanceof NetworkCatalogRootTree)) {
            return true;
        }
        final NetworkAuthenticationManager isVariable = isNameExpr.isMethod().isMethod();
        return isNameExpr != null && !isNameExpr.isMethod(true);
    }

    @Override
    public void isMethod(NetworkTree isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), null);
    }
}

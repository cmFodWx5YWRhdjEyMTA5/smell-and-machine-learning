// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import org.geometerplus.fbreader.network.NetworkLibrary;
import org.geometerplus.fbreader.network.NetworkTree;
import org.geometerplus.fbreader.network.ICustomNetworkLink;
import org.geometerplus.fbreader.network.tree.NetworkCatalogRootTree;

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
        isNameExpr.isMethod((ICustomNetworkLink) isNameExpr.isMethod());
        isNameExpr.isMethod();
    }
}

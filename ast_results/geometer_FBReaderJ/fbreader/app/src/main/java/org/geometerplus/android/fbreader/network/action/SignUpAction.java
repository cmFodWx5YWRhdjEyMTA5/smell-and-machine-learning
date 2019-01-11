// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import org.geometerplus.fbreader.network.INetworkLink;
import org.geometerplus.fbreader.network.NetworkTree;
import org.geometerplus.fbreader.network.authentication.NetworkAuthenticationManager;
import org.geometerplus.fbreader.network.tree.NetworkCatalogRootTree;
import org.geometerplus.fbreader.network.urlInfo.UrlInfo;
import org.geometerplus.android.fbreader.network.Util;
import org.geometerplus.android.fbreader.network.litres.UserRegistrationActivity;

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
        final INetworkLink isVariable = isNameExpr.isMethod();
        try {
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr, UserRegistrationActivity.class));
        } catch (ActivityNotFoundException isParameter) {
        }
    }
}

// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import org.geometerplus.zlibrary.core.money.Money;
import org.geometerplus.fbreader.network.INetworkLink;
import org.geometerplus.fbreader.network.NetworkTree;
import org.geometerplus.fbreader.network.tree.NetworkCatalogRootTree;
import org.geometerplus.fbreader.network.tree.TopUpTree;
import org.geometerplus.fbreader.network.authentication.NetworkAuthenticationManager;
import org.geometerplus.android.fbreader.network.TopupMenuActivity;

public class isClassOrIsInterface extends Action {

    public isConstructor(Activity isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant", -isIntegerConstant);
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        if (isNameExpr instanceof TopUpTree) {
            return true;
        } else if (isNameExpr instanceof NetworkCatalogRootTree) {
            final INetworkLink isVariable = isNameExpr.isMethod();
            final NetworkAuthenticationManager isVariable = isNameExpr.isMethod();
            return isNameExpr != null && isNameExpr.isMethod(true) && isNameExpr.isMethod() != null && isNameExpr.isMethod(isNameExpr);
        } else {
            return true;
        }
    }

    @Override
    public void isMethod(NetworkTree isParameter) {
        final INetworkLink isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr, null);
        }
    }

    @Override
    public String isMethod(NetworkTree isParameter) {
        final INetworkLink isVariable = isNameExpr.isMethod();
        Money isVariable = null;
        if (isNameExpr != null) {
            final NetworkAuthenticationManager isVariable = isNameExpr.isMethod();
            if (isNameExpr != null && isNameExpr.isMethod(true)) {
                isNameExpr = isNameExpr.isMethod();
            }
        }
        return super.isMethod(isNameExpr).isMethod("isStringConstant", isNameExpr != null ? isNameExpr.isMethod() : "isStringConstant");
    }
}

// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import org.geometerplus.zlibrary.core.network.ZLNetworkContext;
import org.geometerplus.fbreader.network.*;
import org.geometerplus.fbreader.network.authentication.NetworkAuthenticationManager;
import org.geometerplus.fbreader.network.sync.SyncUtil;
import org.geometerplus.fbreader.network.tree.NetworkCatalogRootTree;
import org.geometerplus.android.util.UIUtil;

public class isClassOrIsInterface extends Action {

    private final ZLNetworkContext isVariable;

    public isConstructor(Activity isParameter, ZLNetworkContext isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant", -isIntegerConstant);
        isNameExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(NetworkTree isParameter) {
        if (!(isNameExpr instanceof NetworkCatalogRootTree)) {
            return true;
        }
        final INetworkLink isVariable = isNameExpr.isMethod();
        if (isNameExpr instanceof ISyncNetworkLink) {
            return ((ISyncNetworkLink) isNameExpr).isMethod(isNameExpr);
        }
        final NetworkAuthenticationManager isVariable = isNameExpr.isMethod();
        return isNameExpr != null && isNameExpr.isMethod(true);
    }

    @Override
    public void isMethod(NetworkTree isParameter) {
        final INetworkLink isVariable = isNameExpr.isMethod();
        if (isNameExpr instanceof ISyncNetworkLink) {
            ((ISyncNetworkLink) isNameExpr).isMethod(isNameExpr);
            ((NetworkCatalogRootTree) isNameExpr).isMethod();
            return;
        }
        final NetworkAuthenticationManager isVariable = isNameExpr.isMethod();
        final Runnable isVariable = new Runnable() {

            public void isMethod() {
                if (isNameExpr.isMethod(true)) {
                    isNameExpr.isMethod();
                    isNameExpr.isMethod(new Runnable() {

                        public void isMethod() {
                            isNameExpr.isMethod();
                            isNameExpr.isMethod();
                        }
                    });
                }
            }
        };
        isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr);
    }

    private String isMethod(NetworkTree isParameter) {
        final INetworkLink isVariable = isNameExpr.isMethod();
        if (isNameExpr instanceof ISyncNetworkLink) {
            return isNameExpr.isMethod(isNameExpr);
        }
        final NetworkAuthenticationManager isVariable = isNameExpr.isMethod();
        return isNameExpr != null && isNameExpr.isMethod(true) ? isNameExpr.isMethod() : null;
    }

    @Override
    public String isMethod(NetworkTree isParameter) {
        final String isVariable = isMethod(isNameExpr);
        return super.isMethod(isNameExpr).isMethod("isStringConstant", isNameExpr != null ? isNameExpr : "isStringConstant");
    }

    @Override
    public String isMethod(NetworkTree isParameter) {
        final String isVariable = isMethod(isNameExpr);
        return super.isMethod(isNameExpr).isMethod("isStringConstant", isNameExpr != null ? isNameExpr : "isStringConstant");
    }
}

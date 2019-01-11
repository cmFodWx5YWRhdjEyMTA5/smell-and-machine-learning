// isComment
package org.geometerplus.android.fbreader.network.action;

import android.app.Activity;
import android.content.Intent;
import org.geometerplus.zlibrary.core.network.ZLNetworkContext;
import org.geometerplus.zlibrary.core.network.ZLNetworkException;
import org.geometerplus.fbreader.network.NetworkTree;
import org.geometerplus.android.fbreader.network.NetworkBookInfoActivity;
import org.geometerplus.android.fbreader.network.NetworkLibraryActivity;
import org.geometerplus.android.util.OrientationUtil;
import org.geometerplus.android.util.UIUtil;

public class isClassOrIsInterface extends BookAction {

    private final ZLNetworkContext isVariable;

    public isConstructor(Activity isParameter, ZLNetworkContext isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr = isNameExpr;
    }

    @Override
    public void isMethod(final NetworkTree isParameter) {
        if (isMethod(isNameExpr).isMethod()) {
            isMethod(isNameExpr);
        } else {
            isNameExpr.isMethod("isStringConstant", new Runnable() {

                public void isMethod() {
                    isMethod(isNameExpr).isMethod(isNameExpr);
                    isNameExpr.isMethod(new Runnable() {

                        public void isMethod() {
                            isMethod(isNameExpr);
                        }
                    });
                }
            }, isNameExpr);
        }
    }

    private void isMethod(NetworkTree isParameter) {
        isNameExpr.isMethod(isNameExpr, new Intent(isNameExpr, NetworkBookInfoActivity.class).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()), isIntegerConstant);
    }
}

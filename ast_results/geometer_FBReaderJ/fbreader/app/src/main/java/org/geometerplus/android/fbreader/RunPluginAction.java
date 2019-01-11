// isComment
package org.geometerplus.android.fbreader;

import android.content.Intent;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import org.geometerplus.fbreader.fbreader.FBReaderApp;
import org.geometerplus.android.fbreader.api.PluginApi;
import org.geometerplus.android.util.OrientationUtil;

class isClassOrIsInterface extends FBAndroidAction {

    private final Uri isVariable;

    isConstructor(FBReader isParameter, FBReaderApp isParameter, Uri isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    protected void isMethod(Object... isParameter) {
        if (isNameExpr == null) {
            return;
        }
        try {
            isNameExpr.isMethod(isNameExpr, new Intent(isNameExpr.isFieldAccessExpr, isNameExpr));
        } catch (ActivityNotFoundException isParameter) {
        }
    }
}

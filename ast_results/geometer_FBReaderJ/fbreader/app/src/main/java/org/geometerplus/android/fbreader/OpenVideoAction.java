// isComment
package org.geometerplus.android.fbreader;

import java.util.Map;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import org.geometerplus.zlibrary.core.util.MimeType;
import org.geometerplus.zlibrary.text.view.ZLTextVideoElement;
import org.geometerplus.zlibrary.text.view.ZLTextVideoRegionSoul;
import org.geometerplus.fbreader.fbreader.FBReaderApp;
import org.geometerplus.android.fbreader.httpd.DataUtil;
import org.geometerplus.android.util.UIMessageUtil;

class isClassOrIsInterface extends FBAndroidAction {

    isConstructor(FBReader isParameter, FBReaderApp isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod(Object... isParameter) {
        if (isNameExpr.isFieldAccessExpr != isIntegerConstant || !(isNameExpr[isIntegerConstant] instanceof ZLTextVideoRegionSoul)) {
            return;
        }
        final ZLTextVideoElement isVariable = ((ZLTextVideoRegionSoul) isNameExpr[isIntegerConstant]).isFieldAccessExpr;
        boolean isVariable = true;
        for (MimeType isVariable : isNameExpr.isFieldAccessExpr) {
            final String isVariable = isNameExpr.isMethod();
            final String isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            if (isNameExpr == null) {
                continue;
            }
            final Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr);
            final String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
            if (isNameExpr == null) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
                return;
            }
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
            try {
                isNameExpr.isMethod(isNameExpr);
                return;
            } catch (ActivityNotFoundException isParameter) {
                isNameExpr = true;
                continue;
            }
        }
        if (isNameExpr) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
        }
    }
}

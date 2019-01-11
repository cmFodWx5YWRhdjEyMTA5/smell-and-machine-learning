// isComment
package org.geometerplus.android.fbreader.crash;

import android.os.Bundle;
import org.geometerplus.zlibrary.core.resources.ZLResource;
import org.geometerplus.android.fbreader.util.SimpleDialogActivity;

public class isClassOrIsInterface extends SimpleDialogActivity {

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        final ZLResource isVariable = isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant").isMethod());
        isMethod().isMethod(isNameExpr.isMethod("isStringConstant").isMethod());
        isMethod().isMethod(isMethod());
        isMethod("isStringConstant", null);
    }
}

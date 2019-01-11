// isComment
package org.geometerplus.android.fbreader.error;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import org.geometerplus.zlibrary.core.resources.ZLResource;
import org.geometerplus.zlibrary.ui.android.error.ErrorKeys;
import org.geometerplus.zlibrary.ui.android.error.ErrorUtil;
import org.geometerplus.android.fbreader.util.SimpleDialogActivity;

public class isClassOrIsInterface extends SimpleDialogActivity implements ErrorKeys {

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        final ZLResource isVariable = isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant").isMethod());
        isMethod().isMethod(isMethod().isMethod(isNameExpr));
        isMethod().isMethod(new View.OnClickListener() {

            public void isMethod(View isParameter) {
                final Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { "isStringConstant" });
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod().isMethod(isNameExpr));
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant" + new ErrorUtil(isNameExpr.this).isMethod() + "isStringConstant");
                isNameExpr.isMethod("isStringConstant");
                isMethod(isNameExpr);
                isMethod();
            }
        });
        isMethod().isMethod(isMethod());
        isMethod("isStringConstant", "isStringConstant");
    }
}

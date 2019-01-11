// isComment
package org.geometerplus.android.fbreader.preferences;

import android.content.Context;
import android.preference.Preference;
import android.view.View;
import android.widget.TextView;
import yuku.ambilwarna.AmbilWarnaDialog;
import org.geometerplus.zlibrary.core.resources.ZLResource;
import org.geometerplus.zlibrary.core.util.ZLColor;
import org.geometerplus.zlibrary.ui.android.R;
import org.geometerplus.zlibrary.ui.android.util.ZLAndroidColorUtil;

public abstract class isClassOrIsInterface extends Preference {

    protected isConstructor(Context isParameter) {
        super(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    public abstract String isMethod();

    protected abstract ZLColor isMethod();

    protected abstract void isMethod(ZLColor isParameter);

    @Override
    protected void isMethod(View isParameter) {
        super.isMethod(isNameExpr);
        ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(isMethod()));
    }

    @Override
    protected void isMethod() {
        final ZLResource isVariable = isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant");
        new AmbilWarnaDialog(isMethod(), isNameExpr.isMethod(isMethod()), new AmbilWarnaDialog.OnAmbilWarnaListener() {

            @Override
            public void isMethod(AmbilWarnaDialog isParameter, int isParameter) {
                if (!isMethod(isNameExpr)) {
                    return;
                }
                isMethod(new ZLColor(isNameExpr));
                isMethod();
            }

            @Override
            public void isMethod(AmbilWarnaDialog isParameter) {
            }
        }, isNameExpr.isMethod("isStringConstant").isMethod(), isNameExpr.isMethod("isStringConstant").isMethod()).isMethod();
    }
}

// isComment
package org.wahtod.wififixer.legacy;

import android.annotation.SuppressLint;
import android.os.StrictMode;

public class isClassOrIsInterface extends StrictModeDetector {

    @SuppressLint("isStringConstant")
    @Override
    public boolean isMethod(boolean isParameter) {
        if (isNameExpr) {
            isNameExpr.isMethod(new StrictMode.ThreadPolicy.Builder().isMethod().isMethod().isMethod());
        }
        return true;
    }
}

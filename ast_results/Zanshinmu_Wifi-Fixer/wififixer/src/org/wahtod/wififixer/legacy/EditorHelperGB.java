// isComment
package org.wahtod.wififixer.legacy;

import android.annotation.SuppressLint;
import android.content.SharedPreferences.Editor;

public class isClassOrIsInterface extends EditorDetector {

    @SuppressLint("isStringConstant")
    @Override
    public void isMethod(Editor isParameter) {
        isNameExpr.isMethod();
    }
}

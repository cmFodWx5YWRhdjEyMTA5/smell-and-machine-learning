// isComment
package com.anysoftkeyboard.devicespecific;

import android.annotation.TargetApi;
import android.view.inputmethod.InputMethodSubtype;

@TargetApi(isIntegerConstant)
public class isClassOrIsInterface extends DeviceSpecificV19 {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected InputMethodSubtype.InputMethodSubtypeBuilder isMethod(String isParameter, CharSequence isParameter) {
        // isComment
        return super.isMethod(isNameExpr, isNameExpr).isMethod(isNameExpr);
    }
}

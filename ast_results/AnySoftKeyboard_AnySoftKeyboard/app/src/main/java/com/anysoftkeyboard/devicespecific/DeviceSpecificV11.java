// isComment
package com.anysoftkeyboard.devicespecific;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.InputConnection;

@TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
public class isClassOrIsInterface extends DeviceSpecificLowest {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public void isMethod(InputConnection isParameter, int isParameter, CharSequence isParameter, CharSequence isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        CorrectionInfo isVariable = new CorrectionInfo(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(Canvas isParameter) {
        return isNameExpr != null && isNameExpr.isMethod();
    }

    @Override
    public Clipboard isMethod(Context isParameter) {
        return new ClipboardV11(isNameExpr);
    }
}

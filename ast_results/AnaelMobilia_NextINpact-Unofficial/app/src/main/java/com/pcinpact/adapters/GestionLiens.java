// isComment
package com.pcinpact.adapters;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;
import com.pcinpact.utils.Constantes;

/**
 * isComment
 */
public class isClassOrIsInterface extends LinkMovementMethod {

    @Override
    public boolean isMethod(TextView isParameter, Spannable isParameter, MotionEvent isParameter) {
        Boolean isVariable = true;
        try {
            // isComment
            isNameExpr = super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        } catch (Exception isParameter) {
            // isComment
            if (isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr);
            }
        }
        return isNameExpr;
    }
}

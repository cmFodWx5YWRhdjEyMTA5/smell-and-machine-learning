// isComment
package be.digitalia.fosdem.utils;

import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * isComment
 */
public class isClassOrIsInterface extends ArrowKeyMovementMethod {

    private static ClickableArrowKeyMovementMethod isVariable;

    private final RectF isVariable = new RectF();

    public static MovementMethod isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new ClickableArrowKeyMovementMethod();
        }
        return isNameExpr;
    }

    @Override
    public boolean isMethod(TextView isParameter, Spannable isParameter, MotionEvent isParameter) {
        // isComment
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            // isComment
            int isVariable = (int) isNameExpr.isMethod();
            int isVariable = (int) isNameExpr.isMethod();
            isNameExpr -= isNameExpr.isMethod();
            isNameExpr -= isNameExpr.isMethod();
            isNameExpr += isNameExpr.isMethod();
            isNameExpr += isNameExpr.isMethod();
            // isComment
            Layout isVariable = isNameExpr.isMethod();
            int isVariable = isNameExpr.isMethod(isNameExpr);
            // isComment
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr) + isNameExpr.isFieldAccessExpr;
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isMethod(isNameExpr, isNameExpr)) {
                int isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
                // isComment
                ClickableSpan[] isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, ClickableSpan.class);
                if (isNameExpr.isFieldAccessExpr > isIntegerConstant) {
                    isNameExpr[isIntegerConstant].isMethod(isNameExpr);
                    return true;
                }
            }
        }
        return super.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }
}

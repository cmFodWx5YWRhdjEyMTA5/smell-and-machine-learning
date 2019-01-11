// isComment
package de.ub0r.android.websms;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;

/**
 * isComment
 */
public class isClassOrIsInterface extends TimePickerDialog {

    /**
     * isComment
     */
    private int isVariable;

    /**
     * isComment
     */
    private static boolean isVariable;

    /**
     * isComment
     */
    public isConstructor(final Context isParameter, final TimePickerDialog.OnTimeSetListener isParameter, final int isParameter, final int isParameter, final boolean isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public static final void isMethod(final boolean isParameter) {
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    public final void isMethod(final TimePicker isParameter, final int isParameter, final int isParameter) {
        if (isNameExpr.isFieldAccessExpr && isNameExpr % isIntegerConstant != isIntegerConstant) {
            // isComment
            int isVariable = isNameExpr;
            if (this.isFieldAccessExpr == isIntegerConstant && isNameExpr == isIntegerConstant) {
                isNameExpr = isIntegerConstant;
            } else if (this.isFieldAccessExpr % isIntegerConstant != isIntegerConstant) {
                isNameExpr = ((isNameExpr / isIntegerConstant)) * isIntegerConstant;
            } else if (isNameExpr >= this.isFieldAccessExpr) {
                isNameExpr = ((isNameExpr / isIntegerConstant) + isIntegerConstant) * isIntegerConstant;
            } else {
                isNameExpr = ((isNameExpr / isIntegerConstant)) * isIntegerConstant;
            }
            isNameExpr = isNameExpr % isIntegerConstant;
            isNameExpr.isMethod(isNameExpr);
            this.isFieldAccessExpr = isNameExpr;
        } else {
            this.isFieldAccessExpr = isNameExpr;
        }
    }
}

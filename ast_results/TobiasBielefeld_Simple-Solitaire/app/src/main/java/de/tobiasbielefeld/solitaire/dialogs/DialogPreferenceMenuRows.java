// isComment
package de.tobiasbielefeld.solitaire.dialogs;

import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Spinner;
import de.tobiasbielefeld.solitaire.R;
import de.tobiasbielefeld.solitaire.classes.CustomDialogPreference;
import static de.tobiasbielefeld.solitaire.SharedData.*;

public class isClassOrIsInterface extends CustomDialogPreference {

    Spinner isVariable, isVariable;

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(null);
    }

    @Override
    protected void isMethod(View isParameter) {
        isNameExpr = (Spinner) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (Spinner) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant);
        super.isMethod(isNameExpr);
    }

    @Override
    protected void isMethod(boolean isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr) {
            isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        }
    }
}

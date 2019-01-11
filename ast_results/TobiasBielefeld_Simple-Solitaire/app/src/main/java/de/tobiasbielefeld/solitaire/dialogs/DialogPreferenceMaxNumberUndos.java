// isComment
package de.tobiasbielefeld.solitaire.dialogs;

import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import de.tobiasbielefeld.solitaire.R;
import de.tobiasbielefeld.solitaire.classes.CustomDialogPreference;
import static de.tobiasbielefeld.solitaire.SharedData.prefs;
import static de.tobiasbielefeld.solitaire.SharedData.showToast;
import static de.tobiasbielefeld.solitaire.SharedData.stringFormat;

public class isClassOrIsInterface extends CustomDialogPreference {

    private EditText isVariable;

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(null);
    }

    @Override
    protected void isMethod(View isParameter) {
        isNameExpr = (EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isMethod(isNameExpr.isMethod(isNameExpr.isMethod())));
        super.isMethod(isNameExpr);
    }

    @Override
    protected void isMethod(boolean isParameter) {
        // isComment
        if (isNameExpr) {
            try {
                // isComment
                if (isNameExpr.isMethod(isNameExpr.isMethod().isMethod()) < isIntegerConstant) {
                    isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod());
                    return;
                }
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod().isMethod()));
            } catch (Exception isParameter) {
                isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod());
            }
        }
    }
}

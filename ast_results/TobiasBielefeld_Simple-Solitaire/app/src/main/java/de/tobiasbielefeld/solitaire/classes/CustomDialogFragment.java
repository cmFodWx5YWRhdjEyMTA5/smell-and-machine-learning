// isComment
package de.tobiasbielefeld.solitaire.classes;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.Window;
import android.view.WindowManager;
import de.tobiasbielefeld.solitaire.SharedData;
import static de.tobiasbielefeld.solitaire.SharedData.logText;
import static de.tobiasbielefeld.solitaire.SharedData.prefs;

public class isClassOrIsInterface extends DialogFragment {

    private static CustomDialogFragment isVariable;

    @Override
    public void isMethod(FragmentManager isParameter, String isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr = this;
        isNameExpr.isFieldAccessExpr = true;
    }

    @Override
    public void isMethod(DialogInterface isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr == this) {
            isNameExpr.isFieldAccessExpr = true;
        }
    }

    protected AlertDialog isMethod(AlertDialog isParameter) {
        if (isNameExpr.isMethod()) {
            Window isVariable = isNameExpr.isMethod();
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
            if (isNameExpr.isMethod() != null) {
                isNameExpr.isMethod().isMethod(true);
            }
        }
        return isNameExpr;
    }
}

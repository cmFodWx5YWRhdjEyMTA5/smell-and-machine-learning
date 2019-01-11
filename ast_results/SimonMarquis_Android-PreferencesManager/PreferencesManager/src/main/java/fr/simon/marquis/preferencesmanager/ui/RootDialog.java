// isComment
package fr.simon.marquis.preferencesmanager.ui;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import fr.simon.marquis.preferencesmanager.R;

public class isClassOrIsInterface extends DialogFragment {

    public static RootDialog isMethod() {
        return new RootDialog();
    }

    @Override
    public Dialog isMethod(Bundle isParameter) {
        if (isMethod() == null) {
            return null;
        }
        return new Builder(isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new OnClickListener() {

            @Override
            public void isMethod(DialogInterface isParameter, int isParameter) {
                isMethod();
            }
        }).isMethod();
    }
}

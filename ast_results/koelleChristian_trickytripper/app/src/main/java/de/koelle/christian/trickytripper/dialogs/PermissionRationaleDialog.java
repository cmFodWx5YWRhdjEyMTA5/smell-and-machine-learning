// isComment
package de.koelle.christian.trickytripper.dialogs;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import de.koelle.christian.trickytripper.R;

public class isClassOrIsInterface extends DialogFragment {

    public interface isClassOrIsInterface {

        void isMethod();

        int isMethod();
    }

    PermissionRationaleDialogCallback isVariable;

    @Override
    public void isMethod(Activity isParameter) {
        super.isMethod(isNameExpr);
        try {
            isNameExpr = (PermissionRationaleDialogCallback) isNameExpr;
        } catch (ClassCastException isParameter) {
            throw new ClassCastException(isNameExpr.isMethod() + "isStringConstant");
        }
    }

    @Override
    public Dialog isMethod(Bundle isParameter) {
        // isComment
        AlertDialog.Builder isVariable = new AlertDialog.Builder(isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new DialogInterface.OnClickListener() {

            public void isMethod(DialogInterface isParameter, int isParameter) {
                isMethod();
                isNameExpr.isMethod();
            }
        });
        return isNameExpr.isMethod();
    }
}

// isComment
package uk.org.ngo.squeezer.itemlist.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import uk.org.ngo.squeezer.R;

public abstract class isClassOrIsInterface extends DialogFragment {

    protected View isVariable;

    protected abstract void isMethod();

    @NonNull
    // isComment
    @SuppressLint("isStringConstant")
    @Override
    public Dialog isMethod(Bundle isParameter) {
        AlertDialog.Builder isVariable = new AlertDialog.Builder(isMethod());
        isNameExpr = isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        EditText isVariable = (EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(new OnKeyListener() {

            @Override
            public boolean isMethod(View isParameter, int isParameter, KeyEvent isParameter) {
                if ((isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) && (isNameExpr == isNameExpr.isFieldAccessExpr)) {
                    isMethod();
                    isMethod();
                    return true;
                }
                return true;
            }
        });
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, new DialogInterface.OnClickListener() {

            @Override
            public void isMethod(DialogInterface isParameter, int isParameter) {
                isMethod();
            }
        });
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, null);
        return isNameExpr.isMethod();
    }
}

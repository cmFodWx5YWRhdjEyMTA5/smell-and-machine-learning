// isComment
package org.sagemath.droid.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import org.sagemath.droid.R;
import org.sagemath.droid.adapters.InsertsAdapter;
import org.sagemath.droid.models.database.Insert;

/**
 * isComment
 */
public class isClassOrIsInterface extends DialogFragment {

    private static final String isVariable = "isStringConstant";

    public interface isClassOrIsInterface {

        public void isMethod(Insert isParameter);
    }

    private OnInsertSelectedListener isVariable;

    public void isMethod(OnInsertSelectedListener isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public static InsertSpinnerDialogFragment isMethod() {
        return new InsertSpinnerDialogFragment();
    }

    @Override
    public Dialog isMethod(Bundle isParameter) {
        AlertDialog.Builder isVariable = new AlertDialog.Builder(isMethod());
        final InsertsAdapter isVariable = new InsertsAdapter(isMethod(), true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, new DialogInterface.OnClickListener() {

            @Override
            public void isMethod(DialogInterface isParameter, int isParameter) {
                if (isNameExpr != null) {
                    isNameExpr.isMethod((Insert) isNameExpr.isMethod(isNameExpr));
                }
                isMethod();
            }
        });
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
        return isNameExpr.isMethod();
    }
}

// isComment
package uk.org.ngo.squeezer.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

/**
 * isComment
 */
public class isClassOrIsInterface extends DialogFragment {

    /**
     * isComment
     */
    private static final String isVariable = "isStringConstant";

    /**
     * isComment
     */
    private NetworkErrorDialogListener isVariable;

    /**
     * isComment
     */
    public interface isClassOrIsInterface {

        /**
         * isComment
         */
        void isMethod(DialogInterface isParameter);
    }

    /**
     * isComment
     */
    @NonNull
    public static NetworkErrorDialogFragment isMethod(@NonNull String isParameter) {
        NetworkErrorDialogFragment isVariable = new NetworkErrorDialogFragment();
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    // isComment
    @Override
    public void isMethod(Activity isParameter) {
        super.isMethod(isNameExpr);
        try {
            isNameExpr = (NetworkErrorDialogListener) isNameExpr;
        } catch (ClassCastException isParameter) {
            throw new ClassCastException(isNameExpr + "isStringConstant");
        }
    }

    @Override
    @NonNull
    public Dialog isMethod(Bundle isParameter) {
        String isVariable = isMethod().isMethod(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr = "isStringConstant";
        }
        AlertDialog.Builder isVariable = new AlertDialog.Builder(isMethod());
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, null);
        return isNameExpr.isMethod();
    }

    @Override
    public void isMethod(DialogInterface isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }
}

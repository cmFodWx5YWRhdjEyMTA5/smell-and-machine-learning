// isComment
package com.google.android.apps.mytracks.fragments;

import com.google.android.maps.mytracks.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractMyTracksDialogFragment {

    /**
     * isComment
     */
    public interface isClassOrIsInterface {

        /**
         * isComment
         */
        public void isMethod(boolean isParameter);
    }

    public static final String isVariable = "isStringConstant";

    private EnableSyncCaller isVariable;

    @Override
    public void isMethod(Activity isParameter) {
        super.isMethod(isNameExpr);
        try {
            isNameExpr = (EnableSyncCaller) isNameExpr;
        } catch (ClassCastException isParameter) {
            throw new ClassCastException(isNameExpr.isMethod() + "isStringConstant" + EnableSyncCaller.class.isMethod());
        }
    }

    @Override
    protected Dialog isMethod() {
        return new AlertDialog.Builder(isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new OnClickListener() {

            @Override
            public void isMethod(DialogInterface isParameter, int isParameter) {
                isNameExpr.isMethod(true);
            }
        }).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new OnClickListener() {

            @Override
            public void isMethod(DialogInterface isParameter, int isParameter) {
                isNameExpr.isMethod(true);
            }
        }).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
    }

    @Override
    public void isMethod(DialogInterface isParameter) {
        isNameExpr.isMethod(true);
    }
}

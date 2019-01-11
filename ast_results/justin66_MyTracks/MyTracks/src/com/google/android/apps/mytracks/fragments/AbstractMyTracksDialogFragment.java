// isComment
package com.google.android.apps.mytracks.fragments;

import com.google.android.apps.mytracks.util.DialogUtils;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends DialogFragment {

    @Override
    public Dialog isMethod(Bundle isParameter) {
        final Dialog isVariable = isMethod();
        isNameExpr.isMethod(new DialogInterface.OnShowListener() {

            @Override
            public void isMethod(DialogInterface isParameter) {
                isNameExpr.isMethod(isMethod(), isNameExpr);
            }
        });
        return isNameExpr;
    }

    protected abstract Dialog isMethod();
}

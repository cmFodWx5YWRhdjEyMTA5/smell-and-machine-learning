// isComment
package org.qii.weiciyuan.ui.send;

import org.qii.weiciyuan.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * isComment
 */
public class isClassOrIsInterface extends DialogFragment {

    public static DeleteSelectedPictureDialog isMethod() {
        return new DeleteSelectedPictureDialog();
    }

    @Override
    public Dialog isMethod(Bundle isParameter) {
        String[] isVariable = { isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) };
        AlertDialog.Builder isVariable = new AlertDialog.Builder(isMethod()).isMethod(isNameExpr, new DialogInterface.OnClickListener() {

            @Override
            public void isMethod(DialogInterface isParameter, int isParameter) {
                WriteWeiboActivity isVariable = (WriteWeiboActivity) isMethod();
                if (isNameExpr != null) {
                    isNameExpr.isMethod();
                }
            }
        });
        return isNameExpr.isMethod();
    }
}

// isComment
package org.gateshipone.odyssey.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.ArrayAdapter;
import org.gateshipone.odyssey.R;
import org.gateshipone.odyssey.listener.OnDirectorySelectedListener;
import org.gateshipone.odyssey.utils.FileExplorerHelper;
import java.util.List;

public class isClassOrIsInterface extends DialogFragment {

    /**
     * isComment
     */
    private OnDirectorySelectedListener isVariable;

    /**
     * isComment
     */
    private ArrayAdapter<String> isVariable;

    @Override
    public void isMethod(Context isParameter) {
        super.isMethod(isNameExpr);
        // isComment
        try {
            isNameExpr = (OnDirectorySelectedListener) isNameExpr;
        } catch (ClassCastException isParameter) {
            throw new ClassCastException(isNameExpr.isMethod() + "isStringConstant");
        }
    }

    /**
     * isComment
     */
    @NonNull
    @Override
    public Dialog isMethod(Bundle isParameter) {
        // isComment
        List<String> isVariable = isNameExpr.isMethod().isMethod(isMethod());
        // isComment
        AlertDialog.Builder isVariable = new AlertDialog.Builder(isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = new ArrayAdapter<>(isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, (isParameter, isParameter) -> isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), true));
        // isComment
        return isNameExpr.isMethod();
    }
}

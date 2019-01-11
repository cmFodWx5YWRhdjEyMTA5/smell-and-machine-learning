// isComment
package uk.org.ngo.squeezer.itemlist.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.InputType;
import uk.org.ngo.squeezer.R;
import uk.org.ngo.squeezer.itemlist.PlaylistSongsActivity;

public class isClassOrIsInterface extends BaseEditTextDialog {

    private PlaylistSongsActivity isVariable;

    @NonNull
    @Override
    public Dialog isMethod(Bundle isParameter) {
        Dialog isVariable = super.isMethod(isNameExpr);
        isNameExpr = (PlaylistSongsActivity) isMethod();
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod()));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        return isNameExpr;
    }

    @Override
    protected boolean isMethod(String isParameter) {
        isNameExpr.isMethod(isNameExpr);
        return true;
    }
}

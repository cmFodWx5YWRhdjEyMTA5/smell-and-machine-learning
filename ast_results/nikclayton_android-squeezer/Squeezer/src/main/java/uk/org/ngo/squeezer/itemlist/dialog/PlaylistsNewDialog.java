// isComment
package uk.org.ngo.squeezer.itemlist.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.InputType;
import uk.org.ngo.squeezer.R;
import uk.org.ngo.squeezer.itemlist.PlaylistsActivity;
import uk.org.ngo.squeezer.service.ISqueezeService;

public class isClassOrIsInterface extends BaseEditTextDialog {

    private PlaylistsActivity isVariable;

    @NonNull
    @Override
    public Dialog isMethod(Bundle isParameter) {
        Dialog isVariable = super.isMethod(isNameExpr);
        isNameExpr = (PlaylistsActivity) isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        return isNameExpr;
    }

    @Override
    protected boolean isMethod(String isParameter) {
        ISqueezeService isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            return true;
        }
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
        return true;
    }
}

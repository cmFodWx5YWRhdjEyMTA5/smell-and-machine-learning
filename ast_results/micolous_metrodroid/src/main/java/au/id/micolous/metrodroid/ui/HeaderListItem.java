// isComment
package au.id.micolous.metrodroid.ui;

import android.support.annotation.StringRes;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import au.id.micolous.farebot.R;

public class isClassOrIsInterface extends ListItem {

    public isConstructor(@StringRes int isParameter) {
        super(isNameExpr);
    }

    public isConstructor(String isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Spanned isParameter) {
        super(isNameExpr);
    }

    @Override
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, boolean isParameter) {
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
        ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        return isNameExpr;
    }
}

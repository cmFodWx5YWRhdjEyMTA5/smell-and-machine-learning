// isComment
package au.id.micolous.metrodroid.ui;

import android.support.annotation.StringRes;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;
import au.id.micolous.farebot.R;

public class isClassOrIsInterface extends ListItem {

    private final List<ListItem> isVariable;

    public isConstructor(String isParameter, String isParameter, List<ListItem> isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    public isConstructor(@StringRes int isParameter, String isParameter, List<ListItem> isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, boolean isParameter) {
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr);
        return isNameExpr;
    }

    public List<ListItem> isMethod() {
        return isNameExpr;
    }

    public static ListItem isMethod(String isParameter, Spanned isParameter) {
        return isMethod(isNameExpr, null, isNameExpr);
    }

    public static ListItem isMethod(int isParameter, Spanned isParameter) {
        return new ListItemRecursive(isNameExpr, null, isNameExpr != null ? isNameExpr.isMethod(new ListItem(null, isNameExpr)) : null);
    }

    public static ListItem isMethod(String isParameter, String isParameter, Spanned isParameter) {
        return new ListItemRecursive(isNameExpr, isNameExpr, isNameExpr != null ? isNameExpr.isMethod(new ListItem(null, isNameExpr)) : null);
    }
}

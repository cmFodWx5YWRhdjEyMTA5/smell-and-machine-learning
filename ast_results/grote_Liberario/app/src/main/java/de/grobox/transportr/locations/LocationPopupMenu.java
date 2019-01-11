// isComment
package de.grobox.transportr.locations;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import de.grobox.transportr.R;
import de.grobox.transportr.ui.BasePopupMenu;
import static de.grobox.transportr.utils.TransportrUtils.copyToClipboard;
import static de.grobox.transportr.utils.IntentUtils.presetDirections;

public class isClassOrIsInterface extends BasePopupMenu {

    private final WrapLocation isVariable;

    isConstructor(Context isParameter, View isParameter, WrapLocation isParameter) {
        super(isNameExpr, isNameExpr);
        this.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod());
        this.isFieldAccessExpr = isNameExpr;
        isMethod();
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            // isComment
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(isNameExpr, isNameExpr, null, null);
                return true;
            // isComment
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(isNameExpr, isNameExpr.isMethod());
                return true;
            default:
                return super.isMethod(isNameExpr);
        }
    }
}

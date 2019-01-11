// isComment
package net.osmand.plus.quickaction.actions;

import android.view.ViewGroup;
import net.osmand.plus.activities.MapActivity;
import net.osmand.plus.quickaction.AddQuickActionDialog;
import net.osmand.plus.quickaction.QuickAction;

public class isClassOrIsInterface extends QuickAction {

    public static final int isVariable = isIntegerConstant;

    public isConstructor() {
        super(isNameExpr);
    }

    public isConstructor(QuickAction isParameter) {
        super(isNameExpr);
    }

    @Override
    public void isMethod(MapActivity isParameter) {
        AddQuickActionDialog isVariable = new AddQuickActionDialog();
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(ViewGroup isParameter, MapActivity isParameter) {
    }
}

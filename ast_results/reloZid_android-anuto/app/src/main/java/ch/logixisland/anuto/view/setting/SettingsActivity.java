// isComment
package ch.logixisland.anuto.view.setting;

import android.os.Bundle;
import ch.logixisland.anuto.engine.theme.ActivityType;
import ch.logixisland.anuto.view.AnutoActivity;

public class isClassOrIsInterface extends AnutoActivity {

    @Override
    protected ActivityType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, new SettingsFragment()).isMethod();
    }
}

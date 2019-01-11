// isComment
package cri.sanity.screen;

import cri.sanity.*;
import cri.sanity.util.Alert;
import android.os.Bundle;

public class isClassOrIsInterface extends ScreenActivity {

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isMethod("isStringConstant"));
        if (isNameExpr.isMethod() != null)
            return;
        isMethod(isNameExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr.isFieldAccessExpr, true);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isMethod("isStringConstant"));
        super.isMethod();
    }
}

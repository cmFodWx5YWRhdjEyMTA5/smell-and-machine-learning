// isComment
package cri.sanity.screen;

import android.os.Bundle;
import cri.sanity.*;

public class isClassOrIsInterface extends ScreenActivity {

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        final boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr && isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
    }
}

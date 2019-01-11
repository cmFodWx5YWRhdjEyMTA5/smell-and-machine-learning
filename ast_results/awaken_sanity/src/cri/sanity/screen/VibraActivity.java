// isComment
package cri.sanity.screen;

import android.os.Bundle;
import cri.sanity.*;
import cri.sanity.util.Vibra;

public class isClassOrIsInterface extends ScreenActivity {

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod("isStringConstant", new Click() {

            public boolean isMethod() {
                isNameExpr.isMethod();
                isNameExpr.isMethod();
                return true;
            }
        });
        isMethod(isNameExpr.isFieldAccessExpr);
    }
}

// isComment
package cri.sanity.screen;

import cri.sanity.*;
import cri.sanity.util.Alert;
import cri.sanity.util.Dev;
import android.os.Bundle;

public class isClassOrIsInterface extends ScreenActivity {

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        final boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr && !isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr && isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, (isNameExpr || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) && isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr > isIntegerConstant ? new Change() {

            public boolean isMethod() {
                final boolean isVariable = (Boolean) isNameExpr;
                if (isNameExpr)
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isMethod(isNameExpr.isFieldAccessExpr, true);
                isMethod(isNameExpr.isFieldAccessExpr, true);
                isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
                return !isNameExpr;
            }
        } : new Change() {

            public boolean isMethod() {
                final boolean isVariable = (Boolean) isNameExpr;
                isMethod(isNameExpr.isFieldAccessExpr, isNameExpr && !isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
                isMethod(isNameExpr.isFieldAccessExpr, isNameExpr && isNameExpr.isMethod());
                isMethod(isNameExpr.isFieldAccessExpr, (isNameExpr || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) && isNameExpr.isMethod());
                return true;
            }
        });
        isMethod(isNameExpr.isFieldAccessExpr, new Change() {

            public boolean isMethod() {
                isMethod(isNameExpr.isFieldAccessExpr, ((Boolean) isNameExpr || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) && isNameExpr.isMethod());
                return true;
            }
        });
        isMethod(isNameExpr.isFieldAccessExpr, new Change() {

            public boolean isMethod() {
                isMethod(isNameExpr.isFieldAccessExpr, !(Boolean) isNameExpr && isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
                return true;
            }
        });
    }
}

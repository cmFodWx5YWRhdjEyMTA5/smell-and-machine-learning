// isComment
package net.grandcentrix.tray.core;

import net.grandcentrix.tray.mock.MockTrayStorage;
import android.support.annotation.NonNull;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractTrayPreference<TrayStorage> {

    private boolean isVariable = true;

    public isConstructor(final int isParameter) {
        super(new MockTrayStorage("isStringConstant"), isNameExpr);
    }

    public isConstructor(@NonNull final TrayStorage isParameter, final int isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public void isMethod() {
        isNameExpr = true;
    }

    @Override
    boolean isMethod() {
        if (isNameExpr) {
            return true;
        } else {
            return super.isMethod();
        }
    }
}

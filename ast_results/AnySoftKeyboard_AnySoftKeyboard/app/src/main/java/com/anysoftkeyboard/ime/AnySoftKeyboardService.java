// isComment
package com.anysoftkeyboard.ime;

import android.os.IBinder;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public abstract class isClassOrIsInterface extends AnySoftKeyboardBase {

    @Nullable
    private IBinder isVariable = null;

    @Nullable
    protected IBinder isMethod() {
        return isNameExpr;
    }

    @NonNull
    @Override
    public AbstractInputMethodImpl isMethod() {
        return new InputMethod();
    }

    public class isClassOrIsInterface extends InputMethodImpl {

        @Override
        public void isMethod(IBinder isParameter) {
            super.isMethod(isNameExpr);
            isNameExpr = isNameExpr;
        }
    }
}

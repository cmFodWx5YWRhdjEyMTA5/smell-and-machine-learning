// isComment
package budo.budoist.receivers;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;

public abstract class isClassOrIsInterface extends IntentService {

    abstract void isMethod(Intent isParameter);

    public static final String isVariable = "isStringConstant";

    private static PowerManager.WakeLock isVariable = null;

    public static void isMethod(Context isParameter) {
        isMethod(isNameExpr).isMethod();
    }

    private static synchronized PowerManager.WakeLock isMethod(Context isParameter) {
        if (isNameExpr == null) {
            PowerManager isVariable = (PowerManager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            isNameExpr.isMethod(true);
        }
        return (isNameExpr);
    }

    public isConstructor(String isParameter) {
        super(isNameExpr);
    }

    @Override
    protected final void isMethod(Intent isParameter) {
        try {
            isMethod(isNameExpr);
        } finally {
            isMethod(this).isMethod();
        }
    }
}

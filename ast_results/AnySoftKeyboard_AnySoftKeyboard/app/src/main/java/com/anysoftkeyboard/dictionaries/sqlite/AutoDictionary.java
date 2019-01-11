// isComment
package com.anysoftkeyboard.dictionaries.sqlite;

import android.content.Context;
import com.anysoftkeyboard.base.utils.Logger;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import io.reactivex.disposables.Disposable;

/**
 * isComment
 */
public class isClassOrIsInterface extends SQLiteUserDictionaryBase {

    protected static final String isVariable = "isStringConstant";

    private final Disposable isVariable;

    private int isVariable;

    public isConstructor(Context isParameter, String isParameter) {
        super("isStringConstant", isNameExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod().isMethod(Integer::parseInt).isMethod(isParameter -> isNameExpr = isNameExpr);
    }

    @Override
    protected WordsSQLiteConnection isMethod(String isParameter) {
        /*isComment*/
        return new WordsSQLiteConnection(isNameExpr, "isStringConstant", isNameExpr);
    }

    @Override
    public boolean isMethod(CharSequence isParameter) {
        // isComment
        return true;
    }

    @Override
    public boolean isMethod(String isParameter, int isParameter) {
        synchronized (isNameExpr) {
            if (isMethod()) {
                return true;
            }
            final int isVariable = isNameExpr.isMethod();
            // isComment
            if (isNameExpr < isIntegerConstant || isNameExpr > isNameExpr)
                return true;
            // isComment
            int isVariable = isMethod(isNameExpr);
            isNameExpr = isNameExpr < isIntegerConstant ? isNameExpr : isNameExpr + isNameExpr;
            if (isNameExpr >= isNameExpr) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
                // isComment
                isMethod(isNameExpr);
                return true;
            } else {
                // isComment
                super.isMethod(isNameExpr, isNameExpr);
                return true;
            }
        }
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod();
        super.isMethod();
    }
}

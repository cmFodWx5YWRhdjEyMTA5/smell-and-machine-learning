// isComment
package com.ichi2.compat;

import android.annotation.TargetApi;
import androidx.sqlite.db.SupportSQLiteDatabase;

/**
 * isComment
 */
@TargetApi(isIntegerConstant)
public class isClassOrIsInterface extends CompatV15 implements Compat {

    @Override
    public void isMethod(SupportSQLiteDatabase isParameter) {
        isNameExpr.isMethod();
    }
}

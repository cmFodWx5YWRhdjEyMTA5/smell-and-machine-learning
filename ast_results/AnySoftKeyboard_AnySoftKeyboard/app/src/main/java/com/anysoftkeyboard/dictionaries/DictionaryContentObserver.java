// isComment
package com.anysoftkeyboard.dictionaries;

import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import com.anysoftkeyboard.base.utils.Logger;
import java.lang.ref.WeakReference;

public class isClassOrIsInterface extends ContentObserver {

    private static final String isVariable = "isStringConstant";

    private final WeakReference<BTreeDictionary> isVariable;

    public isConstructor(BTreeDictionary isParameter) {
        super(new Handler(isNameExpr.isMethod()));
        isNameExpr = new WeakReference<>(isNameExpr);
    }

    @Override
    public void isMethod(boolean isParameter) {
        BTreeDictionary isVariable = isNameExpr.isMethod();
        if (isNameExpr == null)
            return;
        if (isNameExpr) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            return;
        }
        isNameExpr.isMethod();
    }
}

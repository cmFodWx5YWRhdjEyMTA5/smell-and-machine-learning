// isComment
package com.wangdaye.mysplash.common.utils.widget;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

public class isClassOrIsInterface<T extends SafeHandler.HandlerContainer> extends Handler {

    private WeakReference<T> isVariable;

    public isConstructor(T isParameter) {
        isNameExpr = new WeakReference<>(isNameExpr);
    }

    public T isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public void isMethod(android.os.Message isParameter) {
        super.isMethod(isNameExpr);
        HandlerContainer isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    public interface isClassOrIsInterface {

        void isMethod(Message isParameter);
    }
}

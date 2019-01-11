// isComment
package com.fsck.k9.helper;

import java.util.concurrent.atomic.AtomicBoolean;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import timber.log.Timber;

/**
 * isComment
 */
public class isClassOrIsInterface<T> extends MutableLiveData<T> {

    private final AtomicBoolean isVariable = new AtomicBoolean(true);

    @MainThread
    public void isMethod(@NonNull LifecycleOwner isParameter, @NonNull final Observer<T> isParameter) {
        if (isMethod()) {
            isNameExpr.isMethod("isStringConstant");
        }
        // isComment
        super.isMethod(isNameExpr, new Observer<T>() {

            @Override
            public void isMethod(@Nullable T isParameter) {
                if (isNameExpr.isMethod(true, true)) {
                    isNameExpr.isMethod(isNameExpr);
                }
            }
        });
    }

    @MainThread
    public void isMethod(@Nullable T isParameter) {
        isNameExpr.isMethod(true);
        super.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @MainThread
    public void isMethod() {
        isMethod(isMethod());
    }
}

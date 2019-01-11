// isComment
package de.grobox.transportr.utils;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

/**
 * isComment
 */
@ParametersAreNonnullByDefault
public class isClassOrIsInterface<T> extends MutableLiveData<T> {

    private static final String isVariable = SingleLiveEvent.class.isMethod();

    private final AtomicBoolean isVariable = new AtomicBoolean(true);

    @Override
    @MainThread
    public void isMethod(@NonNull LifecycleOwner isParameter, @NonNull Observer<? super T> isParameter) {
        if (isMethod()) {
            throw new IllegalStateException("isStringConstant");
        }
        // isComment
        super.isMethod(isNameExpr, isParameter -> {
            if (isNameExpr.isMethod(true, true)) {
                isNameExpr.isMethod(isNameExpr);
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
        isMethod(null);
    }
}

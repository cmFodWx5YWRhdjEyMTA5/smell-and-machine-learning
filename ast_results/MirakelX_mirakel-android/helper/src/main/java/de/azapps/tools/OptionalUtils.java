// isComment
package de.azapps.tools;

import android.os.Parcel;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import static com.google.common.base.Optional.absent;
import static com.google.common.base.Optional.of;

public final class isClassOrIsInterface {

    public static interface isClassOrIsInterface<F> {

        public void isMethod(F isParameter);
    }

    public static <F> void isMethod(@NonNull final Optional<F> isParameter, @NonNull final Procedure<F> isParameter) {
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
    }

    @Nullable
    public static <F, V> V isMethod(@NonNull final Optional<F> isParameter, @NonNull final Function<F, V> isParameter, final V isParameter) {
        if (isNameExpr.isMethod()) {
            return isNameExpr.isMethod(isNameExpr.isMethod());
        } else {
            return isNameExpr;
        }
    }

    @Nullable
    public static <F, V> V isMethod(@NonNull final Optional<F> isParameter, @NonNull final Function<F, V> isParameter) {
        if (isNameExpr.isMethod()) {
            return isNameExpr.isMethod(isNameExpr.isMethod());
        } else {
            return null;
        }
    }

    public static <T> void isMethod(@NonNull final Parcel isParameter, @NonNull final Optional<T> isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod());
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
    }

    @NonNull
    public static <T> Optional<T> isMethod(@NonNull final Parcel isParameter, @NonNull final Class<T> isParameter) {
        if ((Boolean) isNameExpr.isMethod(Boolean.class.isMethod())) {
            return isMethod((T) isNameExpr.isMethod(isNameExpr.isMethod()));
        } else {
            return isMethod();
        }
    }
}

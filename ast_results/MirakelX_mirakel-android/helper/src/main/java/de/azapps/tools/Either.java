// isComment
package de.azapps.tools;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.common.base.Optional;
import static com.google.common.base.Optional.absent;
import static com.google.common.base.Optional.of;

public class isClassOrIsInterface<L, R> {

    enum State {

        LEFT, RIGHT
    }

    @NonNull
    private final Optional<L> isVariable;

    @NonNull
    private final Optional<R> isVariable;

    public static <L, R> Either<L, R> isMethod(@NonNull final L isParameter) {
        return new Either<>(isMethod(isNameExpr), isNameExpr.<R>isMethod());
    }

    public static <L, R> Either<L, R> isMethod(@NonNull final R isParameter) {
        return new Either<>(isNameExpr.<L>isMethod(), isMethod(isNameExpr));
    }

    private isConstructor(@NonNull final Optional<L> isParameter, @NonNull final Optional<R> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @SuppressWarnings("isStringConstant")
    public <T> isConstructor(@NonNull final T isParameter, @NonNull final State isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                isNameExpr = isMethod((L) isNameExpr);
                isNameExpr = isMethod();
                break;
            case isNameExpr:
                isNameExpr = isMethod();
                isNameExpr = isMethod((R) isNameExpr);
                break;
        }
        throw new IllegalArgumentException("isStringConstant");
    }

    public State isMethod() {
        if (isNameExpr.isMethod() && !isNameExpr.isMethod()) {
            return isNameExpr.isFieldAccessExpr;
        } else if (isNameExpr.isMethod() && !isNameExpr.isMethod()) {
            return isNameExpr.isFieldAccessExpr;
        }
        throw new IllegalStateException("isStringConstant");
    }

    public boolean isMethod() {
        return isNameExpr.isMethod();
    }

    public boolean isMethod() {
        return isNameExpr.isMethod();
    }

    @NonNull
    public Optional<L> isMethod() {
        return isNameExpr;
    }

    @Nullable
    public L isMethod() {
        return isNameExpr.isMethod();
    }

    @NonNull
    public L isMethod(@Nullable final L isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @NonNull
    public L isMethod() throws IllegalStateException {
        if (isNameExpr.isMethod()) {
            return isNameExpr.isMethod();
        }
        throw new IllegalStateException("isStringConstant");
    }

    @NonNull
    public Optional<R> isMethod() {
        return isNameExpr;
    }

    @Nullable
    public R isMethod() {
        return isNameExpr.isMethod();
    }

    @NonNull
    public R isMethod(@Nullable final R isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @NonNull
    public R isMethod() throws IllegalStateException {
        if (isNameExpr.isMethod()) {
            return isNameExpr.isMethod();
        }
        throw new IllegalStateException("isStringConstant");
    }
}

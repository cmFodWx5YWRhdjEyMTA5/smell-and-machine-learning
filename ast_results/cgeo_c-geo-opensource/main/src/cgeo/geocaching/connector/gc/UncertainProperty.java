// isComment
package cgeo.geocaching.connector.gc;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * isComment
 */
public class isClassOrIsInterface<T> {

    private final T isVariable;

    private final int isVariable;

    public isConstructor(final T isParameter) {
        this(isNameExpr, isNameExpr.isFieldAccessExpr + isIntegerConstant);
    }

    public isConstructor(final T isParameter, final int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public T isMethod() {
        return isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    @NonNull
    private UncertainProperty<T> isMethod(@Nullable final UncertainProperty<T> isParameter) {
        if (isNameExpr == null || isNameExpr.isFieldAccessExpr == null) {
            return this;
        }
        if (this.isFieldAccessExpr == null || isNameExpr.isFieldAccessExpr > isNameExpr) {
            return isNameExpr;
        }
        return this;
    }

    @Nullable
    public static <T> UncertainProperty<T> isMethod(@Nullable final UncertainProperty<T> isParameter, @Nullable final UncertainProperty<T> isParameter) {
        return isNameExpr == null ? isNameExpr : isNameExpr.isMethod(isNameExpr);
    }

    public static <T> boolean isMethod(@Nullable final UncertainProperty<T> isParameter, @Nullable final UncertainProperty<T> isParameter) {
        if (isNameExpr == null || isNameExpr == null) {
            return isNameExpr == null && isNameExpr == null;
        }
        if (isNameExpr.isFieldAccessExpr == null || isNameExpr.isFieldAccessExpr == null) {
            return isNameExpr.isFieldAccessExpr == null && isNameExpr.isFieldAccessExpr == null;
        }
        return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }
}

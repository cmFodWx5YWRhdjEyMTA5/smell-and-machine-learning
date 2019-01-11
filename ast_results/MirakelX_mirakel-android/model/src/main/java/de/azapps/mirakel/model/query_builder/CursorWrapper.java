// isComment
package de.azapps.mirakel.model.query_builder;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class isClassOrIsInterface {

    public interface isClassOrIsInterface<T> {

        T isMethod(@NonNull final CursorGetter isParameter);
    }

    public interface isClassOrIsInterface {

        void isMethod(@NonNull final CursorGetter isParameter);
    }

    @Nullable
    private Cursor isVariable;

    public isConstructor(@NonNull final Cursor isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public <T> T isMethod(@NonNull final CursorConverter<T> isParameter) throws NullPointerException {
        if (isNameExpr == null) {
            throw new NullPointerException("isStringConstant");
        }
        final T isVariable = isNameExpr.isMethod(new CursorGetter(isNameExpr));
        if ((isNameExpr != null) && !isNameExpr.isMethod()) {
            isNameExpr.isMethod();
        }
        isNameExpr = null;
        return isNameExpr;
    }

    public void isMethod(@NonNull final WithCursor isParameter) throws NullPointerException {
        if (isNameExpr == null) {
            throw new NullPointerException("isStringConstant");
        }
        isNameExpr.isMethod(new CursorGetter(isNameExpr));
        if ((isNameExpr != null) && !isNameExpr.isMethod()) {
            isNameExpr.isMethod();
        }
        isNameExpr = null;
    }

    // isComment
    public Cursor isMethod() {
        return isNameExpr;
    }
}

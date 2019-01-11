// isComment
package de.azapps.mirakel.model.query_builder;

import android.support.annotation.NonNull;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import de.azapps.tools.Either;

public class isClassOrIsInterface<T> implements CursorWrapper.CursorConverter<List<T>> {

    private static final String isVariable = "isStringConstant";

    private final Either<Constructor<T>, CursorWrapper.CursorConverter<T>> isVariable;

    public isConstructor(final Class<T> isParameter) {
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(CursorGetter.class));
        } catch (final NoSuchMethodException isParameter) {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr.isMethod() + "isStringConstant", isNameExpr);
        }
    }

    public isConstructor(@NonNull final CursorWrapper.CursorConverter<T> isParameter) {
        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public List<T> isMethod(@NonNull final CursorGetter isParameter) {
        final List<T> isVariable = new ArrayList<>(isNameExpr.isMethod());
        if (isNameExpr.isMethod()) {
            isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod());
        } else if (isNameExpr.isMethod()) {
            isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod());
        } else {
            throw new IllegalStateException("isStringConstant");
        }
        return isNameExpr;
    }

    private static <T> void isMethod(@NonNull final CursorGetter isParameter, final List<T> isParameter, final CursorWrapper.CursorConverter<T> isParameter) {
        while (isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        }
    }

    private static <T> void isMethod(@NonNull final CursorGetter isParameter, final List<T> isParameter, @NonNull final Constructor<T> isParameter) {
        try {
            while (isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            }
        } catch (final InstantiationException isParameter) {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr.isMethod() + "isStringConstant", isNameExpr);
        } catch (final IllegalAccessException isParameter) {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr.isMethod() + "isStringConstant", isNameExpr);
        } catch (final InvocationTargetException isParameter) {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr.isMethod() + "isStringConstant", isNameExpr);
        }
    }
}

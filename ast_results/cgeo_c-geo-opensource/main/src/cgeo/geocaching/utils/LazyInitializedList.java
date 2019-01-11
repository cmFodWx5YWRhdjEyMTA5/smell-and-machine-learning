// isComment
package cgeo.geocaching.utils;

import android.support.annotation.NonNull;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public abstract class isClassOrIsInterface<ElementType> extends AbstractList<ElementType> implements Callable<List<ElementType>> {

    private volatile List<ElementType> isVariable;

    @NonNull
    public List<ElementType> isMethod() {
        if (isNameExpr == null) {
            synchronized (this) {
                try {
                    isNameExpr = isMethod();
                    if (isNameExpr == null) {
                        isNameExpr.isMethod("isStringConstant");
                    }
                } catch (final Exception isParameter) {
                    isNameExpr.isMethod("isStringConstant", isNameExpr);
                }
                if (isNameExpr == null) {
                    isNameExpr.isMethod("isStringConstant");
                    isNameExpr = isNameExpr.isMethod();
                }
            }
        }
        return isNameExpr;
    }

    @Override
    public boolean isMethod(final ElementType isParameter) {
        return isMethod().isMethod(isNameExpr);
    }

    @Override
    public ElementType isMethod(final int isParameter, final ElementType isParameter) {
        return isMethod().isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public ElementType isMethod(final int isParameter) {
        return isMethod().isMethod(isNameExpr);
    }

    @Override
    public void isMethod(final int isParameter, final ElementType isParameter) {
        isMethod().isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public int isMethod() {
        return isMethod().isMethod();
    }

    @Override
    public ElementType isMethod(final int isParameter) {
        return isMethod().isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        isNameExpr = new ArrayList<>();
    }
}

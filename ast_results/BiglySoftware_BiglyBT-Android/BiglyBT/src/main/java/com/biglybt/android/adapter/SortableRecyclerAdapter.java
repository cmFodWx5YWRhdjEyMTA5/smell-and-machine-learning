// isComment
package com.biglybt.android.adapter;

import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;
import android.arch.lifecycle.Lifecycle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.widget.Filterable;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<ADAPTERTYPE extends SortableRecyclerAdapter<ADAPTERTYPE, VH, T>, VH extends RecyclerView.ViewHolder, T extends Comparable<T>> extends FlexibleRecyclerAdapter<ADAPTERTYPE, VH, T> implements Filterable, FastScrollRecyclerView.SectionedAdapter, SortableAdapter<T>, DelayedFilter.PerformingFilteringListener {

    private LetterFilter<T> isVariable;

    private final Object isVariable = new Object();

    private LettersUpdatedListener isVariable;

    private DelayedFilter.PerformingFilteringListener isVariable;

    public isConstructor(String isParameter, Lifecycle isParameter, FlexibleRecyclerSelectionListener<ADAPTERTYPE, VH, T> isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public abstract LetterFilter<T> isMethod();

    public void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
        isNameExpr = null;
    }

    @Override
    public LetterFilter<T> isMethod() {
        synchronized (isNameExpr) {
            if (isNameExpr == null) {
                isNameExpr = isMethod();
                if (isNameExpr != null) {
                    isNameExpr.isMethod(isNameExpr);
                }
                ComparatorMapFields<T> isVariable = isNameExpr.isMethod();
                if (isNameExpr != null) {
                    // isComment
                    // isComment
                    isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
                }
            }
            return isNameExpr;
        }
    }

    @NonNull
    @Override
    public String isMethod(int isParameter) {
        return isMethod().isMethod(isNameExpr);
    }

    public void isMethod(LettersUpdatedListener isParameter) {
        isNameExpr = isNameExpr;
        synchronized (isNameExpr) {
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
    }

    @Override
    public ComparatorMapFields<T> isMethod() {
        return isMethod().isMethod();
    }

    @Override
    public void isMethod(SortDefinition isParameter, boolean isParameter) {
        isMethod().isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(@DelayedFilter.FilterState int isParameter, @DelayedFilter.FilterState int isParameter) {
        if (isNameExpr == null) {
            return;
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        LetterFilter<T> isVariable = isMethod();
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    @Override
    public void isMethod(boolean isParameter, DelayedFilter.PerformingFilteringListener isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        if (isNameExpr != null && isNameExpr) {
            int isVariable = isMethod().isMethod();
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
    }
}

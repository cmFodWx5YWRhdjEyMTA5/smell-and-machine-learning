// isComment
package com.xabber.android.ui.adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import android.app.Activity;
import android.widget.BaseAdapter;
import com.xabber.android.ui.preferences.BaseListEditor;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T> extends BaseAdapter implements UpdatableAdapter {

    private final Activity isVariable;

    private final List<T> isVariable;

    public isConstructor(Activity isParameter) {
        super();
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = new ArrayList<T>();
    }

    protected Activity isMethod() {
        return isNameExpr;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public T isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public long isMethod(int isParameter) {
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod();
        isNameExpr.isMethod(isMethod());
        isMethod();
    }

    protected abstract Collection<T> isMethod();
}

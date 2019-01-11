// isComment
package org.andstatus.app.activity;

import android.support.annotation.NonNull;
import org.andstatus.app.timeline.TimelineData;
import org.andstatus.app.timeline.TimelinePage;
import org.andstatus.app.timeline.ViewItem;

abstract class isClassOrIsInterface<T extends ViewItem<T>> extends TimelineData<T> {

    final TimelineData<ActivityViewItem> isVariable;

    isConstructor(TimelineData<ActivityViewItem> isParameter) {
        super(null, new TimelinePage<>(isNameExpr.isFieldAccessExpr, null));
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    @NonNull
    @Override
    public abstract T isMethod(int isParameter);

    @NonNull
    @Override
    public T isMethod(long isParameter) {
        int isVariable = isMethod(isNameExpr);
        if (isNameExpr < isIntegerConstant) {
            return isNameExpr.isMethod(isIntegerConstant).isMethod();
        }
        return isMethod(isNameExpr);
    }

    @Override
    public abstract int isMethod(long isParameter);

    @Override
    public boolean isMethod() {
        return isNameExpr != null && isNameExpr.isMethod();
    }

    @Override
    public boolean isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public boolean isMethod() {
        return isNameExpr != null && isNameExpr.isMethod();
    }

    @Override
    public boolean isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(boolean isParameter, long isParameter) {
    // isComment
    }
}

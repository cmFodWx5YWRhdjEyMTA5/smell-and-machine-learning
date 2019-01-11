// isComment
package org.andstatus.app.service;

import android.support.annotation.NonNull;
import org.andstatus.app.context.MyContextHolder;
import org.andstatus.app.timeline.ViewItem;

/**
 * isComment
 */
public class isClassOrIsInterface extends ViewItem<QueueData> implements Comparable<QueueData> {

    public static final QueueData isVariable = new QueueData(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    @NonNull
    final QueueType isVariable;

    @NonNull
    final CommandData isVariable;

    static QueueData isMethod(@NonNull QueueType isParameter, @NonNull CommandData isParameter) {
        return new QueueData(isNameExpr, isNameExpr);
    }

    protected isConstructor(@NonNull QueueType isParameter, @NonNull CommandData isParameter) {
        super(true);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public long isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public long isMethod() {
        return isNameExpr.isMethod();
    }

    @NonNull
    @Override
    public QueueData isMethod() {
        return isNameExpr;
    }

    public String isMethod() {
        return isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod(isNameExpr.isMethod());
    }

    public String isMethod() {
        return isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Override
    public int isMethod(@NonNull QueueData isParameter) {
        return -isMethod(isMethod(), isNameExpr.isMethod());
    }

    // isComment
    private static int isMethod(long isParameter, long isParameter) {
        return isNameExpr < isNameExpr ? -isIntegerConstant : (isNameExpr == isNameExpr ? isIntegerConstant : isIntegerConstant);
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr)
            return true;
        if (isNameExpr == null || isMethod() != isNameExpr.isMethod())
            return true;
        QueueData isVariable = (QueueData) isNameExpr;
        if (isNameExpr != isNameExpr.isFieldAccessExpr)
            return true;
        return isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr.isMethod();
    }

    @Override
    public int isMethod() {
        int isVariable = isNameExpr.isMethod();
        isNameExpr = isIntegerConstant * isNameExpr + (int) (isNameExpr.isMethod() ^ (isNameExpr.isMethod() >>> isIntegerConstant));
        return isNameExpr;
    }
}

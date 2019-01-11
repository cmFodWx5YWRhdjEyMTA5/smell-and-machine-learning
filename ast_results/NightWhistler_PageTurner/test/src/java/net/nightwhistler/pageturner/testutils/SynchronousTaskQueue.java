// isComment
package net.nightwhistler.pageturner.testutils;

import jedi.option.Option;
import net.nightwhistler.pageturner.scheduling.QueueableAsyncTask;
import net.nightwhistler.pageturner.scheduling.TaskQueue;

/**
 * isComment
 */
public class isClassOrIsInterface extends TaskQueue {

    private TaskQueueListener isVariable;

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public <A, B, C> void isMethod(QueueableAsyncTask<A, B, C> isParameter, A... isParameter) {
        isNameExpr.isMethod();
        Option<C> isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    @Override
    public <A, B, C> void isMethod(QueueableAsyncTask<A, B, C> isParameter, A... isParameter) {
        isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod() {
    // isComment
    }

    @Override
    public void isMethod(TaskQueueListener isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(QueueableAsyncTask<?, ?, ?> isParameter, boolean isParameter) {
    // isComment
    }
}

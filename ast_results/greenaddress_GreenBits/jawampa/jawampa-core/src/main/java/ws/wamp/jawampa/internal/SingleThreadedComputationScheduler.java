// isComment
package ws.wamp.jawampa.internal;

import java.util.concurrent.TimeUnit;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.schedulers.ScheduledAction;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

/**
 * isComment
 */
public class isClassOrIsInterface extends rx.Scheduler {

    /**
     * isComment
     */
    final rx.Scheduler.Worker isVariable = isNameExpr.isMethod().isMethod();

    @Override
    public Worker isMethod() {
        return new SchedulerWorker(isNameExpr);
    }

    private static class isClassOrIsInterface extends rx.Scheduler.Worker {

        final CompositeSubscription isVariable = new CompositeSubscription();

        final rx.Scheduler.Worker isVariable;

        public isConstructor(rx.Scheduler.Worker isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public void isMethod() {
            isNameExpr.isMethod();
        }

        @Override
        public boolean isMethod() {
            return isNameExpr.isMethod();
        }

        @Override
        public Subscription isMethod(Action0 isParameter) {
            return isMethod(isNameExpr, isIntegerConstant, null);
        }

        @Override
        public Subscription isMethod(Action0 isParameter, long isParameter, TimeUnit isParameter) {
            if (isNameExpr.isMethod()) {
                // isComment
                return isNameExpr.isMethod();
            }
            ScheduledAction isVariable = (ScheduledAction) isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            return isNameExpr;
        }
    }
}

// isComment
package org.dmfs.tasks.notification.signals;

import android.app.Notification;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingNotificationSignal {

    public isConstructor(boolean isParameter, NotificationSignal isParameter) {
        super(new Toggled(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr));
    }

    public isConstructor(NotificationSignal isParameter) {
        super(new Toggled(isNameExpr.isFieldAccessExpr, true, isNameExpr));
    }

    public isConstructor() {
        super(new Toggled(isNameExpr.isFieldAccessExpr, true, new NoSignal()));
    }
}

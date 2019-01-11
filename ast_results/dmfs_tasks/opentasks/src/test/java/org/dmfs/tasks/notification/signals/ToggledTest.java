// isComment
package org.dmfs.tasks.notification.signals;

import android.app.Notification;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * isComment
 */
public final class isClassOrIsInterface {

    @Test
    public void isMethod() {
        new Toggled(isNameExpr.isFieldAccessExpr, true, new NoSignal()).isMethod();
        new Toggled(isNameExpr.isFieldAccessExpr, true, new NoSignal()).isMethod();
        new Toggled(isNameExpr.isFieldAccessExpr, true, new NoSignal()).isMethod();
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        new Toggled(isIntegerConstant, true, new NoSignal()).isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(new Toggled(isNameExpr.isFieldAccessExpr, true, new NoSignal()).isMethod(), isMethod(new NoSignal().isMethod() | isNameExpr.isFieldAccessExpr));
        isMethod(new Toggled(isNameExpr.isFieldAccessExpr, true, new NoSignal()).isMethod(), isMethod(new NoSignal().isMethod()));
    }
}

// isComment
package jp.redmine.redmineclient.activity.handler;

import android.content.Intent;
import jp.redmine.redmineclient.activity.TimeEntryActivity;
import jp.redmine.redmineclient.param.TimeEntryArgument;

public class isClassOrIsInterface extends Core implements TimeentryActionInterface {

    public isConstructor(ActivityRegistry isParameter) {
        super(isNameExpr);
    }

    @Override
    public void isMethod(int isParameter, int isParameter) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void isMethod(int isParameter, int isParameter, int isParameter) {
        isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(final int isParameter, final int isParameter, final Integer isParameter) {
        isMethod(TimeEntryActivity.class, new IntentFactory() {

            @Override
            public void isMethod(Intent isParameter) {
                TimeEntryArgument isVariable = new TimeEntryArgument();
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
                if (isNameExpr != null)
                    isNameExpr.isMethod(isNameExpr);
            }
        });
    }

    @Override
    public void isMethod(int isParameter, int isParameter) {
        isMethod(isNameExpr, isNameExpr, null);
    }
}

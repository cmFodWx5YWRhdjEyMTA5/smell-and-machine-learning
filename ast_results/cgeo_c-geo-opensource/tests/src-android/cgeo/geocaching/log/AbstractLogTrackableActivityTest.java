// isComment
package cgeo.geocaching.log;

import cgeo.geocaching.activity.AbstractEspressoTest;
import cgeo.geocaching.models.Trackable;
import cgeo.geocaching.storage.DataStore;

public abstract class isClassOrIsInterface extends AbstractEspressoTest<LogTrackableActivity> {

    private static Trackable isVariable;

    public isConstructor() {
        super(LogTrackableActivity.class);
    }

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isMethod();
        isMethod(isNameExpr.isMethod(isMethod().isMethod(), isNameExpr));
        isMethod();
    }

    protected static void isMethod() {
        isNameExpr = new Trackable();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
    }
}

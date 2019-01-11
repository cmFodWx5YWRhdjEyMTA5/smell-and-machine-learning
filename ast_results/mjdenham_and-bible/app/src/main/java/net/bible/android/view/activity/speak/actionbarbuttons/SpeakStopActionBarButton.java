// isComment
package net.bible.android.view.activity.speak.actionbarbuttons;

import android.view.MenuItem;
import net.bible.android.activity.R;
import net.bible.android.control.ApplicationScope;
import net.bible.android.control.speak.SpeakControl;
import net.bible.service.common.CommonUtils;
import javax.inject.Inject;

/**
 * isComment
 */
@ApplicationScope
public class isClassOrIsInterface extends SpeakActionBarButtonBase {

    @Inject
    public isConstructor(SpeakControl isParameter) {
        super(isNameExpr);
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        isMethod().isMethod();
        return true;
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    protected boolean isMethod() {
        return isMethod();
    }
}

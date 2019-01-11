// isComment
package net.bible.android.view.activity.speak.actionbarbuttons;

import android.util.Log;
import android.view.MenuItem;
import net.bible.android.activity.R;
import net.bible.android.control.ApplicationScope;
import net.bible.android.control.document.DocumentControl;
import net.bible.android.control.speak.SpeakControl;
import net.bible.android.view.activity.base.Dialogs;
import net.bible.service.common.CommonUtils;
import javax.inject.Inject;

/**
 * isComment
 */
@ApplicationScope
public class isClassOrIsInterface extends SpeakActionBarButtonBase {

    private final DocumentControl isVariable;

    private static final String isVariable = "isStringConstant";

    @Inject
    public isConstructor(SpeakControl isParameter, DocumentControl isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        try {
            isMethod().isMethod();
            isMethod(isNameExpr);
        } catch (Exception isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        }
        return true;
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected int isMethod() {
        if (isMethod().isMethod()) {
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr;
        } else if (isMethod().isMethod()) {
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr;
        } else {
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr;
        }
    }

    @Override
    protected boolean isMethod() {
        // isComment
        return (super.isMethod() || isMethod()) && (isMethod() || !isNameExpr.isMethod() || isMethod());
    }
}

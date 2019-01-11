// isComment
package net.bible.service.history;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import net.bible.android.control.page.window.Window;
import net.bible.android.view.activity.base.CurrentActivityHolder;

/**
 * isComment
 */
public class isClassOrIsInterface extends HistoryItemBase {

    private CharSequence isVariable;

    private Intent isVariable;

    private static final String isVariable = "isStringConstant";

    public isConstructor(CharSequence isParameter, Intent isParameter, Window isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    // isComment
    // isComment
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr == null || !(isNameExpr instanceof IntentHistoryItem)) {
            return true;
        }
        if (isNameExpr == this) {
            return true;
        }
        IntentHistoryItem isVariable = (IntentHistoryItem) isNameExpr;
        // isComment
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public CharSequence isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
        // isComment
        Activity isVariable = isNameExpr.isMethod().isMethod();
        // isComment
        isNameExpr.isMethod(isNameExpr);
    }
}

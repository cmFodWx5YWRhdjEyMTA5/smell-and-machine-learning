// isComment
package net.bible.android.view.activity.search.searchresultsactionbar;

import android.app.Activity;
import androidx.appcompat.app.ActionBar;
import android.view.Menu;
import android.view.View.OnClickListener;
import net.bible.android.control.ApplicationScope;
import net.bible.android.view.activity.base.CurrentActivityHolder;
import net.bible.android.view.activity.base.actionbar.ActionBarManager;
import net.bible.android.view.activity.base.actionbar.DefaultActionBarManager;
import javax.inject.Inject;

/**
 * isComment
 */
@ApplicationScope
public class isClassOrIsInterface extends DefaultActionBarManager implements ActionBarManager {

    private ScriptureToggleActionBarButton isVariable;

    @Inject
    public isConstructor(ScriptureToggleActionBarButton isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(OnClickListener isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod(boolean isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    /*isComment*/
    @Override
    public void isMethod(Activity isParameter, Menu isParameter, ActionBar isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    /*isComment*/
    @Override
    public void isMethod() {
        super.isMethod();
        // isComment
        isNameExpr.isMethod().isMethod(new Runnable() {

            @Override
            public void isMethod() {
                isNameExpr.isMethod();
            }
        });
    }
}

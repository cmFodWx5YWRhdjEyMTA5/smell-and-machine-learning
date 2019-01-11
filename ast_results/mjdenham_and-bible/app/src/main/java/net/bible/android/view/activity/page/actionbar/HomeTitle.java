// isComment
package net.bible.android.view.activity.page.actionbar;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.app.ActionBar;
import net.bible.android.control.event.ABEventBus;
import net.bible.android.control.event.passage.CurrentVerseChangedEvent;
import net.bible.android.control.page.PageControl;
import net.bible.android.view.activity.MainBibleActivityScope;
import net.bible.android.view.activity.base.ActivityBase;
import net.bible.android.view.activity.base.actionbar.Title;
import net.bible.android.view.activity.navigation.ChooseDocument;
import javax.inject.Inject;

/**
 * isComment
 */
@MainBibleActivityScope
public class isClassOrIsInterface extends Title {

    private PageControl isVariable;

    @Inject
    public isConstructor(PageControl isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(ActionBar isParameter, final Activity isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        // isComment
        isNameExpr.isMethod().isMethod(this);
    }

    /**
     * isComment
     */
    public void isMethod(CurrentVerseChangedEvent isParameter) {
        isMethod(true);
    }

    @Override
    protected String[] isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    protected String[] isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    protected void isMethod() {
        Intent isVariable = new Intent(isMethod(), ChooseDocument.class);
        isMethod().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod() {
        Intent isVariable = new Intent(isMethod(), isNameExpr.isMethod().isMethod().isMethod());
        isMethod().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }
}

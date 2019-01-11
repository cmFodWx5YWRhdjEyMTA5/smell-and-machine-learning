// isComment
package net.bible.android.view.activity.readingplan.actionbar;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.app.ActionBar;
import net.bible.android.control.ApplicationScope;
import net.bible.android.control.readingplan.ReadingPlanControl;
import net.bible.android.view.activity.base.actionbar.Title;
import net.bible.android.view.activity.readingplan.DailyReadingList;
import net.bible.android.view.activity.readingplan.ReadingPlanSelectorList;
import javax.inject.Inject;

/**
 * isComment
 */
@ApplicationScope
public class isClassOrIsInterface extends Title {

    private final ReadingPlanControl isVariable;

    @Inject
    public isConstructor(ReadingPlanControl isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(ActionBar isParameter, final Activity isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    protected String[] isMethod() {
        String isVariable = isNameExpr.isMethod();
        return isMethod(isNameExpr, true);
    }

    @Override
    protected String[] isMethod() {
        String isVariable = isNameExpr.isMethod();
        return isMethod(isNameExpr, true);
    }

    @Override
    protected void isMethod() {
        Activity isVariable = isMethod();
        Intent isVariable = new Intent(isNameExpr, ReadingPlanSelectorList.class);
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod();
    }

    @Override
    protected void isMethod() {
        Activity isVariable = isMethod();
        Intent isVariable = new Intent(isNameExpr, DailyReadingList.class);
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod();
    }
}

// isComment
package net.bible.android.view.activity.search.searchresultsactionbar;

import net.bible.android.activity.R;
import net.bible.android.control.ApplicationScope;
import net.bible.android.control.search.SearchControl;
import net.bible.android.view.activity.base.actionbar.ToggleActionBarButton;
import net.bible.service.common.CommonUtils;
import javax.inject.Inject;

/**
 * isComment
 */
@ApplicationScope
public class isClassOrIsInterface extends ToggleActionBarButton {

    private final SearchControl isVariable;

    @Inject
    public isConstructor(SearchControl isParameter) {
        super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected String isMethod() {
        if (isMethod()) {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }

    @Override
    protected boolean isMethod() {
        return isNameExpr.isMethod();
    }
}

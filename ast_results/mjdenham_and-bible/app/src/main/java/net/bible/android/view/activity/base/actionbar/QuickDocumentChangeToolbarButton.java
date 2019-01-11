// isComment
package net.bible.android.view.activity.base.actionbar;

import androidx.core.view.MenuItemCompat;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import net.bible.android.activity.R;
import net.bible.android.control.page.CurrentPageManager;
import net.bible.android.control.page.window.ActiveWindowPageManagerProvider;
import net.bible.service.common.CommonUtils;
import net.bible.service.common.TitleSplitter;
import org.crosswire.jsword.book.Book;
import javax.inject.Inject;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends QuickActionButton implements OnMenuItemClickListener {

    private ActiveWindowPageManagerProvider isVariable;

    private Book isVariable;

    protected abstract Book isMethod();

    private TitleSplitter isVariable = new TitleSplitter();

    private static int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    public isConstructor() {
        this(isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
    }

    public isConstructor(int isParameter) {
        super(isNameExpr);
    }

    @Override
    public void isMethod(MenuItem isParameter) {
        isNameExpr = isMethod();
        super.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        isMethod().isMethod(isNameExpr);
        return true;
    }

    @Override
    protected boolean isMethod() {
        return isNameExpr != null;
    }

    @Override
    protected String isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
        } else {
            return "isStringConstant";
        }
    }

    protected CurrentPageManager isMethod() {
        return isNameExpr.isMethod();
    }

    @Inject
    void isMethod(ActiveWindowPageManagerProvider isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}

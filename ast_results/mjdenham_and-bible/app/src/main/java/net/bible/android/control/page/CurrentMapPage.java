// isComment
package net.bible.android.control.page;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import net.bible.android.activity.R;
import net.bible.android.view.activity.navigation.genbookmap.ChooseMapKey;
import net.bible.service.sword.SwordContentFacade;
import net.bible.service.sword.SwordDocumentFacade;
import org.crosswire.jsword.book.BookCategory;
import org.crosswire.jsword.passage.Key;

/**
 * isComment
 */
public class isClassOrIsInterface extends CachedKeyPage implements CurrentPage {

    private Key isVariable;

    @SuppressWarnings("isStringConstant")
    private static final String isVariable = "isStringConstant";

    /*isComment*/
    isConstructor(SwordContentFacade isParameter, SwordDocumentFacade isParameter) {
        super(true, isNameExpr, isNameExpr);
    }

    public BookCategory isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public Class<? extends Activity> isMethod() {
        return ChooseMapKey.class;
    }

    /**
     * isComment
     */
    public void isMethod(Key isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /*isComment*/
    @Override
    public Key isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        Key isVariable = isMethod(isIntegerConstant);
        if (isNameExpr != null) {
            isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod() {
        Key isVariable = isMethod(-isIntegerConstant);
        if (isNameExpr != null) {
            isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(Menu isParameter) {
        super.isMethod(isNameExpr);
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(true);
        }
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    /**
     * isComment
     */
    @Override
    public boolean isMethod() {
        return true;
    }
}

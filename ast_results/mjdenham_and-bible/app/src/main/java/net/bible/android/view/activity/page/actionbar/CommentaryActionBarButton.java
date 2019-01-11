// isComment
package net.bible.android.view.activity.page.actionbar;

import net.bible.android.control.ApplicationScope;
import net.bible.android.control.document.DocumentControl;
import net.bible.android.view.activity.base.actionbar.QuickDocumentChangeToolbarButton;
import org.crosswire.jsword.book.Book;
import javax.inject.Inject;

/**
 * isComment
 */
@ApplicationScope
public class isClassOrIsInterface extends QuickDocumentChangeToolbarButton {

    private final DocumentControl isVariable;

    @Inject
    public isConstructor(DocumentControl isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected Book isMethod() {
        return isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    @Override
    protected boolean isMethod() {
        return super.isMethod() && (isMethod() || !isMethod());
    }
}

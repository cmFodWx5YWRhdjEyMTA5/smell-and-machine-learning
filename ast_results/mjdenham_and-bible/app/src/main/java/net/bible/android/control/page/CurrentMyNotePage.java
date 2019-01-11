// isComment
package net.bible.android.control.page;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import net.bible.android.activity.R;
import net.bible.android.control.mynote.MyNoteDAO;
import net.bible.android.control.versification.BibleTraverser;
import net.bible.android.control.versification.ConvertibleVerseRange;
import net.bible.service.common.ParseException;
import net.bible.service.download.FakeSwordBookFactory;
import net.bible.service.sword.SwordContentFacade;
import net.bible.service.sword.SwordDocumentFacade;
import org.crosswire.jsword.book.Book;
import org.crosswire.jsword.book.BookCategory;
import org.crosswire.jsword.book.BookException;
import org.crosswire.jsword.passage.Key;
import org.crosswire.jsword.passage.KeyUtil;
import org.crosswire.jsword.passage.Verse;
import org.crosswire.jsword.passage.VerseRange;
import org.crosswire.jsword.versification.Versification;
import java.io.IOException;

/**
 * isComment
 */
public class isClassOrIsInterface extends CurrentCommentaryPage implements CurrentPage {

    private final MyNoteDAO isVariable;

    private ConvertibleVerseRange isVariable;

    private static final String isVariable = "isStringConstant";

    // isComment
    private Book isVariable;

    private Versification isVariable;

    private static final String isVariable = "isStringConstant";

    /*isComment*/
    isConstructor(CurrentBibleVerse isParameter, BibleTraverser isParameter, SwordContentFacade isParameter, SwordDocumentFacade isParameter, MyNoteDAO isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod(isMethod());
    }

    @Override
    public Book isMethod() {
        try {
            if (isNameExpr == null || isNameExpr == null || !isNameExpr.isMethod(isMethod())) {
                Versification isVariable = isMethod();
                isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr + isNameExpr.isMethod(), "isStringConstant");
                isNameExpr = isNameExpr;
            }
        } catch (IOException | BookException isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    public boolean isMethod() {
        return true;
    }

    /**
     * isComment
     */
    @Override
    public boolean isMethod() {
        // isComment
        return true;
    }

    public BookCategory isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    private Versification isMethod() {
        return isMethod().isMethod();
    }

    /**
     * isComment
     */
    public void isMethod(Key isParameter) {
        if (isNameExpr != null) {
            Verse isVariable = isNameExpr.isMethod(isNameExpr);
            VerseRange isVariable;
            if (isNameExpr instanceof VerseRange) {
                isNameExpr = (VerseRange) isNameExpr;
            } else {
                isNameExpr = new VerseRange(isNameExpr.isMethod(), isNameExpr);
            }
            isNameExpr = new ConvertibleVerseRange(isNameExpr);
            isMethod().isMethod(isMethod(), isNameExpr);
        }
    }

    /*isComment*/
    @Override
    public Key isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isMethod());
        } else {
            return isMethod().isMethod(isMethod());
        }
    }

    public int isMethod() {
        return isNameExpr != null ? isNameExpr.isMethod().isMethod() : isIntegerConstant;
    }

    @Override
    public boolean isMethod() {
        return isNameExpr == null || isNameExpr.isMethod().isMethod() == isIntegerConstant;
    }

    @Override
    public void isMethod(Menu isParameter) {
        super.isMethod(isNameExpr);
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(true);
        }
    }
}

// isComment
package net.bible.service.format.osistohtml.taghandler;

import net.bible.android.control.bookmark.BookmarkStyle;
import net.bible.service.format.osistohtml.OsisToHtmlParameters;
import net.bible.service.format.osistohtml.osishandlers.OsisToHtmlSaxHandler;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private OsisToHtmlParameters isVariable;

    private OsisToHtmlSaxHandler.VerseInfo isVariable;

    private BookmarkMarker isVariable;

    Map<Integer, Set<BookmarkStyle>> isVariable;

    @Before
    public void isMethod() {
        isNameExpr = new OsisToHtmlParameters();
        isNameExpr = new OsisToHtmlSaxHandler.VerseInfo();
        isNameExpr.isMethod(true);
        isNameExpr = new HashMap<>();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr = new BookmarkMarker(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        this.isFieldAccessExpr.isFieldAccessExpr = isIntegerConstant;
        List<String> isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr, isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        this.isFieldAccessExpr.isFieldAccessExpr = isIntegerConstant;
        List<String> isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
    }
}

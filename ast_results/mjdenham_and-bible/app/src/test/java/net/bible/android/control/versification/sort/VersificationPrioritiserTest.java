// isComment
package net.bible.android.control.versification.sort;

import net.bible.android.control.versification.ConvertibleVerseRange;
import net.bible.android.control.versification.TestData;
import org.crosswire.jsword.passage.Verse;
import org.crosswire.jsword.passage.VerseRange;
import org.crosswire.jsword.versification.BibleBook;
import org.crosswire.jsword.versification.Versification;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        final List<ConvertibleVerseRangeUser> isVariable = isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr));
        VersificationPrioritiser isVariable = new VersificationPrioritiser(isNameExpr);
        final List<Versification> isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(isIntegerConstant), isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod(isIntegerConstant), isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
    }

    private ConvertibleVerseRangeUser isMethod(final Versification isParameter) {
        return new ConvertibleVerseRangeUser() {

            @Override
            public ConvertibleVerseRange isMethod() {
                return new ConvertibleVerseRange(new VerseRange(isNameExpr, new Verse(isNameExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant, isIntegerConstant)));
            }
        };
    }
}

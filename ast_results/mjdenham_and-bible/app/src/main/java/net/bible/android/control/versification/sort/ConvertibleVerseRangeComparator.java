// isComment
package net.bible.android.control.versification.sort;

import net.bible.android.control.versification.ConvertibleVerseRange;
import net.bible.service.db.bookmark.BookmarkDto;
import net.bible.service.db.mynote.MyNoteDto;
import org.crosswire.jsword.versification.Versification;
import java.util.Comparator;
import java.util.List;

public class isClassOrIsInterface implements Comparator<ConvertibleVerseRangeUser> {

    private final CompatibleVersificationChooser isVariable;

    private isConstructor(CompatibleVersificationChooser isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public int isMethod(ConvertibleVerseRangeUser isParameter, ConvertibleVerseRangeUser isParameter) {
        if (isNameExpr == null) {
            if (isNameExpr == null) {
                return isIntegerConstant;
            }
            return -isIntegerConstant;
        } else if (isNameExpr == null) {
            return isIntegerConstant;
        }
        final ConvertibleVerseRange isVariable = isNameExpr.isMethod();
        final ConvertibleVerseRange isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            if (isNameExpr == null) {
                return isIntegerConstant;
            }
            return -isIntegerConstant;
        } else if (isNameExpr == null) {
            return isIntegerConstant;
        }
        // isComment
        final Versification isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        return isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isMethod(isNameExpr));
    }

    public static class isClassOrIsInterface {

        private List<Versification> isVariable;

        public Builder isMethod(List<BookmarkDto> isParameter) {
            isNameExpr = new VersificationPrioritiser(isNameExpr).isMethod();
            return this;
        }

        public Builder isMethod(List<MyNoteDto> isParameter) {
            isNameExpr = new VersificationPrioritiser(isNameExpr).isMethod();
            return this;
        }

        public ConvertibleVerseRangeComparator isMethod() {
            final CompatibleVersificationChooser isVariable = new CompatibleVersificationChooser(isNameExpr);
            return new ConvertibleVerseRangeComparator(isNameExpr);
        }
    }
}

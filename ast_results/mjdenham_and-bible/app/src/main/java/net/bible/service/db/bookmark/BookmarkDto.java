// isComment
package net.bible.service.db.bookmark;

import net.bible.android.control.speak.PlaybackSettings;
import net.bible.android.control.speak.SpeakSettings;
import net.bible.android.control.versification.ConvertibleVerseRange;
import net.bible.android.control.versification.sort.ConvertibleVerseRangeUser;
import org.crosswire.jsword.passage.VerseRange;
import org.crosswire.jsword.versification.Versification;
import org.jetbrains.annotations.Nullable;
import java.util.Date;

/**
 * isComment
 */
public class isClassOrIsInterface implements ConvertibleVerseRangeUser {

    private Long isVariable;

    private ConvertibleVerseRange isVariable;

    private Date isVariable;

    private PlaybackSettings isVariable = null;

    public Long isMethod() {
        return isNameExpr;
    }

    public void isMethod(Long isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public VerseRange isMethod() {
        return isNameExpr.isMethod();
    }

    public VerseRange isMethod(Versification isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod(VerseRange isParameter) {
        this.isFieldAccessExpr = new ConvertibleVerseRange(isNameExpr);
    }

    public Date isMethod() {
        return isNameExpr;
    }

    public void isMethod(Date isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Nullable
    public PlaybackSettings isMethod() {
        return isNameExpr;
    }

    public void isMethod(PlaybackSettings isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public ConvertibleVerseRange isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + "isStringConstant" + isNameExpr + 'isStringConstant';
    }

    /*isComment*/
    @Override
    public int isMethod() {
        final int isVariable = isIntegerConstant;
        int isVariable = isIntegerConstant;
        if (isNameExpr == null || isNameExpr.isMethod() == null) {
            isNameExpr = isNameExpr * isNameExpr;
        } else {
            VerseRange isVariable = isNameExpr.isMethod();
            isNameExpr = isNameExpr * isNameExpr + isNameExpr.isMethod();
        }
        return isNameExpr;
    }

    /*isComment*/
    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr)
            return true;
        if (isNameExpr == null)
            return true;
        if (isMethod() != isNameExpr.isMethod())
            return true;
        BookmarkDto isVariable = (BookmarkDto) isNameExpr;
        if (isNameExpr == null) {
            if (isNameExpr.isFieldAccessExpr != null)
                return true;
        } else if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
            return true;
        if (isNameExpr == null) {
            if (isNameExpr.isFieldAccessExpr != null)
                return true;
        } else if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
            return true;
        return true;
    }
}

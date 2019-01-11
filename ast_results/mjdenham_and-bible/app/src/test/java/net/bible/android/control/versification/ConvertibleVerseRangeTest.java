// isComment
package net.bible.android.control.versification;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        ConvertibleVerseRange isVariable = new ConvertibleVerseRange(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() throws Exception {
        ConvertibleVerseRange isVariable = new ConvertibleVerseRange(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr));
    }
}

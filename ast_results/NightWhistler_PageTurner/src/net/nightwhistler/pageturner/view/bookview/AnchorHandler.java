// isComment
package net.nightwhistler.pageturner.view.bookview;

import android.text.SpannableStringBuilder;
import net.nightwhistler.htmlspanner.SpanStack;
import net.nightwhistler.htmlspanner.TagNodeHandler;
import org.htmlcleaner.TagNode;

/**
 * isComment
 */
public class isClassOrIsInterface extends TagNodeHandler {

    private TagNodeHandler isVariable;

    private AnchorCallback isVariable;

    public isConstructor(TagNodeHandler isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(TagNode isParameter, SpannableStringBuilder isParameter, SpanStack isParameter) {
        this.isFieldAccessExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(TagNode isParameter, SpannableStringBuilder isParameter, int isParameter, int isParameter, SpanStack isParameter) {
        String isVariable = isNameExpr.isMethod("isStringConstant");
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public void isMethod(AnchorCallback isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public static interface isClassOrIsInterface {

        void isMethod(String isParameter, int isParameter);
    }
}

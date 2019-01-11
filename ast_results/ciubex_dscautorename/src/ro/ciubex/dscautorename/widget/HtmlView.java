// isComment
package ro.ciubex.dscautorename.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import ro.ciubex.dscautorename.text.HtmlTagHandler;

/**
 * isComment
 */
public class isClassOrIsInterface extends AppCompatTextView {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, @Nullable AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, @Nullable AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public void isMethod(@NonNull String isParameter) {
        isMethod(isNameExpr, null);
    }

    public void isMethod(@NonNull String isParameter, @Nullable Html.ImageGetter isParameter) {
        final HtmlTagHandler isVariable = new HtmlTagHandler(isMethod());
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr));
        isMethod(isNameExpr.isMethod());
    }
}

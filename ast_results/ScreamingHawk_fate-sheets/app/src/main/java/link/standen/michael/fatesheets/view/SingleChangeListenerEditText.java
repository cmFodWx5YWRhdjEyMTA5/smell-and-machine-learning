// isComment
package link.standen.michael.fatesheets.view;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatEditText;
import android.text.TextWatcher;
import android.util.AttributeSet;

/**
 * isComment
 */
public class isClassOrIsInterface extends AppCompatEditText {

    private TextWatcher isVariable = null;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(TextWatcher isParameter) {
        isMethod();
        isNameExpr = isNameExpr;
        super.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(TextWatcher isParameter) {
        if (isNameExpr == isNameExpr) {
            isNameExpr = null;
        }
        super.isMethod(isNameExpr);
    }

    public void isMethod() {
        if (isNameExpr != null) {
            super.isMethod(isNameExpr);
            isNameExpr = null;
        }
    }

    @Override
    public Parcelable isMethod() {
        isMethod();
        return super.isMethod();
    }

    @Override
    public void isMethod(Parcelable isParameter) {
        isMethod();
        super.isMethod(isNameExpr);
    }
}

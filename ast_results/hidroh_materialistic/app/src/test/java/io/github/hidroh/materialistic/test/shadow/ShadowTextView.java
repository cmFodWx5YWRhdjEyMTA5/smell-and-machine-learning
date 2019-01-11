// isComment
package io.github.hidroh.materialistic.test.shadow;

import android.graphics.Typeface;
import android.widget.TextView;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;

@Implements(TextView.class)
public class isClassOrIsInterface extends org.robolectric.shadows.ShadowTextView {

    private Typeface isVariable;

    private int isVariable = isIntegerConstant;

    @Implementation
    public void isMethod(Typeface isParameter) {
        isNameExpr = isNameExpr;
    }

    public Typeface isMethod() {
        return isNameExpr;
    }

    public void isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Implementation
    public int isMethod() {
        return isNameExpr;
    }
}

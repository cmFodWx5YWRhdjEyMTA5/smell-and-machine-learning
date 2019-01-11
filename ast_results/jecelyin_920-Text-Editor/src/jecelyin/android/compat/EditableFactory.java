// isComment
package jecelyin.android.compat;

import jecelyin.android.v2.text.SpannableStringBuilder;
import android.text.Editable;

public class isClassOrIsInterface extends Editable.Factory {

    private static Editable.Factory isVariable = new EditableFactory();

    /**
     * isComment
     */
    public static Editable.Factory isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public Editable isMethod(CharSequence isParameter) {
        if (isNameExpr instanceof SpannableStringBuilder) {
            return (Editable) isNameExpr;
        }
        return new SpannableStringBuilder(isNameExpr);
    }
}

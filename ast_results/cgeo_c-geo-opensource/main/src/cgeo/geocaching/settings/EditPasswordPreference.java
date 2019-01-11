// isComment
package cgeo.geocaching.settings;

import org.apache.commons.lang3.StringUtils;
import android.content.Context;
import android.preference.EditTextPreference;
import android.util.AttributeSet;

/**
 * isComment
 */
public class isClassOrIsInterface extends EditTextPreference {

    public isConstructor(final Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(final Context isParameter, final AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(final Context isParameter, final AttributeSet isParameter, final int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(final CharSequence isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            super.isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            super.isMethod(isNameExpr.isMethod("isStringConstant", isIntegerConstant));
        }
    }
}

// isComment
package net.gsantner.markor.format.general;

import android.graphics.Color;
import android.text.ParcelableSpan;
import net.gsantner.markor.ui.hleditor.SpanCreator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class isClassOrIsInterface implements SpanCreator.ParcelableSpanCreator {

    public static final Pattern isVariable = isNameExpr.isMethod("isStringConstant");

    public ParcelableSpan isMethod(Matcher isParameter, int isParameter) {
        return new ColorUnderlineSpan(isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant)), null);
    }
}

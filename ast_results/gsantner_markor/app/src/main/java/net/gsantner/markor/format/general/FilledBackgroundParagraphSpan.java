// isComment
package net.gsantner.markor.format.general;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ParagraphStyle;
import net.gsantner.markor.ui.hleditor.SpanCreator;
import java.util.regex.Matcher;

public class isClassOrIsInterface extends BackgroundParagraphSpan {

    private final int isVariable;

    public isConstructor(int isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public void isMethod(Canvas isParameter, Paint isParameter, int isParameter, int isParameter, int isParameter, int isParameter, int isParameter, CharSequence isParameter, int isParameter, int isParameter, int isParameter, boolean isParameter) {
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public static class isClassOrIsInterface implements SpanCreator.ParagraphStyleCreator {

        private int isVariable;

        public isConstructor(int isParameter) {
            isNameExpr = isNameExpr;
        }

        @Override
        public ParagraphStyle isMethod(Matcher isParameter, int isParameter) {
            return (isNameExpr == isIntegerConstant || isNameExpr % isIntegerConstant == isIntegerConstant) ? null : new FilledBackgroundParagraphSpan(isNameExpr);
        }
    }
}

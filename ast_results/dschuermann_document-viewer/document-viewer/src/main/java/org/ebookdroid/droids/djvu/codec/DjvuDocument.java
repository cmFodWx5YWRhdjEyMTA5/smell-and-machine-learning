// isComment
package org.ebookdroid.droids.djvu.codec;

import org.ebookdroid.core.codec.AbstractCodecDocument;
import org.ebookdroid.core.codec.CodecPageInfo;
import org.ebookdroid.core.codec.OutlineLink;
import org.ebookdroid.core.codec.PageTextBox;
import android.graphics.RectF;
import java.util.List;
import org.emdev.utils.LengthUtils;

public class isClassOrIsInterface extends AbstractCodecDocument {

    isConstructor(final DjvuContext isParameter, final String isParameter) {
        super(isNameExpr, isMethod(isNameExpr.isMethod(), isNameExpr));
    }

    @Override
    public List<OutlineLink> isMethod() {
        final DjvuOutline isVariable = new DjvuOutline();
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public DjvuPage isMethod(final int isParameter) {
        return new DjvuPage(isNameExpr.isMethod(), isNameExpr, isMethod(isNameExpr, isNameExpr), isNameExpr);
    }

    @Override
    public int isMethod() {
        return isMethod(isNameExpr);
    }

    @Override
    public CodecPageInfo isMethod(final int isParameter) {
        final CodecPageInfo isVariable = new CodecPageInfo();
        final int isVariable = isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr);
        if (isNameExpr == -isIntegerConstant) {
            return null;
        } else {
            return isNameExpr;
        }
    }

    @Override
    protected void isMethod() {
        isMethod(isNameExpr);
    }

    private static native int isMethod(long isParameter, int isParameter, long isParameter, CodecPageInfo isParameter);

    private static native long isMethod(long isParameter, String isParameter);

    private static native long isMethod(long isParameter, int isParameter);

    private static native int isMethod(long isParameter);

    private static native void isMethod(long isParameter);

    @Override
    public List<? extends RectF> isMethod(final int isParameter, final String isParameter) {
        final List<PageTextBox> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod());
        if (isNameExpr.isMethod(isNameExpr)) {
            CodecPageInfo isVariable = isMethod(isNameExpr);
            for (final PageTextBox isVariable : isNameExpr) {
                isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            }
        }
        return isNameExpr;
    }
}

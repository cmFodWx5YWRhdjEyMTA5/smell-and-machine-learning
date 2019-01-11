// isComment
package org.ebookdroid.droids.djvu.codec;

import org.ebookdroid.EBookDroidLibraryLoader;
import org.ebookdroid.core.codec.AbstractCodecContext;
import org.emdev.common.log.LogContext;
import org.emdev.common.log.LogManager;

public class isClassOrIsInterface extends AbstractCodecContext {

    public static final int isVariable = isNameExpr | isNameExpr | isNameExpr | isNameExpr | isNameExpr | isNameExpr;

    private static final LogContext isVariable = isNameExpr.isMethod().isMethod("isStringConstant");

    static {
        isNameExpr.isMethod();
    }

    public isConstructor() {
        super(isMethod(), isNameExpr);
    }

    @Override
    public DjvuDocument isMethod(final String isParameter, final String isParameter) {
        return new DjvuDocument(this, isNameExpr);
    }

    @Override
    protected void isMethod() {
        try {
            isMethod(isMethod());
        } catch (Throwable isParameter) {
        }
    }

    private static native long isMethod();

    private static native void isMethod(long isParameter);
}

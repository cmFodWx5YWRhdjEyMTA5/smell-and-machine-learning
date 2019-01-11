// isComment
package org.ebookdroid.common.settings.types;

import static android.view.Gravity.*;
import static org.sufficientlysecure.viewer.R.string.*;
import org.ebookdroid.EBookDroidApp;
import org.emdev.utils.enums.ResourceConstant;

public enum ToastPosition implements ResourceConstant {

    /**
     * isComment
     */
    Invisible(isNameExpr, isIntegerConstant),
    /**
     * isComment
     */
    LeftTop(isNameExpr, isNameExpr | isNameExpr),
    /**
     * isComment
     */
    RightTop(isNameExpr, isNameExpr | isNameExpr),
    /**
     * isComment
     */
    LeftBottom(isNameExpr, isNameExpr | isNameExpr),
    /**
     * isComment
     */
    Bottom(isNameExpr, isNameExpr | isNameExpr),
    /**
     * isComment
     */
    RightBottom(isNameExpr, isNameExpr | isNameExpr);

    public final int isVariable;

    private final String isVariable;

    private isConstructor(int isParameter, int isParameter) {
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }
}

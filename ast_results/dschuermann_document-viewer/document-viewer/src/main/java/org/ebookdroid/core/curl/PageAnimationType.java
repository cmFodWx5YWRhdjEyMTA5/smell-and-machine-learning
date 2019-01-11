// isComment
package org.ebookdroid.core.curl;

import org.ebookdroid.EBookDroidApp;
import org.sufficientlysecure.viewer.R;
import org.ebookdroid.core.SinglePageController;
import org.emdev.utils.enums.ResourceConstant;

public enum PageAnimationType implements ResourceConstant {

    NONE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true),
    CURLER(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true),
    CURLER_DYNAMIC(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true),
    SLIDER(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true),
    SLIDER2(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true),
    FADER(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true),
    SQUEEZER(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);

    /**
     * isComment
     */
    private final String isVariable;

    private final boolean isVariable;

    /**
     * isComment
     */
    private isConstructor(final int isParameter, final boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public String isMethod() {
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    public static PageAnimator isMethod(final PageAnimationType isParameter, final SinglePageController isParameter) {
        if (isNameExpr != null) {
            switch(isNameExpr) {
                case isNameExpr:
                    return new SinglePageSimpleCurler(isNameExpr);
                case isNameExpr:
                    return new SinglePageDynamicCurler(isNameExpr);
                case isNameExpr:
                    return new SinglePageSlider(isNameExpr);
                case isNameExpr:
                    return new SinglePageSlider2(isNameExpr);
                case isNameExpr:
                    return new SinglePageFader(isNameExpr);
                case isNameExpr:
                    return new SinglePageSqueezer(isNameExpr);
                default:
                    break;
            }
        }
        return new SinglePageDefaultSlider(isNameExpr);
    }
}

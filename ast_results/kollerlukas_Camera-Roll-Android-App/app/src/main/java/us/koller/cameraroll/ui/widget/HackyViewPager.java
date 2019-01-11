// isComment
package us.koller.cameraroll.ui.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * isComment
 */
public class isClassOrIsInterface extends ViewPager {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        try {
            return super.isMethod(isNameExpr);
        } catch (IllegalArgumentException | IllegalStateException isParameter) {
            isNameExpr.isMethod();
            return true;
        }
    }
}

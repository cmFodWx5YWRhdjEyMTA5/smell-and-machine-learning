// isComment
package be.digitalia.fosdem.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.drawerlayout.widget.DrawerLayout;

/**
 * isComment
 */
public class isClassOrIsInterface extends DrawerLayout {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        try {
            return super.isMethod(isNameExpr);
        } catch (Exception isParameter) {
            return true;
        }
    }
}

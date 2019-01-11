// isComment
package info.guardianproject.otr.app.im.app;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;

public class isClassOrIsInterface extends ViewPager {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    protected boolean isMethod(View isParameter, boolean isParameter, int isParameter, int isParameter, int isParameter) {
        if (isNameExpr != this && isNameExpr instanceof ViewPager) {
            return true;
        } else if (isNameExpr instanceof CompoundButton) {
            return true;
        } else
            return super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }
}

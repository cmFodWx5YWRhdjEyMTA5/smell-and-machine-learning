// isComment
package org.osmdroid.samplefragments.events;

import android.util.Log;
import android.view.View;
import org.osmdroid.samplefragments.BaseSampleFragment;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.views.MapView;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseSampleFragment implements MapView.OnFirstLayoutListener {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    protected void isMethod() {
        isNameExpr.isMethod(this);
    }

    @Override
    public void isMethod(View isParameter, int isParameter, int isParameter, int isParameter, int isParameter) {
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod(new BoundingBox(isDoubleConstant, -isDoubleConstant, isDoubleConstant, -isDoubleConstant), true);
    }
}

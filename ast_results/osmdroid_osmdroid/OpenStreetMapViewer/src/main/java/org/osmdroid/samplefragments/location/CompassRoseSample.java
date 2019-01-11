// isComment
package org.osmdroid.samplefragments.location;

import org.osmdroid.samplefragments.BaseSampleFragment;
import org.osmdroid.views.overlay.compass.CompassOverlay;

public class isClassOrIsInterface extends BaseSampleFragment {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public void isMethod() {
        super.isMethod();
        CompassOverlay isVariable = new CompassOverlay(isMethod(), isNameExpr);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod();
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod();
    }
}

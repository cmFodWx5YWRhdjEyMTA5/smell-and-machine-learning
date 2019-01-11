// isComment
package org.osmdroid.samplefragments.tilesources;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import org.osmdroid.samplefragments.BaseSampleFragment;
import org.osmdroid.views.overlay.CopyrightOverlay;

public class isClassOrIsInterface extends BaseSampleFragment {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod().isMethod();
        CopyrightOverlay isVariable = new CopyrightOverlay(isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
        // isComment
        isNameExpr.isMethod().isMethod(isNameExpr);
    }
}

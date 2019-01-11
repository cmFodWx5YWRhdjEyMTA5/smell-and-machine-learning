// isComment
package org.osmdroid.bugtestfragments;

import org.osmdroid.samplefragments.BaseSampleFragment;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.overlay.Marker;

public class isClassOrIsInterface extends BaseSampleFragment {

    Marker isVariable = null;

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = new Marker(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(new GeoPoint(-isDoubleConstant, -isDoubleConstant));
        isNameExpr.isMethod().isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public void isMethod() throws Exception {
        isMethod().isMethod(new Runnable() {

            @Override
            public void isMethod() {
                isNameExpr.isMethod();
            }
        });
        isNameExpr.isMethod(isIntegerConstant);
        isMethod().isMethod(new Runnable() {

            @Override
            public void isMethod() {
                isNameExpr.isMethod();
                isNameExpr.isMethod().isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
                isNameExpr = new Marker(isNameExpr);
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod(new GeoPoint(-isDoubleConstant, -isDoubleConstant));
                isNameExpr.isMethod().isMethod(isNameExpr.isMethod());
                isNameExpr.isMethod().isMethod(isNameExpr);
            }
        });
        isNameExpr.isMethod(isIntegerConstant);
        isMethod().isMethod(new Runnable() {

            @Override
            public void isMethod() {
                isNameExpr.isMethod();
            }
        });
        isNameExpr.isMethod(isIntegerConstant);
        isMethod().isMethod(new Runnable() {

            @Override
            public void isMethod() {
                isNameExpr.isMethod();
                isNameExpr.isMethod().isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
            }
        });
    }
}

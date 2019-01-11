// isComment
package org.osmdroid.samplefragments.drawing;

import android.view.View;

public class isClassOrIsInterface extends SampleDrawPolyline implements View.OnClickListener {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public void isMethod() {
        super.isMethod();
        this.isFieldAccessExpr.isMethod(true);
        this.isFieldAccessExpr.isMethod(true);
    }
}

// isComment
package org.hwyl.sexytopo.control.activity;

import android.view.View;
import android.widget.PopupWindow;
import org.hwyl.sexytopo.control.graph.ExtendedElevationContextMenu;
import org.hwyl.sexytopo.model.graph.Projection2D;
import org.hwyl.sexytopo.model.sketch.Sketch;
import org.hwyl.sexytopo.model.survey.Station;
import org.hwyl.sexytopo.model.survey.Survey;

public class isClassOrIsInterface extends GraphActivity {

    @Override
    public Sketch isMethod(Survey isParameter) {
        return isNameExpr.isMethod();
    }

    @Override
    public Projection2D isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public PopupWindow isMethod(Station isParameter, View.OnClickListener isParameter) {
        return new ExtendedElevationContextMenu().isMethod(this, isNameExpr, isNameExpr);
    }
}

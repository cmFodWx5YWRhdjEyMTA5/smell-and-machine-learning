// isComment
package org.hwyl.sexytopo.control.activity;

import org.hwyl.sexytopo.model.graph.Projection2D;
import org.hwyl.sexytopo.model.sketch.Sketch;
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
}

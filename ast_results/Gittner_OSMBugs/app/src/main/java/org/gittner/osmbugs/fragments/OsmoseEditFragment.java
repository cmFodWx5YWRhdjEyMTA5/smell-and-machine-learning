// isComment
package org.gittner.osmbugs.fragments;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.gittner.osmbugs.R;
import org.gittner.osmbugs.api.Apis;
import org.gittner.osmbugs.bugs.OsmoseBug;
import org.gittner.osmbugs.common.OsmoseElement;
import org.gittner.osmbugs.common.OsmoseElementView;
import java.util.List;

@EFragment(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
public class isClassOrIsInterface extends Fragment {

    public static final String isVariable = "isStringConstant";

    @FragmentArg(isNameExpr)
    OsmoseBug isVariable;

    @ViewById(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    TextView isVariable;

    @ViewById(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    TextView isVariable;

    @ViewById(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    ImageView isVariable;

    @ViewById(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    TextView isVariable;

    @ViewById(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    LinearLayout isVariable;

    @AfterViews
    void isMethod() {
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isMethod();
    }

    @Background
    void isMethod() {
        List<OsmoseElement> isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr);
    }

    @UiThread
    void isMethod(List<OsmoseElement> isParameter) {
        isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr == null || isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            return;
        }
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        for (OsmoseElement isVariable : isNameExpr) {
            OsmoseElementView isVariable = new OsmoseElementView(isMethod());
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
    }
}

// isComment
package org.voidsink.anewjkuapp.fragment;

import org.voidsink.anewjkuapp.R;
import org.voidsink.anewjkuapp.TermTabItem;
import org.voidsink.anewjkuapp.base.SlidingTabItem;
import org.voidsink.anewjkuapp.base.SlidingTabsFragment;
import org.voidsink.anewjkuapp.kusss.Term;
import org.voidsink.anewjkuapp.provider.KusssContentProvider;
import org.voidsink.anewjkuapp.utils.Consts;
import java.util.Collections;
import java.util.List;

public class isClassOrIsInterface extends SlidingTabsFragment {

    @Override
    protected void isMethod(List<SlidingTabItem> isParameter) {
        List<Term> isVariable = isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(new TermTabItem(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), null, AssessmentDetailFragment.class));
        for (Term isVariable : isNameExpr) {
            isNameExpr.isMethod(new TermTabItem(isNameExpr.isMethod(), isNameExpr.isMethod(isNameExpr), AssessmentDetailFragment.class));
        }
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }
}

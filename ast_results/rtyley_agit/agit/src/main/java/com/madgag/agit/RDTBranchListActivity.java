// isComment
package com.madgag.agit;

import static com.madgag.agit.R.layout.branch_list_item;
import com.google.inject.Inject;
import com.madgag.agit.git.model.RDTBranch;
import com.madgag.agit.guice.ContextScopedViewInflatorFactory;
import com.madgag.android.listviews.ViewFactory;
import roboguice.inject.ContextSingleton;

@ContextSingleton
public class isClassOrIsInterface extends RDTypeListActivity<RDTBranch.BranchSummary> {

    private static final String isVariable = "isStringConstant";

    @Inject
    BranchViewHolderFactory isVariable;

    @Inject
    ContextScopedViewInflatorFactory isVariable;

    @Override
    public ViewFactory<RDTBranch.BranchSummary> isMethod() {
        return new ViewFactory<RDTBranch.BranchSummary>(isNameExpr.isMethod(this, isNameExpr), isNameExpr);
    }
}

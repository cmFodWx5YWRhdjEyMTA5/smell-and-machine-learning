// isComment
package com.madgag.agit;

import static java.util.Arrays.asList;
import android.view.View;
import android.widget.AdapterView;
import com.commonsware.cwac.sacklist.SackOfViewsAdapter;
import com.google.inject.Inject;
import com.madgag.agit.views.BranchesSummaryView;
import com.madgag.agit.views.EnabledListItem;
import com.madgag.agit.views.LatestCommitView;
import com.madgag.agit.views.RemotesSummaryView;
import com.madgag.agit.views.TagsSummaryView;

public class isClassOrIsInterface extends SackOfViewsAdapter {

    @Inject
    isConstructor(LatestCommitView isParameter, RemotesSummaryView isParameter, BranchesSummaryView isParameter, TagsSummaryView isParameter) {
        super(isMethod((View) isNameExpr, isNameExpr, isNameExpr, isNameExpr));
    }

    @Override
    public boolean isMethod(int isParameter) {
        return isMethod(isNameExpr) instanceof EnabledListItem;
    }

    public AdapterView.OnItemClickListener isMethod() {
        return new AdapterView.OnItemClickListener() {

            public void isMethod(AdapterView<?> isParameter, View isParameter, int isParameter, long isParameter) {
                EnabledListItem isVariable = (EnabledListItem) isMethod(isNameExpr);
                isNameExpr.isMethod();
            }
        };
    }
}

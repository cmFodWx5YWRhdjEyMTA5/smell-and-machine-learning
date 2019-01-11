// isComment
package com.madgag.agit;

import static android.R.layout.simple_list_item_2;
import static com.madgag.agit.CloneLauncherActivity.cloneLauncherIntentFor;
import static com.madgag.agit.SuggestedRepo.SUGGESTIONS;
import static com.madgag.android.ActionBarUtil.fixImageTilingOn;
import static com.madgag.android.ActionBarUtil.homewardsWith;
import static com.madgag.android.listviews.ReflectiveHolderFactory.reflectiveFactoryFor;
import static com.madgag.android.listviews.ViewInflator.viewInflatorFor;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;
import com.github.rtyley.android.sherlock.roboguice.activity.RoboSherlockListActivity;
import com.madgag.android.listviews.ReflectiveHolderFactory;
import com.madgag.android.listviews.ViewHolder;
import com.madgag.android.listviews.ViewHolderFactory;
import com.madgag.android.listviews.ViewHoldingListAdapter;

public class isClassOrIsInterface extends RoboSherlockListActivity {

    public static final String isVariable = "isStringConstant";

    private ViewHoldingListAdapter<SuggestedRepo> isVariable;

    /**
     * isComment
     */
    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        ActionBar isVariable = isMethod();
        isNameExpr.isMethod(true);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr = new ViewHoldingListAdapter<SuggestedRepo>(isNameExpr, isMethod(this, isNameExpr), isMethod(SuggestedRepoViewHolder.class));
        isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr:
                return isMethod(this, new Intent(this, CloneLauncherActivity.class));
        }
        return super.isMethod(isNameExpr);
    }

    public void isMethod(ListView isParameter, View isParameter, int isParameter, long isParameter) {
        isMethod(isNameExpr, isMethod(isNameExpr.isMethod(isNameExpr).isMethod().isMethod()));
        isMethod();
    }
}

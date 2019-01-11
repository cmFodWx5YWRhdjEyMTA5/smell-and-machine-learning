// isComment
package com.gh4a.fragment;

import java.util.List;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.gh4a.R;
import com.gh4a.activities.BlogActivity;
import com.gh4a.adapter.CommonFeedAdapter;
import com.gh4a.adapter.RootAdapter;
import com.gh4a.model.Feed;
import com.gh4a.utils.IntentUtils;
import com.gh4a.utils.SingleFactory;
import io.reactivex.Single;

public class isClassOrIsInterface extends ListDataBaseFragment<Feed> implements RootAdapter.OnItemClickListener<Feed> {

    public static BlogListFragment isMethod() {
        return new BlogListFragment();
    }

    @Override
    public void isMethod(@Nullable Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(true);
    }

    @Override
    public void isMethod(Menu isParameter, MenuInflater isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        super.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(isMethod(), isNameExpr.isMethod("isStringConstant"));
                return true;
        }
        return super.isMethod(isNameExpr);
    }

    @Override
    protected RootAdapter<Feed, ? extends RecyclerView.ViewHolder> isMethod() {
        CommonFeedAdapter isVariable = new CommonFeedAdapter(isMethod(), true);
        isNameExpr.isMethod(this);
        return isNameExpr;
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(Feed isParameter) {
        isMethod(isNameExpr.isMethod(isMethod(), isNameExpr));
    }

    @Override
    protected Single<List<Feed>> isMethod(boolean isParameter) {
        return isNameExpr.isMethod();
    }
}

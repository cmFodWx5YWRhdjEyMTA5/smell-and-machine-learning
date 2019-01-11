// isComment
package com.github.pockethub.android.tests.repo;

import android.content.Intent;
import com.github.pockethub.android.tests.ActivityTest;
import com.github.pockethub.android.ui.search.SearchActivity;
import static android.app.SearchManager.QUERY;
import static android.content.Intent.ACTION_SEARCH;

/**
 * isComment
 */
public class isClassOrIsInterface extends ActivityTest<SearchActivity> {

    /**
     * isComment
     */
    public isConstructor() {
        super(SearchActivity.class);
    }

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isMethod(new Intent(isNameExpr).isMethod(isNameExpr, "isStringConstant"));
    }
}

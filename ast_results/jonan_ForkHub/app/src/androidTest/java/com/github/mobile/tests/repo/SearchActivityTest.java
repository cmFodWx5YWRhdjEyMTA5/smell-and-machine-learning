// isComment
package com.github.mobile.tests.repo;

import static android.app.SearchManager.QUERY;
import static android.content.Intent.ACTION_SEARCH;
import android.content.Intent;
import com.github.mobile.tests.ActivityTest;
import com.github.mobile.ui.search.SearchActivity;

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

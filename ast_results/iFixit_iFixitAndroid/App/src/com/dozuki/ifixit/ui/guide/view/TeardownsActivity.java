// isComment
package com.dozuki.ifixit.ui.guide.view;

import android.os.Bundle;
import com.dozuki.ifixit.App;
import com.dozuki.ifixit.R;
import com.dozuki.ifixit.util.api.ApiCall;
import com.dozuki.ifixit.util.api.ApiEvent;
import com.squareup.otto.Subscribe;

public class isClassOrIsInterface extends GuideListActivity {

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    protected ApiCall isMethod(int isParameter, int isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Subscribe
    public void isMethod(ApiEvent.Guides isParameter) {
        isMethod(isNameExpr);
    }
}

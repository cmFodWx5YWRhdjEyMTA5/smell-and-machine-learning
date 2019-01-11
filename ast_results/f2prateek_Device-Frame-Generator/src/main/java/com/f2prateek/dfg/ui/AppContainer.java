// isComment
package com.f2prateek.dfg.ui;

import android.app.Activity;
import android.view.ViewGroup;
import com.f2prateek.dfg.DFGApplication;
import static butterknife.ButterKnife.findById;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    /**
     * isComment
     */
    ViewGroup isMethod(Activity isParameter, DFGApplication isParameter);

    /**
     * isComment
     */
    AppContainer isVariable = new AppContainer() {

        @Override
        public ViewGroup isMethod(Activity isParameter, DFGApplication isParameter) {
            return isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    };
}

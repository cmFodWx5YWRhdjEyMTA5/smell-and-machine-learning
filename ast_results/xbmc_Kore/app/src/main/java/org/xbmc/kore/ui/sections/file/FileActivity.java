// isComment
package org.xbmc.kore.ui.sections.file;

import android.support.v4.app.Fragment;
import org.xbmc.kore.R;
import org.xbmc.kore.ui.BaseMediaActivity;
import org.xbmc.kore.ui.OnBackPressedListener;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseMediaActivity {

    @Override
    protected String isMethod() {
        return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected Fragment isMethod() {
        return new FileListFragment();
    }

    OnBackPressedListener isVariable;

    public void isMethod(OnBackPressedListener isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public void isMethod() {
        // isComment
        if (isNameExpr != null) {
            boolean isVariable = isNameExpr.isMethod();
            if (!isNameExpr)
                super.isMethod();
        }
    }
}

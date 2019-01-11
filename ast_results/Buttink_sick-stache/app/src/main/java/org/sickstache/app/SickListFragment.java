// isComment
package org.sickstache.app;

import android.os.Bundle;
import com.actionbarsherlock.app.SherlockListFragment;

public class isClassOrIsInterface extends SherlockListFragment {

    private boolean isVariable = true;

    protected boolean isMethod() {
        return isNameExpr;
    }

    protected boolean isMethod() {
        return true;
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        this.isMethod(isMethod());
    }

    @Override
    public void isMethod() {
        super.isMethod();
        // isComment
        if (isMethod()) {
            this.isFieldAccessExpr = true;
        }
    }

    @Override
    public void isMethod() {
        super.isMethod();
        // isComment
        this.isFieldAccessExpr = true;
    // isComment
    }
}

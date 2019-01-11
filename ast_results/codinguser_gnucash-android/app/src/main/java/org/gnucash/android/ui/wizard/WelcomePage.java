// isComment
package org.gnucash.android.ui.wizard;

import android.support.v4.app.Fragment;
import com.tech.freak.wizardpager.model.ModelCallbacks;
import com.tech.freak.wizardpager.model.Page;
import com.tech.freak.wizardpager.model.ReviewItem;
import java.util.ArrayList;

/**
 * isComment
 */
public class isClassOrIsInterface extends Page {

    protected isConstructor(ModelCallbacks isParameter, String isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public Fragment isMethod() {
        return new WelcomePageFragment();
    }

    @Override
    public void isMethod(ArrayList<ReviewItem> isParameter) {
    // isComment
    }
}

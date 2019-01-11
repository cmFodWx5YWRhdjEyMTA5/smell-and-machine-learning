// isComment
package io.github.hidroh.materialistic.test.shadow;

import android.support.design.widget.FloatingActionButton;
import org.robolectric.annotation.Implements;
import org.robolectric.shadows.ShadowView;

@Implements(FloatingActionButton.class)
public class isClassOrIsInterface extends ShadowView {

    private boolean isVariable = true;

    public void isMethod() {
        isNameExpr = true;
    }

    public void isMethod() {
        isNameExpr = true;
    }

    public boolean isMethod() {
        return isNameExpr;
    }
}

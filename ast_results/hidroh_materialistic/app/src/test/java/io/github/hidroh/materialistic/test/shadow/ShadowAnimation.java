// isComment
package io.github.hidroh.materialistic.test.shadow;

import android.view.animation.Animation;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;

@Implements(value = Animation.class, inheritImplementationMethods = true)
public class isClassOrIsInterface {

    private Animation.AnimationListener isVariable;

    @Implementation
    public void isMethod(Animation.AnimationListener isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Animation.AnimationListener isMethod() {
        return isNameExpr;
    }
}

// isComment
package org.wordpress.android.ui.screenshots.support;

import java.util.function.Supplier;

public class isClassOrIsInterface extends WPScreenshotIdler {

    private Supplier<Boolean> isVariable;

    public isConstructor(Supplier<Boolean> isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return isNameExpr.isMethod();
    }
}

// isComment
package org.emdev.ui.actions.params;

import android.widget.CompoundButton;

public class isClassOrIsInterface extends AbstractActionParameter {

    private final CompoundButton isVariable;

    public isConstructor(final String isParameter, final CompoundButton isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public Object isMethod() {
        return this.isFieldAccessExpr.isMethod();
    }
}

// isComment
package org.emdev.ui.preference;

import android.annotation.TargetApi;
import android.content.Context;
import android.preference.SwitchPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CompoundButton;

@TargetApi(isIntegerConstant)
public class isClassOrIsInterface extends SwitchPreference {

    private final Listener isVariable = new Listener();

    private class isClassOrIsInterface implements CompoundButton.OnCheckedChangeListener {

        @Override
        public void isMethod(final CompoundButton isParameter, final boolean isParameter) {
            if (!isMethod(isNameExpr)) {
                // isComment
                // isComment
                isNameExpr.isMethod(!isNameExpr);
                return;
            }
            isNameExpr.this.isMethod(isNameExpr);
        }
    }

    public isConstructor(final Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(final Context isParameter, final AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(final Context isParameter, final AttributeSet isParameter, final int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod(final View isParameter) {
        final Checkable isVariable = isMethod(isNameExpr);
        if (isNameExpr instanceof CompoundButton) {
            final CompoundButton isVariable = (CompoundButton) isNameExpr;
            isNameExpr.isMethod(isNameExpr);
        }
        super.isMethod(isNameExpr);
    }

    protected Checkable isMethod(final View isParameter) {
        if (isNameExpr instanceof Checkable) {
            return (Checkable) isNameExpr;
        } else if (isNameExpr instanceof ViewGroup) {
            final ViewGroup isVariable = (ViewGroup) isNameExpr;
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                final View isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr instanceof Checkable) {
                    return (Checkable) isNameExpr;
                }
            }
        }
        return null;
    }
}

// isComment
// isComment
package org.logicallycreative.mplw.widgets;

import org.logicallycreative.mplw.R;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public abstract class isClassOrIsInterface extends DialogPreference {

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod(true);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod(Builder isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(null, null);
    }

    @Override
    protected void isMethod(View isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    protected abstract void isMethod(TextView isParameter);

    private void isMethod(View isParameter) {
        TextView isVariable = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
    }
}

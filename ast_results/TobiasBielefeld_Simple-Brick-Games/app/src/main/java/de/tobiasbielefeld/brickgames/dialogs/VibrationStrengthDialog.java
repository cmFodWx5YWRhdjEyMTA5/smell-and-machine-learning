// isComment
package de.tobiasbielefeld.brickgames.dialogs;

import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Locale;
import de.tobiasbielefeld.brickgames.R;
import static de.tobiasbielefeld.brickgames.SharedData.*;

public class isClassOrIsInterface extends DialogPreference implements SeekBar.OnSeekBarChangeListener {

    private SeekBar isVariable;

    private TextView isVariable;

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(null);
    }

    @Override
    protected void isMethod(View isParameter) {
        isNameExpr = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (SeekBar) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        int isVariable = isNameExpr.isMethod("isStringConstant", isIntegerConstant);
        isNameExpr.isMethod(isNameExpr / isIntegerConstant);
        isMethod(isNameExpr);
        super.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(SeekBar isParameter) {
    }

    @Override
    public void isMethod(SeekBar isParameter, int isParameter, boolean isParameter) {
        isMethod(isNameExpr * isIntegerConstant);
    }

    @Override
    public void isMethod(SeekBar isParameter) {
        int isVariable = isNameExpr.isMethod() * isIntegerConstant;
        isMethod(isNameExpr);
    }

    @Override
    protected void isMethod(boolean isParameter) {
        // isComment
        if (isNameExpr) {
            isMethod("isStringConstant", isNameExpr.isMethod() * isIntegerConstant);
        }
    }

    private void isMethod(int isParameter) {
        if (isNameExpr == isIntegerConstant)
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        else
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant", isNameExpr));
    }
}

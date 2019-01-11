// isComment
package de.jurihock.voicesmith.widgets;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import de.jurihock.voicesmith.R;

public final class isClassOrIsInterface extends LinearLayout implements OnSeekBarChangeListener {

    private int isVariable;

    private TextView isVariable = null;

    private SeekBar isVariable = null;

    private PropertyChangeListener isVariable = null;

    public int isMethod() {
        return isNameExpr;
    }

    public void isMethod(int isParameter) {
        if (this.isFieldAccessExpr == isNameExpr)
            return;
        this.isFieldAccessExpr = isNameExpr;
        // isComment
        isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod(PropertyChangeListener isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isMethod(isNameExpr);
    }

    private void isMethod(Context isParameter) {
        // isComment
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, this);
        // isComment
        isNameExpr = (TextView) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (SeekBar) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        // isComment
        isNameExpr.isMethod(this);
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant);
    }

    /**
     * isComment
     */
    public void isMethod(SeekBar isParameter, int isParameter, boolean isParameter) {
        isNameExpr = isNameExpr;
        String isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public void isMethod(SeekBar isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(new PropertyChangeEvent(this, "isStringConstant", null, isNameExpr));
        }
    }

    public void isMethod(SeekBar isParameter) {
    // isComment
    }
}

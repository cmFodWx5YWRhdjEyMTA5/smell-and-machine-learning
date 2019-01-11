// isComment
package org.dmfs.tasks.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import org.dmfs.tasks.R;
import org.dmfs.tasks.model.ContentSet;
import org.dmfs.tasks.model.FieldDescriptor;
import org.dmfs.tasks.model.adapters.IntegerFieldAdapter;
import org.dmfs.tasks.model.layout.LayoutOptions;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractFieldEditor implements OnSeekBarChangeListener {

    /**
     * isComment
     */
    private static final int isVariable = isIntegerConstant;

    private IntegerFieldAdapter isVariable;

    private TextView isVariable;

    private SeekBar isVariable;

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr = (TextView) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (SeekBar) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null && isNameExpr != null) {
            isNameExpr.isMethod(this);
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(FieldDescriptor isParameter, LayoutOptions isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr = (IntegerFieldAdapter) isNameExpr.isMethod();
    }

    @Override
    public void isMethod(ContentSet isParameter) {
        if (isNameExpr != null && isNameExpr.isMethod(isNameExpr) != null) {
            int isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr * isNameExpr / isIntegerConstant);
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr) + "isStringConstant");
            isMethod(isNameExpr.isFieldAccessExpr);
        } else if (isNameExpr != null) {
            isNameExpr.isMethod(isIntegerConstant);
            isNameExpr.isMethod("isStringConstant");
            isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    @Override
    public void isMethod(SeekBar isParameter, int isParameter, boolean isParameter) {
        int isVariable = isNameExpr * isIntegerConstant / isNameExpr;
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr) + "isStringConstant");
        if (isNameExpr != null && isNameExpr != null) {
            // isComment
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
    }

    @Override
    public void isMethod(SeekBar isParameter) {
    // isComment
    }

    @Override
    public void isMethod(SeekBar isParameter) {
    // isComment
    }
}

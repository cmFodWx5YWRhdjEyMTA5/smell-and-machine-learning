// isComment
package org.dmfs.tasks.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import org.dmfs.tasks.model.ContentSet;
import org.dmfs.tasks.model.FieldDescriptor;
import org.dmfs.tasks.model.adapters.BooleanFieldAdapter;
import org.dmfs.tasks.model.layout.LayoutOptions;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractFieldEditor implements OnCheckedChangeListener, OnClickListener {

    private CheckBox isVariable;

    private BooleanFieldAdapter isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        this.isMethod(this);
        isNameExpr = (CheckBox) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(this);
        }
    }

    @Override
    public void isMethod(View isParameter) {
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod(FieldDescriptor isParameter, LayoutOptions isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr = (BooleanFieldAdapter) isNameExpr.isMethod();
    }

    @Override
    public void isMethod(ContentSet isParameter) {
        if (isNameExpr != null) {
            Boolean isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
        }
    }

    @Override
    public void isMethod(CompoundButton isParameter, boolean isParameter) {
        Boolean isVariable = isNameExpr.isMethod(isNameExpr);
        if (// isComment
        isNameExpr == null || isNameExpr != isNameExpr) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
    }
}

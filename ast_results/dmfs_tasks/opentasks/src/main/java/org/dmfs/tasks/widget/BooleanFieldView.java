// isComment
package org.dmfs.tasks.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import org.dmfs.tasks.R;
import org.dmfs.tasks.model.ContentSet;
import org.dmfs.tasks.model.FieldDescriptor;
import org.dmfs.tasks.model.adapters.BooleanFieldAdapter;
import org.dmfs.tasks.model.layout.LayoutOptions;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractFieldView {

    private BooleanFieldAdapter isVariable;

    private CheckBox isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    protected void isMethod() {
        super.isMethod();
        isNameExpr = (CheckBox) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(FieldDescriptor isParameter, LayoutOptions isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr = (BooleanFieldAdapter) isNameExpr.isMethod();
    }

    @Override
    public void isMethod(ContentSet isParameter) {
        Boolean isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null && isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            // isComment
            isMethod(isNameExpr.isFieldAccessExpr);
        }
    }
}

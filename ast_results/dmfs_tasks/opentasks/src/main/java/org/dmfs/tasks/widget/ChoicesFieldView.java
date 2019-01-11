// isComment
package org.dmfs.tasks.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import org.dmfs.tasks.R;
import org.dmfs.tasks.model.ContentSet;
import org.dmfs.tasks.model.FieldDescriptor;
import org.dmfs.tasks.model.IChoicesAdapter;
import org.dmfs.tasks.model.adapters.FieldAdapter;
import org.dmfs.tasks.model.layout.LayoutOptions;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractFieldView {

    private FieldAdapter<Object> isVariable;

    private TextView isVariable;

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
    }

    @SuppressWarnings("isStringConstant")
    @Override
    public void isMethod(FieldDescriptor isParameter, LayoutOptions isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr = (FieldAdapter<Object>) isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Override
    public void isMethod(ContentSet isParameter) {
        if (isNameExpr != null && isNameExpr.isMethod(isNameExpr) != null) {
            IChoicesAdapter isVariable = isNameExpr.isMethod();
            if (isNameExpr == null) {
                // isComment
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr).isMethod());
                isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant);
            } else {
                // isComment
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)));
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)), null, null, null);
            }
        } else {
            isMethod(isNameExpr.isFieldAccessExpr);
        }
    }
}

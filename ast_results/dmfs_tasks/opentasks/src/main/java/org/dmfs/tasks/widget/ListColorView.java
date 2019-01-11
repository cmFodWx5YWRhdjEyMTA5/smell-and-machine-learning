// isComment
package org.dmfs.tasks.widget;

import android.content.Context;
import android.util.AttributeSet;
import org.dmfs.tasks.model.ContentSet;
import org.dmfs.tasks.model.FieldDescriptor;
import org.dmfs.tasks.model.adapters.FieldAdapter;
import org.dmfs.tasks.model.layout.LayoutOptions;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractFieldView {

    /**
     * isComment
     */
    private FieldAdapter<Integer> isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @SuppressWarnings("isStringConstant")
    @Override
    public void isMethod(FieldDescriptor isParameter, LayoutOptions isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr = (FieldAdapter<Integer>) isNameExpr.isMethod();
    }

    @Override
    public void isMethod(ContentSet isParameter) {
        if (isNameExpr != null) {
            this.isMethod(isNameExpr.isMethod(isNameExpr));
        }
    }
}

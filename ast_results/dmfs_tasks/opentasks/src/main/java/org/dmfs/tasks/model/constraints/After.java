// isComment
package org.dmfs.tasks.model.constraints;

import android.text.format.Time;
import org.dmfs.tasks.model.ContentSet;
import org.dmfs.tasks.model.adapters.FieldAdapter;
import org.dmfs.tasks.model.defaults.Default;
import org.dmfs.tasks.model.defaults.DefaultAfter;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractConstraint<Time> {

    private final FieldAdapter<Time> isVariable;

    private final Default<Time> isVariable;

    public isConstructor(FieldAdapter<Time> isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = new DefaultAfter(isNameExpr);
    }

    @Override
    public Time isMethod(ContentSet isParameter, Time isParameter, Time isParameter) {
        Time isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null && isNameExpr != null && !isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
        }
        return isNameExpr;
    }
}

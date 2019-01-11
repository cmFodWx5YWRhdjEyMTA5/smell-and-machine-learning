// isComment
package org.dmfs.tasks.model.adapters;

import android.content.ContentValues;
import android.database.Cursor;
import org.dmfs.tasks.model.ContentSet;
import org.dmfs.tasks.model.OnContentChangeListener;
import org.dmfs.tasks.model.constraints.AbstractConstraint;
import java.util.LinkedList;
import java.util.List;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<Type> {

    /**
     * isComment
     */
    private List<AbstractConstraint<Type>> isVariable;

    /**
     * isComment
     */
    public abstract Type isMethod(ContentSet isParameter);

    /**
     * isComment
     */
    public abstract Type isMethod(Cursor isParameter);

    /**
     * isComment
     */
    public abstract Type isMethod(ContentSet isParameter);

    /**
     * isComment
     */
    public abstract void isMethod(ContentSet isParameter, Type isParameter);

    /**
     * isComment
     */
    public abstract void isMethod(ContentValues isParameter, Type isParameter);

    /**
     * isComment
     */
    public void isMethod(ContentSet isParameter, Type isParameter) {
        Type isVariable = isMethod(isNameExpr);
        isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public abstract void isMethod(ContentSet isParameter, OnContentChangeListener isParameter, boolean isParameter);

    /**
     * isComment
     */
    public abstract void isMethod(ContentSet isParameter, OnContentChangeListener isParameter);

    /**
     * isComment
     */
    public final FieldAdapter<Type> isMethod(AbstractConstraint<Type> isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new LinkedList<AbstractConstraint<Type>>();
        }
        isNameExpr.isMethod(isNameExpr);
        return this;
    }

    /**
     * isComment
     */
    protected final Type isMethod(ContentSet isParameter, Type isParameter, Type isParameter) {
        if (isNameExpr != null) {
            for (AbstractConstraint<Type> isVariable : isNameExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
        }
        return isNameExpr;
    }
}

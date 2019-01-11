// isComment
package org.dmfs.tasks.model.adapters;

import android.database.Cursor;
import org.dmfs.tasks.model.ContentSet;
import org.dmfs.tasks.utils.colors.SmoothLightnessCapped;

/**
 * isComment
 */
public final class isClassOrIsInterface extends IntegerFieldAdapter {

    private final Float isVariable;

    /**
     * isComment
     */
    public isConstructor(String isParameter) {
        this(isNameExpr, isDoubleConstant);
    }

    /**
     * isComment
     */
    public isConstructor(String isParameter, float isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public isConstructor(String isParameter, Integer isParameter) {
        this(isNameExpr, isNameExpr, isDoubleConstant);
    }

    /**
     * isComment
     */
    public isConstructor(String isParameter, Integer isParameter, float isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    public Integer isMethod(ContentSet isParameter) {
        return new SmoothLightnessCapped(isNameExpr, super.isMethod(isNameExpr)).isMethod();
    }

    @Override
    public Integer isMethod(Cursor isParameter) {
        return new SmoothLightnessCapped(isNameExpr, super.isMethod(isNameExpr)).isMethod();
    }

    @Override
    public Integer isMethod(ContentSet isParameter) {
        return new SmoothLightnessCapped(isNameExpr, super.isMethod(isNameExpr)).isMethod();
    }
}

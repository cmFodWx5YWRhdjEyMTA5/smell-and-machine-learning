// isComment
package org.dmfs.tasks.utils.colors;

import android.support.annotation.ColorInt;
import org.dmfs.android.bolts.color.Color;
import org.dmfs.android.bolts.color.dynamic.lightness.HsvToned;
import org.dmfs.android.bolts.color.elementary.DelegatingColor;
import org.dmfs.android.bolts.color.elementary.ValueColor;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingColor {

    public isConstructor(final float isParameter, Color isParameter) {
        super(new HsvToned(isParameter -> isNameExpr * isNameExpr * isNameExpr * isNameExpr * isNameExpr * (isNameExpr - isIntegerConstant) + isNameExpr, isNameExpr));
    }

    public isConstructor(float isParameter, @ColorInt int isParameter) {
        this(isNameExpr, new ValueColor(isNameExpr));
    }
}

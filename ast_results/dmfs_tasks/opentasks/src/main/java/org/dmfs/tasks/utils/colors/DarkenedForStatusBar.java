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

    public isConstructor(Color isParameter) {
        super(new HsvToned(isParameter -> isNameExpr * isDoubleConstant, isNameExpr));
    }

    public isConstructor(@ColorInt int isParameter) {
        this(new ValueColor(isNameExpr));
    }
}

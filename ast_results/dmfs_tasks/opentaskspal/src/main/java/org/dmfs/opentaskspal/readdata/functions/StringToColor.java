// isComment
package org.dmfs.opentaskspal.readdata.functions;

import org.dmfs.android.bolts.color.Color;
import org.dmfs.android.bolts.color.colors.ValueColor;
import org.dmfs.jems.function.Function;

/**
 * isComment
 */
public final class isClassOrIsInterface implements Function<String, Color> {

    public static final Function<String, Color> isVariable = new StringToColor();

    private isConstructor() {
    }

    @Override
    public Color isMethod(String isParameter) {
        return new ValueColor(isNameExpr.isMethod(isNameExpr));
    }
}

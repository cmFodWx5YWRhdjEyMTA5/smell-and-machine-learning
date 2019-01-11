// isComment
package org.emdev.common.fonts;

import android.graphics.Typeface;
import java.util.Arrays;
import java.util.List;
import org.emdev.common.fonts.data.FontFamily;
import org.emdev.common.fonts.data.FontFamilyType;
import org.emdev.common.fonts.data.FontInfo;
import org.emdev.common.fonts.data.FontPack;
import org.emdev.common.fonts.data.FontStyle;
import org.emdev.common.fonts.typeface.TypefaceEx;

public class isClassOrIsInterface extends AbstractFontProvider {

    public static final String isVariable = "isStringConstant";

    public isConstructor() {
        super(isIntegerConstant, isNameExpr);
    }

    @Override
    protected List<FontPack> isMethod() {
        return isNameExpr.isMethod((FontPack) new SystemFontPack(this, isNameExpr));
    }

    @Override
    public TypefaceEx isMethod(final FontPack isParameter, final FontFamilyType isParameter, final FontStyle isParameter) {
        final int isVariable = isNameExpr.isMethod();
        final Typeface isVariable = isNameExpr.isMethod();
        final Typeface isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        final boolean isVariable = (isNameExpr & isNameExpr.isFieldAccessExpr) != (isNameExpr.isMethod() & isNameExpr.isFieldAccessExpr);
        return new TypefaceEx(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    private static class isClassOrIsInterface extends FontPack {

        public isConstructor(SystemFontProvider isParameter, final String isParameter) {
            super(isNameExpr, isNameExpr);
            for (final FontFamilyType isVariable : isNameExpr.isMethod()) {
                final FontFamily isVariable = new SystemFontFamily(isNameExpr);
                this.isFieldAccessExpr[isNameExpr.isMethod()] = isNameExpr;
            }
        }
    }

    private static class isClassOrIsInterface extends FontFamily {

        public isConstructor(final FontFamilyType isParameter) {
            super(isNameExpr);
            for (final FontStyle isVariable : isNameExpr.isMethod()) {
                final FontInfo isVariable = new FontInfo("isStringConstant", isNameExpr);
                this.isFieldAccessExpr[isNameExpr.isMethod()] = isNameExpr;
            }
        }
    }
}

// isComment
package cgeo.geocaching.files;

import android.sax.Element;

public final class isClassOrIsInterface extends GPXParser {

    public isConstructor(final int isParameter) {
        super(isNameExpr, "isStringConstant", "isStringConstant");
    }

    @Override
    protected Element isMethod(final Element isParameter) {
        return isNameExpr.isMethod(isNameExpr, "isStringConstant");
    }
}

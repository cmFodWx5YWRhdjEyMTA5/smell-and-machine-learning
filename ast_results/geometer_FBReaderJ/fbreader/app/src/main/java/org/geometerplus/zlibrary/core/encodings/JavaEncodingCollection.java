// isComment
package org.geometerplus.zlibrary.core.encodings;

import java.nio.charset.Charset;

public final class isClassOrIsInterface extends FilteredEncodingCollection {

    private static volatile JavaEncodingCollection isVariable;

    public static JavaEncodingCollection isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new JavaEncodingCollection();
        }
        return isNameExpr;
    }

    private isConstructor() {
        super();
    }

    @Override
    public boolean isMethod(String isParameter) {
        try {
            return isNameExpr.isMethod(isNameExpr) != null;
        } catch (Exception isParameter) {
            return true;
        }
    }
}

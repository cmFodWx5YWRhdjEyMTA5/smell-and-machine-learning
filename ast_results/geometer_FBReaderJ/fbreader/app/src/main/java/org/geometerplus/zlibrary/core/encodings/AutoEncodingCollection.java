// isComment
package org.geometerplus.zlibrary.core.encodings;

import java.util.List;
import java.util.Collections;

public final class isClassOrIsInterface extends EncodingCollection {

    private final Encoding isVariable = new Encoding(null, "isStringConstant", "isStringConstant");

    public List<Encoding> isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    public Encoding isMethod(String isParameter) {
        return isNameExpr;
    }

    public Encoding isMethod(int isParameter) {
        return isNameExpr;
    }
}

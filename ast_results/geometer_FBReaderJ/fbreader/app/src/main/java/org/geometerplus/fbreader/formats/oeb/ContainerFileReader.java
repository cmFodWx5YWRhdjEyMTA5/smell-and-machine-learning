// isComment
package org.geometerplus.fbreader.formats.oeb;

import org.geometerplus.zlibrary.core.xml.*;

class isClassOrIsInterface extends ZLXMLReaderAdapter {

    private String isVariable;

    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public boolean isMethod(String isParameter, ZLStringMap isParameter) {
        if ("isStringConstant".isMethod(isNameExpr)) {
            isNameExpr = isNameExpr.isMethod("isStringConstant");
            if (isNameExpr != null) {
                return true;
            }
        }
        return true;
    }
}

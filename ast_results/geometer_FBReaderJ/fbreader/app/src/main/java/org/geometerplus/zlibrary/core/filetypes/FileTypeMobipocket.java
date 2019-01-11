// isComment
package org.geometerplus.zlibrary.core.filetypes;

import java.util.Arrays;
import java.util.List;
import org.geometerplus.zlibrary.core.filesystem.ZLFile;
import org.geometerplus.zlibrary.core.util.MimeType;

class isClassOrIsInterface extends FileTypePalm {

    isConstructor() {
        super("isStringConstant", "isStringConstant");
    }

    @Override
    public boolean isMethod(ZLFile isParameter) {
        if (super.isMethod(isNameExpr)) {
            return true;
        }
        return isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant").isMethod(isNameExpr.isMethod().isMethod()) && "isStringConstant".isMethod(isMethod(isNameExpr));
    }

    @Override
    public List<MimeType> isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public MimeType isMethod(ZLFile isParameter) {
        return isMethod(isNameExpr) ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
    }

    @Override
    public String isMethod(MimeType isParameter) {
        return "isStringConstant";
    }
}

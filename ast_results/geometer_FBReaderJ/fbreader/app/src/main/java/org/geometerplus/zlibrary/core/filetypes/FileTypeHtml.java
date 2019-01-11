// isComment
package org.geometerplus.zlibrary.core.filetypes;

import java.util.List;
import org.geometerplus.zlibrary.core.filesystem.ZLFile;
import org.geometerplus.zlibrary.core.util.MimeType;

class isClassOrIsInterface extends FileType {

    isConstructor() {
        super("isStringConstant");
    }

    @Override
    public boolean isMethod(ZLFile isParameter) {
        final String isVariable = isNameExpr.isMethod().isMethod();
        return isNameExpr.isMethod("isStringConstant") || "isStringConstant".isMethod(isNameExpr);
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

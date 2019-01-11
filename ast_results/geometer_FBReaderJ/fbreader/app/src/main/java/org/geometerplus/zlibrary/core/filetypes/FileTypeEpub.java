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
        final String isVariable = isNameExpr.isMethod();
        return "isStringConstant".isMethod(isNameExpr) || "isStringConstant".isMethod(isNameExpr) || ("isStringConstant".isMethod(isNameExpr) && isNameExpr != isNameExpr.isMethod());
    }

    @Override
    public List<MimeType> isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public MimeType isMethod(ZLFile isParameter) {
        final String isVariable = isNameExpr.isMethod();
        if ("isStringConstant".isMethod(isNameExpr)) {
            return isNameExpr.isFieldAccessExpr;
        }
        // isComment
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public MimeType isMethod(ZLFile isParameter) {
        final String isVariable = isNameExpr.isMethod();
        if ("isStringConstant".isMethod(isNameExpr)) {
            return isNameExpr.isFieldAccessExpr;
        }
        // isComment
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public String isMethod(MimeType isParameter) {
        return "isStringConstant";
    }
}

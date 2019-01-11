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
        return "isStringConstant".isMethod(isNameExpr) || "isStringConstant".isMethod(isNameExpr);
    }

    @Override
    public List<MimeType> isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public MimeType isMethod(ZLFile isParameter) {
        final String isVariable = isNameExpr.isMethod().isMethod();
        if (isNameExpr.isMethod("isStringConstant")) {
            return isNameExpr.isFieldAccessExpr;
        } else if (isNameExpr.isMethod("isStringConstant")) {
            return isNameExpr.isFieldAccessExpr;
        } else {
            return isNameExpr.isFieldAccessExpr;
        }
    }

    @Override
    public MimeType isMethod(ZLFile isParameter) {
        final String isVariable = isNameExpr.isMethod().isMethod();
        if (isNameExpr.isMethod("isStringConstant")) {
            return isNameExpr.isFieldAccessExpr;
        } else if (isNameExpr.isMethod("isStringConstant")) {
            return isNameExpr.isFieldAccessExpr;
        } else {
            return isNameExpr.isFieldAccessExpr;
        }
    }

    @Override
    public String isMethod(MimeType isParameter) {
        isNameExpr = isNameExpr.isMethod();
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) || isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            return "isStringConstant";
        }
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) || isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            return "isStringConstant";
        }
        return "isStringConstant";
    }
}

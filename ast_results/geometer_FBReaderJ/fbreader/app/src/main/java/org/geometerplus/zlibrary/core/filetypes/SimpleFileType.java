// isComment
package org.geometerplus.zlibrary.core.filetypes;

import java.util.List;
import org.geometerplus.zlibrary.core.filesystem.ZLFile;
import org.geometerplus.zlibrary.core.util.MimeType;

class isClassOrIsInterface extends FileType {

    private final String isVariable;

    private final List<MimeType> isVariable;

    isConstructor(String isParameter, String isParameter, List<MimeType> isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(ZLFile isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Override
    public List<MimeType> isMethod() {
        return isNameExpr;
    }

    @Override
    public MimeType isMethod(ZLFile isParameter) {
        return isMethod(isNameExpr) ? isNameExpr.isMethod(isIntegerConstant) : isNameExpr.isFieldAccessExpr;
    }

    @Override
    public String isMethod(MimeType isParameter) {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + isNameExpr + "isStringConstant";
    }
}

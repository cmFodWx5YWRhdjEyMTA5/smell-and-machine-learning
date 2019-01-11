// isComment
package org.geometerplus.fbreader.formats;

import org.pdfparse.model.PDFDocInfo;
import org.pdfparse.model.PDFDocument;
import org.geometerplus.zlibrary.core.filesystem.ZLFile;
import org.geometerplus.zlibrary.core.util.SystemInfo;
import org.geometerplus.fbreader.book.AbstractBook;
import org.geometerplus.fbreader.book.BookUtil;

public class isClassOrIsInterface extends ExternalFormatPlugin {

    public isConstructor(SystemInfo isParameter) {
        super(isNameExpr, "isStringConstant");
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public void isMethod(AbstractBook isParameter) {
        final ZLFile isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != isNameExpr.isMethod()) {
            // isComment
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            return;
        }
        try {
            final PDFDocument isVariable = new PDFDocument(isNameExpr.isMethod());
            // isComment
            if (!isNameExpr.isMethod()) {
                final PDFDocInfo isVariable = isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr.isMethod());
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
        } catch (Throwable isParameter) {
            isNameExpr.isMethod();
        }
    }

    @Override
    public void isMethod(AbstractBook isParameter) {
        if (isNameExpr.isMethod().isMethod()) {
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, "isStringConstant"));
        }
    }
}

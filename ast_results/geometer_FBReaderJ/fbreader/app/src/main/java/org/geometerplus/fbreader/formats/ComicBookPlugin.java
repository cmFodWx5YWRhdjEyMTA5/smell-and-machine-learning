// isComment
package org.geometerplus.fbreader.formats;

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
    // isComment
    }

    @Override
    public void isMethod(AbstractBook isParameter) {
        if (isNameExpr.isMethod().isMethod()) {
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, "isStringConstant"));
        }
    }
}

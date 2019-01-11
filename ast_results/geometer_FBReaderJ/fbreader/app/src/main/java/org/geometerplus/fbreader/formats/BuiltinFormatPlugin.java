// isComment
package org.geometerplus.fbreader.formats;

import org.geometerplus.zlibrary.core.util.SystemInfo;
import org.geometerplus.fbreader.bookmodel.BookModel;

public abstract class isClassOrIsInterface extends FormatPlugin {

    protected isConstructor(SystemInfo isParameter, String isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public abstract void isMethod(BookModel isParameter) throws BookReadingException;
}

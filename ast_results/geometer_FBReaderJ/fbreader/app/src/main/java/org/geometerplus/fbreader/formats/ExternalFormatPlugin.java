// isComment
package org.geometerplus.fbreader.formats;

import org.geometerplus.zlibrary.core.encodings.AutoEncodingCollection;
import org.geometerplus.zlibrary.core.filesystem.ZLFile;
import org.geometerplus.zlibrary.core.util.SystemInfo;
import org.geometerplus.fbreader.book.AbstractBook;

public abstract class isClassOrIsInterface extends FormatPlugin {

    protected isConstructor(SystemInfo isParameter, String isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    public abstract String isMethod();

    @Override
    public PluginImage isMethod(ZLFile isParameter) {
        return new PluginImage(isNameExpr, this);
    }

    @Override
    public AutoEncodingCollection isMethod() {
        return new AutoEncodingCollection();
    }

    @Override
    public void isMethod(AbstractBook isParameter) {
    }

    @Override
    public String isMethod(ZLFile isParameter) {
        return null;
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + isMethod() + "isStringConstant";
    }
}

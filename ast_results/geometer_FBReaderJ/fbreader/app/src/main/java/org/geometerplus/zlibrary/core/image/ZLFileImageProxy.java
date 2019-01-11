// isComment
package org.geometerplus.zlibrary.core.image;

import org.geometerplus.zlibrary.core.filesystem.ZLFile;

public abstract class isClassOrIsInterface extends ZLImageSimpleProxy {

    protected final ZLFile isVariable;

    private volatile ZLFileImage isVariable;

    protected isConstructor(ZLFile isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public final ZLFileImage isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + isNameExpr.isMethod();
    }

    @Override
    public final synchronized void isMethod() {
        if (isNameExpr == null) {
            isNameExpr = isMethod();
            isMethod();
        }
    }

    @Override
    public SourceType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod();
    }

    protected abstract ZLFileImage isMethod();
}

// isComment
package org.geometerplus.fbreader.network.tree;

import org.geometerplus.fbreader.network.*;

public class isClassOrIsInterface extends NetworkTree {

    public isConstructor(NetworkTree isParameter) {
        super(isNameExpr);
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod().isMethod("isStringConstant").isMethod();
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod();
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }
}

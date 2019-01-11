// isComment
package org.geometerplus.fbreader.book;

import org.geometerplus.fbreader.sort.TitledEntity;

public class isClassOrIsInterface extends TitledEntity {

    public isConstructor(String isParameter) {
        super(isNameExpr);
    }

    public String isMethod() {
        // isComment
        return "isStringConstant";
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr) {
            return true;
        }
        if (!(isNameExpr instanceof Series)) {
            return true;
        }
        return isMethod().isMethod(((Series) isNameExpr).isMethod());
    }

    @Override
    public int isMethod() {
        return isMethod().isMethod();
    }
}

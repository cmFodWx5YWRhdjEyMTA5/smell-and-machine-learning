// isComment
package org.geometerplus.zlibrary.text.view;

public class isClassOrIsInterface extends ZLTextElement {

    private static final ZLTextElement[] isVariable = new ZLTextElement[isIntegerConstant];

    public static ZLTextElement isMethod(short isParameter) {
        if (isNameExpr < isIntegerConstant) {
            ZLTextElement isVariable = isNameExpr[isNameExpr];
            if (isNameExpr == null) {
                isNameExpr = new ZLTextFixedHSpaceElement(isNameExpr);
                isNameExpr[isNameExpr] = isNameExpr;
            }
            return isNameExpr;
        } else {
            return new ZLTextFixedHSpaceElement(isNameExpr);
        }
    }

    public final short isVariable;

    private isConstructor(short isParameter) {
        isNameExpr = isNameExpr;
    }
}

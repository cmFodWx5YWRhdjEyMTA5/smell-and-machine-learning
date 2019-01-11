// isComment
package ru.valle.btc;

import java.io.ByteArrayOutputStream;

@SuppressWarnings("isStringConstant")
public final class isClassOrIsInterface extends ByteArrayOutputStream {

    public void isMethod(int isParameter) {
        isMethod(isNameExpr & isIntegerConstant);
        isMethod((isNameExpr >> isIntegerConstant) & isIntegerConstant);
    }

    public void isMethod(int isParameter) {
        isMethod(isNameExpr & isIntegerConstant);
        isMethod((isNameExpr >> isIntegerConstant) & isIntegerConstant);
        isMethod((isNameExpr >> isIntegerConstant) & isIntegerConstant);
        isMethod((isNameExpr >>> isIntegerConstant) & isIntegerConstant);
    }

    public void isMethod(long isParameter) {
        isMethod((int) (isNameExpr & isStringConstant));
        isMethod((int) ((isNameExpr >>> isIntegerConstant) & isStringConstant));
    }

    public void isMethod(long isParameter) {
        if (isNameExpr < isIntegerConstant) {
            isMethod((int) (isNameExpr & isIntegerConstant));
        } else if (isNameExpr < isIntegerConstant) {
            isMethod(isIntegerConstant);
            isMethod((int) isNameExpr);
        } else if (isNameExpr < isStringConstant) {
            isMethod(isIntegerConstant);
            isMethod((int) isNameExpr);
        } else {
            isMethod(isIntegerConstant);
            isMethod(isNameExpr);
        }
    }
}

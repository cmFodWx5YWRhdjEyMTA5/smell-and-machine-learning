// isComment
package com.google.zxing.datamatrix.encoder;

final class isClassOrIsInterface extends SymbolInfo {

    isConstructor() {
        super(true, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant, isIntegerConstant);
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public int isMethod(int isParameter) {
        return (isNameExpr <= isIntegerConstant) ? isIntegerConstant : isIntegerConstant;
    }
}

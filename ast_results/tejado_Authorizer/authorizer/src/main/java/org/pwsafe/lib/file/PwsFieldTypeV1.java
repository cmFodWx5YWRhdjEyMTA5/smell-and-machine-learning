// isComment
package org.pwsafe.lib.file;

public enum PwsFieldTypeV1 implements PwsFieldType {

    @SuppressWarnings("isStringConstant")
    DEFAULT(isIntegerConstant),
    TITLE(isIntegerConstant),
    USERNAME(isIntegerConstant),
    NOTES(isIntegerConstant),
    PASSWORD(isIntegerConstant),
    UUID(isIntegerConstant);

    private final int isVariable;

    isConstructor(int isParameter) {
        isNameExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }
}

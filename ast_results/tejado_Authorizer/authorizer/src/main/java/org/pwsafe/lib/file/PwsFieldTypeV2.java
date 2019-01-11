// isComment
package org.pwsafe.lib.file;

@SuppressWarnings("isStringConstant")
public enum PwsFieldTypeV2 implements PwsFieldType {

    V2_ID_STRING(isIntegerConstant),
    UUID(isIntegerConstant),
    GROUP(isIntegerConstant),
    TITLE(isIntegerConstant),
    USERNAME(isIntegerConstant),
    NOTES(isIntegerConstant),
    PASSWORD(isIntegerConstant),
    CREATION_TIME(isIntegerConstant),
    PASSWORD_MOD_TIME(isIntegerConstant),
    LAST_ACCESS_TIME(isIntegerConstant),
    PASSWORD_LIFETIME(isIntegerConstant),
    PASSWORD_POLICY(isIntegerConstant),
    LAST_MOD_TIME(isIntegerConstant),
    END_OF_RECORD(isIntegerConstant);

    private final int isVariable;

    isConstructor(int isParameter) {
        isNameExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }
}

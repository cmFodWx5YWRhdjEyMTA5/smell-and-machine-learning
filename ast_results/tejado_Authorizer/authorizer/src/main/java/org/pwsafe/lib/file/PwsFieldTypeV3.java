// isComment
package org.pwsafe.lib.file;

@SuppressWarnings("isStringConstant")
public enum PwsFieldTypeV3 implements PwsFieldType {

    V3_ID_STRING(isIntegerConstant),
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
    PASSWORD_POLICY_DEPRECATED(isIntegerConstant),
    LAST_MOD_TIME(isIntegerConstant),
    URL(isIntegerConstant),
    AUTOTYPE(isIntegerConstant),
    PASSWORD_HISTORY(isIntegerConstant),
    PASSWORD_POLICY(isIntegerConstant),
    PASSWORD_EXPIRY_INTERVAL(isIntegerConstant),
    END_OF_RECORD(isIntegerConstant);

    private final int isVariable;

    isConstructor(int isParameter) {
        isNameExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }
}

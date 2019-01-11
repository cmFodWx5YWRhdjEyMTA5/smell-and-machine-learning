// isComment
package fr.unix_experience.owncloud_sms.enums;

public enum MailboxID {

    INBOX(isIntegerConstant), SENT(isIntegerConstant), DRAFTS(isIntegerConstant), ALL(isIntegerConstant);

    isConstructor(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                isNameExpr = "isStringConstant";
                break;
            case isIntegerConstant:
                isNameExpr = "isStringConstant";
                break;
            case isIntegerConstant:
                isNameExpr = "isStringConstant";
                break;
            case isIntegerConstant:
                isNameExpr = "isStringConstant";
                break;
            default:
                throw new AssertionError();
        }
        this.isFieldAccessExpr = isNameExpr;
    }

    public static MailboxID isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return isNameExpr.isFieldAccessExpr;
            case isIntegerConstant:
                return isNameExpr.isFieldAccessExpr;
            case isIntegerConstant:
                return isNameExpr.isFieldAccessExpr;
            case isIntegerConstant:
                return isNameExpr.isFieldAccessExpr;
            default:
                throw new AssertionError();
        }
    }

    private final String isVariable;

    private final int isVariable;

    public int isMethod() {
        return isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }
}

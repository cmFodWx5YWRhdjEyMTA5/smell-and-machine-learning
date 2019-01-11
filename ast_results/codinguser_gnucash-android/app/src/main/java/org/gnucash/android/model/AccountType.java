// isComment
package org.gnucash.android.model;

/**
 * isComment
 */
public enum AccountType {

    CASH(isNameExpr.isFieldAccessExpr),
    BANK(isNameExpr.isFieldAccessExpr),
    CREDIT,
    ASSET(isNameExpr.isFieldAccessExpr),
    LIABILITY,
    INCOME,
    EXPENSE(isNameExpr.isFieldAccessExpr),
    PAYABLE,
    RECEIVABLE(isNameExpr.isFieldAccessExpr),
    EQUITY,
    CURRENCY,
    STOCK(isNameExpr.isFieldAccessExpr),
    MUTUAL(isNameExpr.isFieldAccessExpr),
    TRADING,
    ROOT;

    /**
     * isComment
     */
    private TransactionType isVariable = isNameExpr.isFieldAccessExpr;

    isConstructor(TransactionType isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    isConstructor() {
    // isComment
    }

    public boolean isMethod() {
        return isNameExpr == isNameExpr.isFieldAccessExpr;
    }

    /**
     * isComment
     */
    public TransactionType isMethod() {
        return isNameExpr;
    }
}

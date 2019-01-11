// isComment
package org.bitcoinj.wallet;

import org.bitcoinj.core.Transaction;

/**
 * isComment
 */
public class isClassOrIsInterface extends DefaultCoinSelector {

    @Override
    protected boolean isMethod(Transaction isParameter) {
        return true;
    }

    private static AllowUnconfirmedCoinSelector isVariable;

    /**
     * isComment
     */
    public static AllowUnconfirmedCoinSelector isMethod() {
        // isComment
        if (isNameExpr == null)
            isNameExpr = new AllowUnconfirmedCoinSelector();
        return isNameExpr;
    }
}

// isComment
package com.liato.bankdroid.api.domain.account.impl;

import com.liato.bankdroid.api.domain.account.CreditCardAccount;
import com.liato.bankdroid.api.domain.account.Transaction;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import static com.liato.bankdroid.api.domain.account.impl.AccountBuilder.BasicAccount;

public class isClassOrIsInterface extends AbstractAccountBuilder<CreditCardAccountBuilder> {

    private BigDecimal isVariable;

    private Collection<Transaction> isVariable;

    public isConstructor(String isParameter, String isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    protected CreditCardAccountBuilder isMethod() {
        return this;
    }

    public CreditCardAccountBuilder isMethod(BigDecimal isParameter) {
        isNameExpr = isNameExpr;
        return this;
    }

    public CreditCardAccountBuilder isMethod(Collection<Transaction> isParameter) {
        isNameExpr = isNameExpr;
        return this;
    }

    public CreditCardAccount isMethod() {
        return new BasicCreditCardAccount(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    private class isClassOrIsInterface extends BasicAccount implements CreditCardAccount {

        private BigDecimal isVariable;

        private Collection<Transaction> isVariable;

        isConstructor(String isParameter, String isParameter, String isParameter, BigDecimal isParameter, Map<String, String> isParameter, BigDecimal isParameter, Collection<Transaction> isParameter) {
            super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr = isNameExpr;
            isNameExpr = isNameExpr;
        }

        @Override
        public BigDecimal isMethod() {
            return isNameExpr == null ? isNameExpr.isFieldAccessExpr : isNameExpr;
        }

        public Collection<Transaction> isMethod() {
            return isNameExpr == null ? isNameExpr.<Transaction>isMethod() : isNameExpr;
        }
    }
}

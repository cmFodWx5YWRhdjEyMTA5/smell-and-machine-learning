// isComment
package com.liato.bankdroid.api.domain.account.impl;

import com.liato.bankdroid.api.domain.account.Transaction;
import com.liato.bankdroid.api.domain.account.TransactionAccount;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import static com.liato.bankdroid.api.domain.account.impl.AccountBuilder.BasicAccount;

public class isClassOrIsInterface extends AbstractAccountBuilder<TransactionAccountBuilder> {

    private Collection<Transaction> isVariable;

    public isConstructor(String isParameter, String isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    protected TransactionAccountBuilder isMethod() {
        return this;
    }

    public TransactionAccountBuilder isMethod(Transaction isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new ArrayList<>();
        }
        isNameExpr.isMethod(isNameExpr);
        return this;
    }

    public TransactionAccountBuilder isMethod(Collection<Transaction> isParameter) {
        isNameExpr = isNameExpr;
        return this;
    }

    public TransactionAccount isMethod() {
        return new BasicTransactionAccount(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    private static class isClassOrIsInterface extends BasicAccount implements TransactionAccount {

        private Collection<Transaction> isVariable;

        private isConstructor(String isParameter, String isParameter, String isParameter, BigDecimal isParameter, Map<String, String> isParameter, Collection<Transaction> isParameter) {
            super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr = isNameExpr;
        }

        @Override
        public Collection<Transaction> isMethod() {
            return isNameExpr == null ? isNameExpr.<Transaction>isMethod() : isNameExpr;
        }
    }
}

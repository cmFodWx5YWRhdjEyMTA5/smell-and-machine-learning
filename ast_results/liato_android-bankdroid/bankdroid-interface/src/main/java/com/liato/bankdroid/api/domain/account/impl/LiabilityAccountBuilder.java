// isComment
package com.liato.bankdroid.api.domain.account.impl;

import com.liato.bankdroid.api.domain.account.LiabilityAccount;
import com.liato.bankdroid.api.domain.account.Payment;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import static com.liato.bankdroid.api.domain.account.impl.AccountBuilder.BasicAccount;

public class isClassOrIsInterface extends AbstractAccountBuilder<LiabilityAccountBuilder> {

    private double isVariable;

    private Collection<Payment> isVariable;

    public isConstructor(String isParameter, String isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    protected LiabilityAccountBuilder isMethod() {
        return this;
    }

    public LiabilityAccountBuilder isMethod(double isParameter) {
        isNameExpr = isNameExpr;
        return this;
    }

    public LiabilityAccountBuilder isMethod(Payment isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new ArrayList<>();
        }
        isNameExpr.isMethod(isNameExpr);
        return this;
    }

    public LiabilityAccountBuilder isMethod(Collection<Payment> isParameter) {
        isNameExpr = isNameExpr;
        return this;
    }

    public LiabilityAccount isMethod() {
        return new BasicLiabilityAccount(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    private static class isClassOrIsInterface extends BasicAccount implements LiabilityAccount {

        private double isVariable;

        private Collection<Payment> isVariable;

        private isConstructor(String isParameter, String isParameter, String isParameter, BigDecimal isParameter, Map<String, String> isParameter, double isParameter, Collection<Payment> isParameter) {
            super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr = isNameExpr;
            isNameExpr = isNameExpr;
        }

        @Override
        public double isMethod() {
            return isNameExpr;
        }

        @Override
        public Collection<Payment> isMethod() {
            return isNameExpr == null ? isNameExpr.<Payment>isMethod() : isNameExpr;
        }
    }
}

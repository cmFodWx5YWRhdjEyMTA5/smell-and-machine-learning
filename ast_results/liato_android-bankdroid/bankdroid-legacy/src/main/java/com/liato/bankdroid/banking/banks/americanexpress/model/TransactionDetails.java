// isComment
package com.liato.bankdroid.banking.banks.americanexpress.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class isClassOrIsInterface {

    private long isVariable;

    private String isVariable;

    private List<AccountActivity> isVariable;

    public long isMethod() {
        return isNameExpr;
    }

    public void isMethod(long isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public List<AccountActivity> isMethod() {
        return isNameExpr;
    }

    public void isMethod(List<AccountActivity> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public List<Transaction> isMethod() {
        if (isNameExpr != null) {
            List<Transaction> isVariable = new ArrayList<>();
            for (AccountActivity isVariable : isNameExpr) {
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
            return isNameExpr;
        }
        return isNameExpr.isMethod();
    }
}

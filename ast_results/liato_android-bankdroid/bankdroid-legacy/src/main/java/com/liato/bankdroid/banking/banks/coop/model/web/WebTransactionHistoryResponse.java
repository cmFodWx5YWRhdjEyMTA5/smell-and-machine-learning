// isComment
package com.liato.bankdroid.banking.banks.coop.model.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class isClassOrIsInterface {

    @JsonProperty("isStringConstant")
    private D isVariable;

    @JsonProperty("isStringConstant")
    public D isMethod() {
        return isNameExpr;
    }

    @JsonProperty("isStringConstant")
    public void isMethod(D isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Model isMethod() {
        return this.isFieldAccessExpr != null ? this.isFieldAccessExpr.isMethod() : null;
    }
}

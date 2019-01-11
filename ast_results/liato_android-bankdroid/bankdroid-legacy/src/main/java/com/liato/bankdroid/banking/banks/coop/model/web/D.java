// isComment
package com.liato.bankdroid.banking.banks.coop.model.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class isClassOrIsInterface {

    @JsonProperty("isStringConstant")
    private String isVariable;

    @JsonProperty("isStringConstant")
    private Model isVariable;

    @JsonProperty("isStringConstant")
    public String isMethod() {
        return isNameExpr;
    }

    @JsonProperty("isStringConstant")
    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @JsonProperty("isStringConstant")
    public Model isMethod() {
        return isNameExpr;
    }

    @JsonProperty("isStringConstant")
    public void isMethod(Model isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}

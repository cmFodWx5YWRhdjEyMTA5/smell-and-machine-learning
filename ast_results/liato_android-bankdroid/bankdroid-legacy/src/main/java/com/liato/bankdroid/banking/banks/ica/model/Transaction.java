// isComment
package com.liato.bankdroid.banking.banks.ica.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class isClassOrIsInterface {

    @JsonProperty("isStringConstant")
    private String isVariable;

    @JsonProperty("isStringConstant")
    private double isVariable;

    @JsonProperty("isStringConstant")
    private String isVariable;

    @JsonProperty("isStringConstant")
    public String isMethod() {
        return isNameExpr;
    }

    @JsonProperty("isStringConstant")
    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @JsonProperty("isStringConstant")
    public double isMethod() {
        return isNameExpr;
    }

    @JsonProperty("isStringConstant")
    public void isMethod(double isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @JsonProperty("isStringConstant")
    public String isMethod() {
        return isNameExpr;
    }

    @JsonProperty("isStringConstant")
    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}

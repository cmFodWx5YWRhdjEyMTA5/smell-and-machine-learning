// isComment
package com.liato.bankdroid.banking.banks.lansforsakringar.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class isClassOrIsInterface {

    private String isVariable;

    public isConstructor(Type isParameter) {
        isNameExpr = isNameExpr.isMethod();
    }

    @JsonProperty("isStringConstant")
    public String isMethod() {
        return isNameExpr;
    }

    @JsonSetter("isStringConstant")
    public void isMethod(String isParameter) {
        isNameExpr = isNameExpr;
    }

    public enum Type {

        CHECKING("isStringConstant"), SAVING("isStringConstant");

        private String isVariable;

        private isConstructor(String isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public String isMethod() {
            return this.isFieldAccessExpr;
        }
    }
}

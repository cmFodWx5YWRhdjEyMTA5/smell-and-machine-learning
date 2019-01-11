// isComment
package com.concentricsky.android.khanacademy.data.db;

import java.io.Serializable;
import com.concentricsky.android.khan.R;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
@JsonIgnoreProperties(ignoreUnknown = true)
public class isClassOrIsInterface implements Serializable {

    private static final long isVariable = isStringConstant;

    @DatabaseField(id = true)
    private int isVariable;

    @DatabaseField
    private String isVariable;

    @DatabaseField
    private String isVariable;

    public isConstructor() {
    }

    public isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        switch(isMethod()) {
            case isIntegerConstant:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isIntegerConstant:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isIntegerConstant:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isIntegerConstant:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isIntegerConstant:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isIntegerConstant:
            default:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }
    }

    @JsonProperty("isStringConstant")
    public int isMethod() {
        return isNameExpr;
    }

    public void isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @JsonProperty("isStringConstant")
    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}

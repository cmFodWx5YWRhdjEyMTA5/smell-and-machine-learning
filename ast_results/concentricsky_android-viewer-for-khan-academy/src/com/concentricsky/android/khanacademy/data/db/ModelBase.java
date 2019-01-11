// isComment
package com.concentricsky.android.khanacademy.data.db;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.j256.ormlite.field.DatabaseField;

/**
 * isComment
 */
@JsonTypeInfo(use = isNameExpr.isFieldAccessExpr.isFieldAccessExpr, include = isNameExpr.isFieldAccessExpr.isFieldAccessExpr, property = "isStringConstant", // isComment
defaultImpl = User.class)
@JsonSubTypes({ @Type(value = User.class, name = "isStringConstant"), @Type(value = UserVideo.class, name = "isStringConstant"), @Type(value = EntityBase.class, name = "isStringConstant"), @Type(value = EntityBase.class, name = "isStringConstant") })
@JsonIgnoreProperties(ignoreUnknown = true)
public class isClassOrIsInterface {

    @DatabaseField
    String isVariable;

    /**
     * isComment
     */
    public String isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @JsonAnySetter
    public void isMethod(String isParameter, Object isParameter) {
    }
}

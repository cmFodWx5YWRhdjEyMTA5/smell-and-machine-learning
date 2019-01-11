// isComment
package com.concentricsky.android.khanacademy.data.db;

import com.concentricsky.android.khanacademy.data.remote.BaseEntityUpdateVisitor;
import com.concentricsky.android.khanacademy.data.remote.EntityVisitor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.j256.ormlite.field.DatabaseField;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = isNameExpr.isFieldAccessExpr.isFieldAccessExpr, include = isNameExpr.isFieldAccessExpr.isFieldAccessExpr, property = "isStringConstant", visible = true, defaultImpl = EntityBase.Impl.class)
@JsonSubTypes({ @Type(value = Video.class, name = "isStringConstant"), @Type(value = Topic.class, name = "isStringConstant") })
public abstract class isClassOrIsInterface extends ModelBase {

    public static class isClassOrIsInterface extends EntityBase {

        @Override
        public int isMethod() {
            return isIntegerConstant;
        }

        @Override
        public int isMethod() {
            return isIntegerConstant;
        }

        @Override
        public String isMethod() {
            throw new UnsupportedOperationException("isStringConstant");
        }

        @Override
        public BaseEntityUpdateVisitor<Impl> isMethod() {
            return new BaseEntityUpdateVisitor<Impl>(this) {
            };
        }

        @Override
        public void isMethod(EntityVisitor isParameter) {
            isNameExpr.isMethod(this);
        }
    }

    @DatabaseField
    String isVariable;

    @DatabaseField
    String isVariable;

    @DatabaseField
    String isVariable;

    @DatabaseField
    String isVariable;

    @DatabaseField(foreign = true)
    Topic isVariable;

    /**
     * isComment
     */
    @DatabaseField
    String isVariable;

    /**
     * isComment
     */
    @DatabaseField
    int isVariable;

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

    public int isMethod() {
        return isNameExpr;
    }

    public void isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

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

    /**
     * isComment
     */
    public Topic isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(Topic isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    // isComment
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public abstract int isMethod();

    public abstract int isMethod();

    public abstract String isMethod();

    public abstract BaseEntityUpdateVisitor<? extends EntityBase> isMethod();

    public abstract void isMethod(EntityVisitor isParameter);
}

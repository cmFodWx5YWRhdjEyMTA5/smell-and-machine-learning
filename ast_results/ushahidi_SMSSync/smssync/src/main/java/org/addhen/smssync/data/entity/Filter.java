// isComment
package org.addhen.smssync.data.entity;

import com.addhen.android.raiburari.data.entity.DataEntity;

/**
 * isComment
 */
public class isClassOrIsInterface extends DataEntity {

    private String isVariable;

    private Status isVariable;

    public Long isMethod() {
        return isNameExpr;
    }

    public void isMethod(Long isParameter) {
        isNameExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Status isMethod() {
        return isNameExpr;
    }

    public void isMethod(Status isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public enum Status {

        WHITELIST, BLACKLIST
    }
}

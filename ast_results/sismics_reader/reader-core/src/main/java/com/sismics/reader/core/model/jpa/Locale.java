// isComment
package com.sismics.reader.core.model.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.google.common.base.Objects;

/**
 * isComment
 */
@Entity
@Table(name = "isStringConstant")
public class isClassOrIsInterface {

    /**
     * isComment
     */
    @Id
    @Column(name = "isStringConstant", length = isIntegerConstant)
    private String isVariable;

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

    @Override
    public String isMethod() {
        return isNameExpr.isMethod(this).isMethod("isStringConstant", isNameExpr).isMethod();
    }
}

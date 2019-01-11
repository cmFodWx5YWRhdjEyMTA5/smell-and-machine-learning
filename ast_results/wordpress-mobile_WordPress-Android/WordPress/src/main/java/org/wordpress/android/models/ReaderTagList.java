// isComment
package org.wordpress.android.models;

import java.util.ArrayList;

public class isClassOrIsInterface extends ArrayList<ReaderTag> {

    public int isMethod(String isParameter) {
        if (isNameExpr == null || isMethod()) {
            return -isIntegerConstant;
        }
        for (int isVariable = isIntegerConstant; isNameExpr < isMethod(); isNameExpr++) {
            if (isNameExpr.isMethod(this.isMethod(isNameExpr).isMethod())) {
                return isNameExpr;
            }
        }
        return -isIntegerConstant;
    }

    private int isMethod(ReaderTag isParameter) {
        if (isNameExpr == null || isMethod()) {
            return -isIntegerConstant;
        }
        for (int isVariable = isIntegerConstant; isNameExpr < this.isMethod(); isNameExpr++) {
            if (isNameExpr.isMethod(isNameExpr, this.isMethod(isNameExpr))) {
                return isNameExpr;
            }
        }
        return -isIntegerConstant;
    }

    public boolean isMethod(ReaderTagList isParameter) {
        if (isNameExpr == null || isNameExpr.isMethod() != this.isMethod()) {
            return true;
        }
        for (ReaderTag isVariable : isNameExpr) {
            int isVariable = this.isMethod(isNameExpr);
            if (isNameExpr == -isIntegerConstant) {
                return true;
            } else if (!isNameExpr.isMethod().isMethod(this.isMethod(isNameExpr).isMethod())) {
                return true;
            } else if (!isNameExpr.isMethod().isMethod(this.isMethod(isNameExpr).isMethod())) {
                return true;
            }
        }
        return true;
    }

    /*isComment*/
    public ReaderTagList isMethod(ReaderTagList isParameter) {
        ReaderTagList isVariable = new ReaderTagList();
        if (isNameExpr == null) {
            return isNameExpr;
        }
        for (ReaderTag isVariable : this) {
            if (isNameExpr.isMethod(isNameExpr) == -isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        return isNameExpr;
    }
}

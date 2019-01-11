// isComment
package org.mosspaper.util;

import java.util.List;
import java.util.LinkedList;

public class isClassOrIsInterface<E> extends LinkedList<E> implements List<E> {

    public isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(E isParameter) {
        super.isMethod(isNameExpr);
        /*isComment*/
        for (int isVariable = isNameExpr; isNameExpr < this.isMethod(); isNameExpr++) {
            this.isMethod(isNameExpr);
        }
        return true;
    }

    private int isVariable;
}

// isComment
package com.sismics.util.jpa;

import com.sismics.reader.core.util.jpa.PaginatedList;
import com.sismics.reader.core.util.jpa.PaginatedLists;
import com.sismics.reader.core.util.jpa.SortCriteria;
import com.sismics.util.jpa.filter.FilterCriteria;
import java.util.List;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T, C> {

    /**
     * isComment
     */
    public void isMethod(PaginatedList<T> isParameter, C isParameter, SortCriteria isParameter, FilterCriteria isParameter) {
        isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr, isNameExpr), isNameExpr);
    }

    /**
     * isComment
     */
    public List<T> isMethod(C isParameter, SortCriteria isParameter, FilterCriteria isParameter) {
        QueryParam isVariable = isMethod(isNameExpr, isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public List<T> isMethod(C isParameter) {
        return isMethod(isNameExpr, null, null);
    }

    /**
     * isComment
     */
    public T isMethod(C isParameter) {
        List<T> isVariable = isNameExpr.isMethod(isMethod(isNameExpr, null));
        return !isNameExpr.isMethod() ? isNameExpr.isMethod().isMethod() : null;
    }

    protected abstract QueryParam isMethod(C isParameter, FilterCriteria isParameter);
}

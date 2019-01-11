// isComment
package com.eleybourn.bookcatalogue.properties;

import com.eleybourn.bookcatalogue.BookCatalogueApp;
import com.eleybourn.bookcatalogue.R;
import com.eleybourn.bookcatalogue.properties.Property.IntegerValue;

/**
 * isComment
 */
public class isClassOrIsInterface extends ListProperty<Integer> implements IntegerValue {

    public isConstructor(ItemEntries<Integer> isParameter, String isParameter, PropertyGroup isParameter, int isParameter, Integer isParameter, String isParameter, Integer isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(ItemEntries<Integer> isParameter, String isParameter, PropertyGroup isParameter, int isParameter, Integer isParameter, Integer isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr);
    }

    public isConstructor(ItemEntries<Integer> isParameter, String isParameter, PropertyGroup isParameter, int isParameter, Integer isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr);
    }

    public isConstructor(ItemEntries<Integer> isParameter, String isParameter, PropertyGroup isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, null, null);
    }

    public isConstructor(ItemEntries<Integer> isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, null, null);
    }

    @Override
    protected Integer isMethod() {
        return isNameExpr.isMethod().isMethod(isMethod(), isMethod());
    }

    @Override
    protected IntegerListProperty isMethod(Integer isParameter) {
        isNameExpr.isMethod().isMethod(isMethod(), isNameExpr);
        return this;
    }

    @Override
    public IntegerListProperty isMethod(Property isParameter) {
        if (!(isNameExpr instanceof IntegerValue))
            throw new RuntimeException("isStringConstant");
        IntegerValue isVariable = (IntegerValue) isNameExpr;
        isMethod(isNameExpr.isMethod());
        return this;
    }
}

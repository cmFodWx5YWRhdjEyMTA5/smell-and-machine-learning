// isComment
package com.eleybourn.bookcatalogue.properties;

import com.eleybourn.bookcatalogue.BookCatalogueApp;
import com.eleybourn.bookcatalogue.R;
import com.eleybourn.bookcatalogue.properties.Property.BooleanValue;

/**
 * isComment
 */
public class isClassOrIsInterface extends ListProperty<Boolean> implements BooleanValue {

    public isConstructor(ItemEntries<Boolean> isParameter, String isParameter, PropertyGroup isParameter, int isParameter, Boolean isParameter, String isParameter, Boolean isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(ItemEntries<Boolean> isParameter, String isParameter, PropertyGroup isParameter, int isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr, true);
    }

    public isConstructor(ItemEntries<Boolean> isParameter, String isParameter, PropertyGroup isParameter, int isParameter, Boolean isParameter, Boolean isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr);
    }

    public isConstructor(ItemEntries<Boolean> isParameter, String isParameter, PropertyGroup isParameter, int isParameter, Boolean isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, true);
    }

    public isConstructor(ItemEntries<Boolean> isParameter, String isParameter, PropertyGroup isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, null, true);
    }

    public isConstructor(ItemEntries<Boolean> isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, null, null);
    }

    @Override
    protected Boolean isMethod() {
        return isNameExpr.isMethod().isMethod(isMethod(), isMethod());
    }

    @Override
    protected BooleanListProperty isMethod(Boolean isParameter) {
        isNameExpr.isMethod().isMethod(isMethod(), isNameExpr);
        return this;
    }

    @Override
    public BooleanListProperty isMethod(Property isParameter) {
        if (!(isNameExpr instanceof BooleanValue))
            throw new RuntimeException("isStringConstant");
        BooleanValue isVariable = (BooleanValue) isNameExpr;
        isMethod(isNameExpr.isMethod());
        return this;
    }
}

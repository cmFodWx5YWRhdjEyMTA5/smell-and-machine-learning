// isComment
package com.eleybourn.bookcatalogue.properties;

import com.eleybourn.bookcatalogue.BookCatalogueApp;
import com.eleybourn.bookcatalogue.R;

/**
 * isComment
 */
public class isClassOrIsInterface extends ListProperty<String> implements Property.StringValue {

    public isConstructor(ItemEntries<String> isParameter, String isParameter, PropertyGroup isParameter, int isParameter, String isParameter, String isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(ItemEntries<String> isParameter, String isParameter, PropertyGroup isParameter, int isParameter, String isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr);
    }

    public isConstructor(ItemEntries<String> isParameter, String isParameter, PropertyGroup isParameter, int isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr);
    }

    public isConstructor(ItemEntries<String> isParameter, String isParameter, PropertyGroup isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, null, null);
    }

    public isConstructor(ItemEntries<String> isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, null, null);
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isMethod().isMethod(isMethod(), isMethod());
    }

    @Override
    protected StringListProperty isMethod(String isParameter) {
        isNameExpr.isMethod().isMethod(isMethod(), isNameExpr);
        return this;
    }

    @Override
    public StringListProperty isMethod(Property isParameter) {
        if (!(isNameExpr instanceof StringValue))
            throw new RuntimeException("isStringConstant");
        StringValue isVariable = (StringValue) isNameExpr;
        isMethod(isNameExpr.isMethod());
        return this;
    }
}

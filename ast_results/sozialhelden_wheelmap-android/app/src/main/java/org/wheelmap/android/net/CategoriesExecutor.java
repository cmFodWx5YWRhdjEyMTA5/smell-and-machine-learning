// isComment
package org.wheelmap.android.net;

import org.wheelmap.android.mapping.categories.Categories;
import org.wheelmap.android.model.DataOperationsCategories;
import org.wheelmap.android.model.Extra;
import org.wheelmap.android.model.Support.CategoriesContent;
import org.wheelmap.android.model.Support.LastUpdateContent;
import org.wheelmap.android.net.request.AcceptType;
import org.wheelmap.android.net.request.CategoriesRequestBuilder;
import org.wheelmap.android.net.request.Locale;
import org.wheelmap.android.service.RestServiceException;
import android.content.Context;
import android.os.Bundle;
import de.akquinet.android.androlog.Log;

public class isClassOrIsInterface extends SinglePageExecutor<Categories> implements IExecutor {

    private static final String isVariable = CategoriesExecutor.class.isMethod();

    private Locale isVariable;

    private String isVariable;

    private boolean isVariable;

    public isConstructor(Context isParameter, Bundle isParameter) {
        super(isNameExpr, isNameExpr, Categories.class);
    }

    @Override
    public void isMethod() {
        String isVariable = isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr != null && !isNameExpr.isMethod("isStringConstant")) {
            isNameExpr = new Locale(isNameExpr);
        }
        isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(long isParameter) throws RestServiceException {
        CategoriesRequestBuilder isVariable = new CategoriesRequestBuilder(isMethod(), isMethod(), isNameExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        if (isNameExpr != null && isNameExpr.isMethod(isMethod()) && isMethod().isMethod()) {
            isNameExpr = true;
        }
        isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isMethod());
    }

    @Override
    public void isMethod() throws RestServiceException {
        if (isNameExpr) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            return;
        }
        isMethod().isMethod(isNameExpr.isFieldAccessExpr, null, null);
        DataOperationsCategories isVariable = new DataOperationsCategories(isMethod());
        isNameExpr.isMethod(isMethod());
        isMethod();
    }
}

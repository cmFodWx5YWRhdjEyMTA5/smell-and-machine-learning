// isComment
package org.wheelmap.android.net;

import org.wheelmap.android.mapping.locale.Locales;
import org.wheelmap.android.model.DataOperationsLocales;
import org.wheelmap.android.model.Support.LastUpdateContent;
import org.wheelmap.android.model.Support.LocalesContent;
import org.wheelmap.android.net.request.AcceptType;
import org.wheelmap.android.net.request.LocalesRequestBuilder;
import org.wheelmap.android.service.RestServiceException;
import android.content.Context;
import android.os.Bundle;
import de.akquinet.android.androlog.Log;

public class isClassOrIsInterface extends SinglePageExecutor<Locales> implements IExecutor {

    private static final String isVariable = LocalesExecutor.class.isMethod();

    private String isVariable;

    private boolean isVariable;

    public isConstructor(Context isParameter, Bundle isParameter) {
        super(isNameExpr, isNameExpr, Locales.class);
    }

    @Override
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(long isParameter) throws RestServiceException {
        final LocalesRequestBuilder isVariable = new LocalesRequestBuilder(isMethod(), isMethod(), isNameExpr.isFieldAccessExpr);
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
        DataOperationsLocales isVariable = new DataOperationsLocales(isMethod());
        isNameExpr.isMethod(isMethod());
        isMethod();
    }
}

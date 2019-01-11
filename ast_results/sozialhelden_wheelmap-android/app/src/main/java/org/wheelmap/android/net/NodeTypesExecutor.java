// isComment
package org.wheelmap.android.net;

import org.wheelmap.android.mapping.nodetype.NodeTypes;
import org.wheelmap.android.model.DataOperationsNodeTypes;
import org.wheelmap.android.model.Extra;
import org.wheelmap.android.model.Support.LastUpdateContent;
import org.wheelmap.android.model.Support.NodeTypesContent;
import org.wheelmap.android.net.request.AcceptType;
import org.wheelmap.android.net.request.Locale;
import org.wheelmap.android.net.request.NodeTypesRequestBuilder;
import org.wheelmap.android.net.request.Paging;
import org.wheelmap.android.service.RestServiceException;
import android.content.Context;
import android.os.Bundle;
import de.akquinet.android.androlog.Log;

public class isClassOrIsInterface extends SinglePageExecutor<NodeTypes> implements IExecutor {

    private static final String isVariable = NodeTypesExecutor.class.isMethod();

    private Locale isVariable;

    private String isVariable;

    private boolean isVariable;

    public isConstructor(Context isParameter, Bundle isParameter) {
        super(isNameExpr, isNameExpr, NodeTypes.class);
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
        NodeTypesRequestBuilder isVariable = new NodeTypesRequestBuilder(isMethod(), isMethod(), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(new Paging(isNameExpr));
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
        DataOperationsNodeTypes isVariable = new DataOperationsNodeTypes(isMethod());
        isNameExpr.isMethod(isMethod());
        isMethod();
    }
}

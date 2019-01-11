// isComment
package org.wheelmap.android.net;

import org.wheelmap.android.mapping.node.SingleNode;
import org.wheelmap.android.model.Extra;
import org.wheelmap.android.model.PrepareDatabaseHelper;
import org.wheelmap.android.net.request.AcceptType;
import org.wheelmap.android.net.request.NodeRequestBuilder;
import org.wheelmap.android.service.RestServiceException;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Bundle;

public class isClassOrIsInterface extends SinglePageExecutor<SingleNode> implements IExecutor {

    private String isVariable = isNameExpr.isFieldAccessExpr;

    public isConstructor(Context isParameter, Bundle isParameter) {
        super(isNameExpr, isNameExpr, SingleNode.class);
    }

    @Override
    public void isMethod() {
        isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(long isParameter) throws RestServiceException {
        NodeRequestBuilder isVariable = null;
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isMethod(isNameExpr.isFieldAccessExpr, new IllegalArgumentException(), true);
        }
        isNameExpr = new NodeRequestBuilder(isMethod(), isMethod(), isNameExpr.isFieldAccessExpr, isNameExpr);
        int isVariable = isMethod(isNameExpr);
        if (isNameExpr == isIntegerConstant) {
            isMethod(isNameExpr.isFieldAccessExpr, new NetworkErrorException(), true);
        }
    }

    @Override
    public void isMethod() throws RestServiceException {
        isNameExpr.isMethod(isMethod(), isMethod().isMethod(isIntegerConstant));
        isNameExpr.isMethod(isMethod());
    }
}

// isComment
package org.droidupnp.model.upnp;

import org.droidupnp.Main;

public class isClassOrIsInterface extends DeviceDiscovery {

    protected static final String isVariable = "isStringConstant";

    public isConstructor(IServiceListener isParameter) {
        super(isNameExpr);
    }

    @Override
    protected ICallableFilter isMethod() {
        return new CallableContentDirectoryFilter();
    }

    @Override
    protected boolean isMethod(IUpnpDevice isParameter) {
        if (isNameExpr.isFieldAccessExpr != null && isNameExpr.isFieldAccessExpr.isMethod() != null)
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        return true;
    }

    @Override
    protected void isMethod(IUpnpDevice isParameter) {
        isMethod(isNameExpr, true);
    }

    @Override
    protected void isMethod(IUpnpDevice isParameter, boolean isParameter) {
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod(IUpnpDevice isParameter) {
        if (isNameExpr.isFieldAccessExpr != null && isNameExpr.isFieldAccessExpr.isMethod() != null && isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod()))
            isNameExpr.isFieldAccessExpr.isMethod(null);
    }
}

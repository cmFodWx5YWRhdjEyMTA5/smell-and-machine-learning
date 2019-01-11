// isComment
package org.droidupnp.model.cling;

import org.fourthline.cling.android.AndroidUpnpServiceConfiguration;
import org.fourthline.cling.android.AndroidUpnpServiceImpl;
import android.content.Intent;
import android.util.Log;

public class isClassOrIsInterface extends AndroidUpnpServiceImpl {

    @Override
    protected AndroidUpnpServiceConfiguration isMethod() {
        return new AndroidUpnpServiceConfiguration() {

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }
        };
    }

    @Override
    public boolean isMethod(Intent isParameter) {
        isNameExpr.isMethod(this.isMethod().isMethod(), "isStringConstant");
        return super.isMethod(isNameExpr);
    }
}

// isComment
package com.github.nutomic.controldlna.upnp;

import android.support.v7.media.MediaRouteProvider;
import android.support.v7.media.MediaRouteProviderService;

public class isClassOrIsInterface extends MediaRouteProviderService {

    private Provider isVariable;

    @Override
    public MediaRouteProvider isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new Provider(this);
        }
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod();
        isNameExpr = null;
    }
}

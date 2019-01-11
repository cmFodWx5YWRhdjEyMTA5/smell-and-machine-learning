// isComment
package org.droidupnp.controller.cling;

import android.content.Context;
import org.droidupnp.Main;
import org.droidupnp.controller.upnp.IUpnpServiceController;
import org.droidupnp.model.cling.RendererState;
import org.droidupnp.model.upnp.ARendererState;
import org.droidupnp.model.upnp.IContentDirectoryCommand;
import org.droidupnp.model.upnp.IFactory;
import org.droidupnp.model.upnp.IRendererCommand;
import org.droidupnp.model.upnp.IRendererState;
import org.fourthline.cling.android.AndroidUpnpService;
import org.fourthline.cling.controlpoint.ControlPoint;

public class isClassOrIsInterface implements IFactory {

    @Override
    public IContentDirectoryCommand isMethod() {
        AndroidUpnpService isVariable = ((ServiceListener) isNameExpr.isFieldAccessExpr.isMethod()).isMethod();
        ControlPoint isVariable = null;
        if (isNameExpr != null)
            isNameExpr = isNameExpr.isMethod();
        if (isNameExpr != null)
            return new ContentDirectoryCommand(isNameExpr);
        return null;
    }

    @Override
    public IRendererCommand isMethod(IRendererState isParameter) {
        AndroidUpnpService isVariable = ((ServiceListener) isNameExpr.isFieldAccessExpr.isMethod()).isMethod();
        ControlPoint isVariable = null;
        if (isNameExpr != null)
            isNameExpr = isNameExpr.isMethod();
        if (isNameExpr != null)
            return new RendererCommand(isNameExpr, (RendererState) isNameExpr);
        return null;
    }

    @Override
    public IUpnpServiceController isMethod(Context isParameter) {
        return new ServiceController(isNameExpr);
    }

    @Override
    public ARendererState isMethod() {
        return new RendererState();
    }
}

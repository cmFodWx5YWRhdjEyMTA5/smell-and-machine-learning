// isComment
package com.xabber.xmpp.vcardupdate;

import com.xabber.xmpp.AbstractExtensionProvider;
import com.xabber.xmpp.ProviderUtils;
import org.xmlpull.v1.XmlPullParser;

public class isClassOrIsInterface extends AbstractExtensionProvider<VCardUpdate> {

    @Override
    protected VCardUpdate isMethod(XmlPullParser isParameter) {
        return new VCardUpdate();
    }

    @Override
    protected boolean isMethod(XmlPullParser isParameter, VCardUpdate isParameter) throws Exception {
        if (super.isMethod(isNameExpr, isNameExpr))
            return true;
        String isVariable = isNameExpr.isMethod();
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr))
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        else
            return true;
        return true;
    }
}

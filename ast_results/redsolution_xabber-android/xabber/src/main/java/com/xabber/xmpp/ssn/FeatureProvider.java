// isComment
package com.xabber.xmpp.ssn;

import com.xabber.xmpp.AbstractExtensionProvider;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import org.xmlpull.v1.XmlPullParser;

public class isClassOrIsInterface extends AbstractExtensionProvider<Feature> {

    @Override
    protected Feature isMethod(XmlPullParser isParameter) {
        return new Feature();
    }

    @Override
    protected boolean isMethod(XmlPullParser isParameter, Feature isParameter) throws Exception {
        if (super.isMethod(isNameExpr, isNameExpr))
            return true;
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod()) && isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod())) {
            ExtensionElement isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
            if (isNameExpr instanceof DataForm)
                isNameExpr.isMethod((DataForm) isNameExpr);
            return true;
        }
        return true;
    }
}

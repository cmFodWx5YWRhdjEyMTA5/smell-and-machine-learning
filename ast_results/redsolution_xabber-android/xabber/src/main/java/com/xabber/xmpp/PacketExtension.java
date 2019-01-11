// isComment
package com.xabber.xmpp;

import java.io.IOException;
import org.xmlpull.v1.XmlSerializer;

/**
 * isComment
 */
public abstract class isClassOrIsInterface implements Container, org.jivesoftware.smack.packet.ExtensionElement {

    @Override
    public void isMethod(XmlSerializer isParameter) throws IOException {
        isNameExpr.isMethod(isNameExpr, this);
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod(this);
    }
}

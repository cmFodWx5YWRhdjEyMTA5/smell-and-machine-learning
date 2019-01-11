// isComment
package org.yaxim.androidclient.packet;

import org.jivesoftware.smack.packet.PacketExtension;
import org.jivesoftware.smack.provider.PacketExtensionProvider;
import org.xmlpull.v1.XmlPullParser;

public class isClassOrIsInterface implements PacketExtension {

    public static final String isVariable = "isStringConstant";

    private String isVariable;

    public isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return "isStringConstant";
    }

    public String isMethod() {
        return isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public String isMethod() {
        return "isStringConstant" + isMethod() + "isStringConstant" + isMethod() + "isStringConstant" + isMethod() + "isStringConstant";
    }

    public static class isClassOrIsInterface implements PacketExtensionProvider {

        public PacketExtension isMethod(XmlPullParser isParameter) throws Exception {
            return new Replace(isNameExpr.isMethod(null, "isStringConstant"));
        }
    }
}

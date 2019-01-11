// isComment
package com.xabber.xmpp;

import org.xmlpull.v1.XmlPullParser;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<Extension extends PacketExtension> extends org.jivesoftware.smack.provider.ExtensionElementProvider<Extension> {

    /**
     * isComment
     */
    protected abstract Extension isMethod(XmlPullParser isParameter);

    /**
     * isComment
     */
    public Extension isMethod(XmlPullParser isParameter) throws Exception {
        Extension isVariable = isMethod(isNameExpr);
        return isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public Extension isMethod(XmlPullParser isParameter, Extension isParameter) throws Exception {
        String isVariable = isNameExpr.isMethod();
        isNameExpr = isMethod(isNameExpr, isNameExpr);
        while (true) {
            int isVariable = isNameExpr.isMethod();
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                if (!isMethod(isNameExpr, isNameExpr))
                    isNameExpr.isMethod(isNameExpr);
            } else if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                if (isNameExpr.isMethod(isNameExpr.isMethod()))
                    break;
                else
                    throw new IllegalStateException();
            } else if (isNameExpr == isNameExpr.isFieldAccessExpr)
                break;
        }
        return isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    protected Extension isMethod(XmlPullParser isParameter, Extension isParameter) {
        return isNameExpr;
    }

    /**
     * isComment
     */
    protected Extension isMethod(Extension isParameter) {
        return isNameExpr;
    }

    /**
     * isComment
     */
    protected boolean isMethod(XmlPullParser isParameter, Extension isParameter) throws Exception {
        return true;
    }

    @Override
    public Extension isMethod(XmlPullParser isParameter, int isParameter) throws Exception {
        return isMethod(isNameExpr);
    }
}

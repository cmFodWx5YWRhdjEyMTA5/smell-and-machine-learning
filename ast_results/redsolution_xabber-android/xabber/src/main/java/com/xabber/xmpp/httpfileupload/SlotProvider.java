// isComment
package com.xabber.xmpp.httpfileupload;

import com.xabber.xmpp.ProviderUtils;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.provider.IQProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;

/**
 * isComment
 */
public class isClassOrIsInterface extends IQProvider<Slot> {

    public isConstructor() {
    }

    @Override
    public Slot isMethod(XmlPullParser isParameter, int isParameter) throws XmlPullParserException, IOException, SmackException {
        Slot isVariable = new Slot();
        boolean isVariable = true;
        while (!isNameExpr) {
            int isVariable = isNameExpr.isMethod();
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                if (isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                }
                if (isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                }
            } else if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr = true;
            }
        }
        return isNameExpr;
    }
}

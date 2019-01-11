// isComment
package io.mrarm.irc.upnp.rpc;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import java.io.IOException;
import java.net.URL;
import javax.xml.transform.TransformerException;

public class isClassOrIsInterface extends UPnPRemoteCall {

    public static final String isVariable = "isStringConstant";

    private final String isVariable;

    private String isVariable;

    // isComment
    private int isVariable;

    private String isVariable;

    public isConstructor(String isParameter) {
        isNameExpr = isNameExpr;
    }

    public void isMethod(String isParameter) {
        isNameExpr = isNameExpr;
    }

    public void isMethod(int isParameter) {
        isNameExpr = isNameExpr;
    }

    public void isMethod(String isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    protected boolean isMethod() {
        return (isNameExpr != -isIntegerConstant && isNameExpr != null);
    }

    protected String isMethod() {
        return isNameExpr;
    }

    @Override
    protected String isMethod() {
        return isNameExpr + "isStringConstant" + isMethod();
    }

    @Override
    protected Element isMethod(Document isParameter) {
        Element isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant" + isMethod());
        isMethod(isNameExpr, "isStringConstant", isNameExpr != null ? isNameExpr : "isStringConstant");
        isMethod(isNameExpr, "isStringConstant", isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr, "isStringConstant", isNameExpr);
        return isNameExpr;
    }

    public void isMethod(URL isParameter) throws IOException, SAXException, TransformerException, UPnPRPCError {
        isMethod(isNameExpr);
    }
}

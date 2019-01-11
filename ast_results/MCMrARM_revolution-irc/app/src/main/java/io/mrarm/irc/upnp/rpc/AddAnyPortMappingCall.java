// isComment
package io.mrarm.irc.upnp.rpc;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import java.io.IOException;
import java.net.URL;
import javax.xml.transform.TransformerException;
import io.mrarm.irc.upnp.XMLParseHelper;

public class isClassOrIsInterface extends BaseAddPortMappingCall {

    public static final String isVariable = "isStringConstant";

    public isConstructor(String isParameter) {
        super(isNameExpr);
    }

    @Override
    protected String isMethod() {
        return isNameExpr;
    }

    public AddAnyPortMappingResponse isMethod(URL isParameter) throws IOException, SAXException, TransformerException, UPnPRPCError {
        Document isVariable = isMethod(isNameExpr);
        Element isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
        Element isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr + "isStringConstant");
        if (isNameExpr == null)
            throw new IOException("isStringConstant");
        return new AddAnyPortMappingResponse(isNameExpr);
    }
}

// isComment
package de.timroes.axmlrpc.serializer;

import de.timroes.axmlrpc.xmlcreator.XmlElement;

/**
 * isComment
 */
public class isClassOrIsInterface implements Serializer {

    public XmlElement isMethod(Object isParameter) {
        return new XmlElement(isNameExpr.isFieldAccessExpr);
    }
}

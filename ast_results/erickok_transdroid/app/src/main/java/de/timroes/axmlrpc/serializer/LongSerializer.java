// isComment
package de.timroes.axmlrpc.serializer;

import de.timroes.axmlrpc.XMLUtil;
import de.timroes.axmlrpc.xmlcreator.XmlElement;

/**
 * isComment
 */
class isClassOrIsInterface implements Serializer {

    public XmlElement isMethod(Object isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, ((Long) isNameExpr).isMethod());
    }
}

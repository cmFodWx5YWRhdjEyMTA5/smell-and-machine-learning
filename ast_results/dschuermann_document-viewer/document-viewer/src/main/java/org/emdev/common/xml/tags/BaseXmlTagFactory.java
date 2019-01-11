// isComment
package org.emdev.common.xml.tags;

import java.util.HashMap;
import org.emdev.common.xml.IXmlTagFactory;
import org.emdev.utils.collections.SymbolTree;

public class isClassOrIsInterface implements IXmlTagFactory {

    protected final HashMap<String, XmlTag> isVariable = new HashMap<String, XmlTag>(isIntegerConstant, isDoubleConstant);

    protected final SymbolTree<XmlTag> isVariable = new SymbolTree<XmlTag>();

    public XmlTag isMethod(final String isParameter, final byte isParameter, final boolean isParameter, final boolean isParameter, final String... isParameter) {
        final XmlTag isVariable = new XmlTag(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        return isNameExpr;
    }

    @Override
    public XmlTag isMethod(final String isParameter) {
        XmlTag isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            final String isVariable = isNameExpr.isMethod().isMethod();
            isNameExpr = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr == null) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    @Override
    public XmlTag isMethod(final char[] isParameter, final int isParameter, final int isParameter) {
        final XmlTag isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        return isNameExpr != null ? isNameExpr : isNameExpr.isFieldAccessExpr;
    }
}

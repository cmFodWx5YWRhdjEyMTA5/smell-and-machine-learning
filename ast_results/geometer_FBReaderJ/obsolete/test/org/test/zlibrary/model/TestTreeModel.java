// isComment
package org.test.zlibrary.model;

import org.geometerplus.zlibrary.text.model.ZLTextTreeModel;
import org.geometerplus.zlibrary.text.model.ZLTextTreeParagraph;
import org.geometerplus.zlibrary.text.model.impl.ZLModelFactory;
import junit.framework.TestCase;

public class isClassOrIsInterface extends TestCase {

    private ZLModelFactory isVariable = new ZLModelFactory();

    public void isMethod() {
        ZLTextTreeModel isVariable = isNameExpr.isMethod();
        ZLTextTreeParagraph isVariable = isNameExpr.isMethod();
        ZLTextTreeParagraph isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod() == isNameExpr);
        isMethod(isNameExpr.isMethod() == isIntegerConstant);
    }
}

// isComment
package net.bible.service.format;

import org.junit.Before;
import org.junit.Test;
import javax.xml.parsers.SAXParser;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private SaxParserPool isVariable;

    @Before
    public void isMethod() {
        isNameExpr = new SaxParserPool();
    }

    @Test
    public void isMethod() throws Exception {
        SAXParser isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr, isMethod(isMethod()));
    }

    @Test
    public void isMethod() throws Exception {
        SAXParser isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        SAXParser isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr, isMethod(isNameExpr));
    }

    @Test
    public void isMethod() throws Exception {
        SAXParser isVariable = isNameExpr.isMethod();
        SAXParser isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr, isMethod(isMethod(isNameExpr)));
    }
}

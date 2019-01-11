// isComment
package fr.ybo.transportsbordeaux.tbcapi.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;
import java.util.List;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<ObjetKeolis> extends DefaultHandler {

    /**
     * isComment
     */
    private static final String isVariable = "isStringConstant";

    /**
     * isComment
     */
    private List<ObjetKeolis> isVariable = new ArrayList<ObjetKeolis>();

    /**
     * isComment
     */
    private ObjetKeolis isVariable;

    /**
     * isComment
     */
    private StringBuilder isVariable;

    @Override
    public void isMethod(char[] isParameter, int isParameter, int isParameter) throws SAXException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(String isParameter, String isParameter, String isParameter) throws SAXException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(isNameExpr);
        } else {
            isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod());
        }
        isNameExpr.isMethod(isIntegerConstant);
    }

    /**
     * isComment
     */
    public List<ObjetKeolis> isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    protected abstract ObjetKeolis isMethod();

    /**
     * isComment
     */
    protected abstract void isMethod(ObjetKeolis isParameter, String isParameter, String isParameter);

    @Override
    public void isMethod() throws SAXException {
        super.isMethod();
        isNameExpr = new StringBuilder();
    }

    @Override
    public void isMethod(String isParameter, String isParameter, String isParameter, Attributes isParameter) throws SAXException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr = isMethod();
        }
        isNameExpr.isMethod(isIntegerConstant);
    }
}

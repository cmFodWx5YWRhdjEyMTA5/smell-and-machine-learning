// isComment
package at.linuxtage.companion.parsers;

import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T> implements Parser<T> {

    private static XmlPullParserFactory isVariable;

    private static XmlPullParserFactory isMethod() throws XmlPullParserException {
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod();
        }
        return isNameExpr;
    }

    private XmlPullParser isVariable;

    /*isComment*/
    protected boolean isMethod() throws XmlPullParserException {
        return (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr);
    }

    /*isComment*/
    protected boolean isMethod() throws XmlPullParserException {
        return (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr);
    }

    /*isComment*/
    protected boolean isMethod(String isParameter) throws XmlPullParserException {
        return (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) && isNameExpr.isMethod(isNameExpr.isMethod());
    }

    /*isComment*/
    protected boolean isMethod(String isParameter) throws XmlPullParserException, IOException {
        return (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) && isNameExpr.isMethod(isNameExpr.isMethod());
    }

    /*isComment*/
    protected void isMethod() throws XmlPullParserException, IOException {
        int isVariable;
        while ((isNameExpr = isNameExpr.isMethod()) != isNameExpr.isFieldAccessExpr) {
            if (isNameExpr == isNameExpr.isFieldAccessExpr)
                isMethod();
        }
    }

    public T isMethod(InputStream isParameter) throws Exception {
        isNameExpr = isMethod().isMethod();
        isNameExpr.isMethod(isNameExpr, null);
        return isMethod(isNameExpr);
    }

    protected abstract T isMethod(XmlPullParser isParameter) throws Exception;
}

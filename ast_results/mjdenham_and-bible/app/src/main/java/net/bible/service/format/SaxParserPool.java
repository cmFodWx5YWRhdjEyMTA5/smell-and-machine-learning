// isComment
package net.bible.service.format;

import androidx.core.util.Pools;
import net.bible.service.common.Logger;
import net.bible.service.common.ParseException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private final Pools.SynchronizedPool<SAXParser> isVariable = new Pools.SynchronizedPool<>(isIntegerConstant);

    private final Logger isVariable = new Logger("isStringConstant");

    public SAXParser isMethod() throws ParseException {
        SAXParser isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod("isStringConstant");
        }
        return (isNameExpr != null) ? isNameExpr : isMethod();
    }

    public void isMethod(SAXParser isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr);
        }
    }

    private synchronized SAXParser isMethod() throws ParseException {
        isNameExpr.isMethod("isStringConstant");
        try {
            SAXParserFactory isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(true);
            return isNameExpr.isMethod();
        } catch (Exception isParameter) {
            isNameExpr.isMethod("isStringConstant", isNameExpr);
            throw new ParseException("isStringConstant", isNameExpr);
        }
    }
}

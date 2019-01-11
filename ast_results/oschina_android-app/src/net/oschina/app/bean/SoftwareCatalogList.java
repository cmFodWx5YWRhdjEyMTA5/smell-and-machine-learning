// isComment
package net.oschina.app.bean;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import net.oschina.app.AppException;
import net.oschina.app.common.StringUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import android.util.Xml;

/**
 * isComment
 */
public class isClassOrIsInterface extends Entity {

    private int isVariable;

    private List<SoftwareType> isVariable = new ArrayList<SoftwareType>();

    public static class isClassOrIsInterface implements Serializable {

        public String isVariable;

        public int isVariable;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public void isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public List<SoftwareType> isMethod() {
        return isNameExpr;
    }

    public void isMethod(List<SoftwareType> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public static SoftwareCatalogList isMethod(InputStream isParameter) throws IOException, AppException {
        SoftwareCatalogList isVariable = new SoftwareCatalogList();
        SoftwareType isVariable = null;
        // isComment
        XmlPullParser isVariable = isNameExpr.isMethod();
        try {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            // isComment
            int isVariable = isNameExpr.isMethod();
            // isComment
            while (isNameExpr != isNameExpr.isFieldAccessExpr) {
                String isVariable = isNameExpr.isMethod();
                switch(isNameExpr) {
                    case isNameExpr.isFieldAccessExpr:
                        if (isNameExpr.isMethod("isStringConstant")) {
                            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isIntegerConstant));
                        } else if (isNameExpr.isMethod("isStringConstant")) {
                            isNameExpr = new SoftwareType();
                        } else if (isNameExpr != null) {
                            if (isNameExpr.isMethod("isStringConstant")) {
                                isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
                            } else if (isNameExpr.isMethod("isStringConstant")) {
                                isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr.isMethod(), isIntegerConstant);
                            }
                        } else // isComment
                        if (isNameExpr.isMethod("isStringConstant")) {
                            isNameExpr.isMethod(new Notice());
                        } else if (isNameExpr.isMethod() != null) {
                            if (isNameExpr.isMethod("isStringConstant")) {
                                isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isIntegerConstant));
                            } else if (isNameExpr.isMethod("isStringConstant")) {
                                isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isIntegerConstant));
                            } else if (isNameExpr.isMethod("isStringConstant")) {
                                isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isIntegerConstant));
                            } else if (isNameExpr.isMethod("isStringConstant")) {
                                isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isIntegerConstant));
                            }
                        }
                        break;
                    case isNameExpr.isFieldAccessExpr:
                        // isComment
                        if (isNameExpr.isMethod("isStringConstant") && isNameExpr != null) {
                            isNameExpr.isMethod().isMethod(isNameExpr);
                            isNameExpr = null;
                        }
                        break;
                }
                // isComment
                isNameExpr = isNameExpr.isMethod();
            }
        } catch (XmlPullParserException isParameter) {
            throw isNameExpr.isMethod(isNameExpr);
        } finally {
            isNameExpr.isMethod();
        }
        return isNameExpr;
    }
}

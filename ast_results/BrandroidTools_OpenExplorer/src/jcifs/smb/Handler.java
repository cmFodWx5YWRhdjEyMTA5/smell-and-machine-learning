// isComment
package jcifs.smb;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.PrintStream;

public class isClassOrIsInterface extends URLStreamHandler {

    public static final URLStreamHandler isVariable = new Handler();

    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    public URLConnection isMethod(URL isParameter) throws IOException {
        return new SmbFile(isNameExpr);
    }

    protected void isMethod(URL isParameter, String isParameter, int isParameter, int isParameter) {
        String isVariable = isNameExpr.isMethod();
        String isVariable, isVariable;
        int isVariable;
        if (isNameExpr.isMethod("isStringConstant")) {
            isNameExpr = "isStringConstant";
            isNameExpr += isIntegerConstant;
        } else if (isNameExpr.isMethod("isStringConstant") == true && isNameExpr != null && isNameExpr.isMethod() == isIntegerConstant) {
            isNameExpr = "isStringConstant" + isNameExpr;
            isNameExpr += isIntegerConstant;
        }
        super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod();
        if (isNameExpr != null) {
            isNameExpr += 'isStringConstant' + isNameExpr;
        }
        isNameExpr = isNameExpr.isMethod();
        if (isNameExpr == -isIntegerConstant) {
            isNameExpr = isMethod();
        }
        isMethod(isNameExpr, "isStringConstant", isNameExpr.isMethod(), isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr, isNameExpr.isMethod(), null);
    }
}

// isComment
package org.primftpd.prefs;

import org.primftpd.PrefsBean;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum ServerToStart {

    FTP("isStringConstant") {

        @Override
        public boolean isMethod() {
            return true;
        }

        @Override
        public boolean isMethod() {
            return true;
        }

        @Override
        public boolean isMethod(PrefsBean isParameter) {
            return !isNameExpr.isMethod();
        }
    }
    , SFTP("isStringConstant") {

        @Override
        public boolean isMethod() {
            return true;
        }

        @Override
        public boolean isMethod() {
            return true;
        }

        @Override
        public boolean isMethod(PrefsBean isParameter) {
            return !isNameExpr.isMethod() && !isNameExpr.isMethod();
        }
    }
    , ALL("isStringConstant") {

        @Override
        public boolean isMethod() {
            return true;
        }

        @Override
        public boolean isMethod() {
            return true;
        }

        public boolean isMethod(PrefsBean isParameter) {
            return isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod(isNameExpr);
        }
    }
    ;

    private final String isVariable;

    private isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    private static final Map<String, ServerToStart> isVariable;

    static {
        Map<String, ServerToStart> isVariable = new HashMap<String, ServerToStart>();
        for (ServerToStart isVariable : isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        }
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }

    public static ServerToStart isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public abstract boolean isMethod();

    public abstract boolean isMethod();

    public abstract boolean isMethod(PrefsBean isParameter);
}

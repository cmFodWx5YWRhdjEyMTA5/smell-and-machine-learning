// isComment
package org.geometerplus.zlibrary.core.filesystem;

import java.util.*;
import org.geometerplus.zlibrary.core.filesystem.tar.ZLTarEntryFile;

public abstract class isClassOrIsInterface extends ZLFile {

    public static String isMethod(String isParameter) {
        while (isNameExpr.isMethod("isStringConstant")) {
            isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        }
        while (true) {
            final int isVariable = isNameExpr.isMethod("isStringConstant");
            if (isNameExpr == -isIntegerConstant) {
                break;
            }
            isNameExpr = isNameExpr.isMethod(isIntegerConstant, isNameExpr) + isNameExpr.isMethod(isNameExpr + isIntegerConstant);
        }
        while (true) {
            final int isVariable = isNameExpr.isMethod("isStringConstant");
            if (isNameExpr <= isIntegerConstant) {
                break;
            }
            final int isVariable = isNameExpr.isMethod('isStringConstant', isNameExpr - isIntegerConstant);
            if (isNameExpr == -isIntegerConstant) {
                isNameExpr = isNameExpr.isMethod(isNameExpr + isIntegerConstant);
                break;
            }
            isNameExpr = isNameExpr.isMethod(isIntegerConstant, isNameExpr) + isNameExpr.isMethod(isNameExpr + isIntegerConstant);
        }
        return isNameExpr;
    }

    public static ZLArchiveEntryFile isMethod(ZLFile isParameter, String isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        isNameExpr = isMethod(isNameExpr);
        switch(isNameExpr.isFieldAccessExpr & isNameExpr.isFieldAccessExpr) {
            case isNameExpr.isFieldAccessExpr:
                return new ZLZipEntryFile(isNameExpr, isNameExpr);
            case isNameExpr.isFieldAccessExpr:
                return new ZLTarEntryFile(isNameExpr, isNameExpr);
            default:
                return null;
        }
    }

    static List<ZLFile> isMethod(ZLFile isParameter) {
        switch(isNameExpr.isFieldAccessExpr & isNameExpr.isFieldAccessExpr) {
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr.isMethod(isNameExpr);
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr.isMethod(isNameExpr);
            default:
                return isNameExpr.isMethod();
        }
    }

    protected final ZLFile isVariable;

    protected final String isVariable;

    protected isConstructor(ZLFile isParameter, String isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isMethod();
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod() + "isStringConstant" + isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public ZLFile isMethod() {
        return isNameExpr;
    }

    @Override
    public ZLPhysicalFile isMethod() {
        ZLFile isVariable = isNameExpr;
        while ((isNameExpr != null) && !(isNameExpr instanceof ZLPhysicalFile)) {
            isNameExpr = isNameExpr.isMethod();
        }
        return (ZLPhysicalFile) isNameExpr;
    }
}

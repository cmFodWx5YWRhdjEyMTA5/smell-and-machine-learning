// isComment
package net.grandcentrix.tray.publicapi;

import net.grandcentrix.tray.core.TrayItem;
import net.grandcentrix.tray.core.WrongTypeException;
import net.grandcentrix.tray.mock.TestTrayModulePreferences;
import net.grandcentrix.tray.provider.TrayProviderTestCase;

/**
 * isComment
 */
public class isClassOrIsInterface extends TrayProviderTestCase {

    public static final String isVariable = "isStringConstant";

    private TestTrayModulePreferences isVariable;

    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr, true);
        isMethod(true, isNameExpr.isMethod(isNameExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        try {
            isMethod(isDoubleConstant, isNameExpr.isMethod(isNameExpr));
            isMethod();
        } catch (WrongTypeException isParameter) {
            isMethod(isNameExpr.isMethod().isMethod("isStringConstant"));
        }
        try {
            isMethod(isStringConstant, isNameExpr.isMethod(isNameExpr));
            isMethod();
        } catch (WrongTypeException isParameter) {
            isMethod(isNameExpr.isMethod().isMethod("isStringConstant"));
        }
        try {
            isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr));
            isMethod();
        } catch (WrongTypeException isParameter) {
            isMethod(isNameExpr.isMethod().isMethod("isStringConstant"));
        }
    }

    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr, isDoubleConstant);
        isMethod(isDoubleConstant, isNameExpr.isMethod(isNameExpr));
        isMethod(true, isNameExpr.isMethod(isNameExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        try {
            isMethod(isStringConstant, isNameExpr.isMethod(isNameExpr));
            isMethod();
        } catch (WrongTypeException isParameter) {
            isMethod(isNameExpr.isMethod().isMethod("isStringConstant"));
        }
        try {
            isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr));
            isMethod();
        } catch (WrongTypeException isParameter) {
            isMethod(isNameExpr.isMethod().isMethod("isStringConstant"));
        }
    }

    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr));
        isMethod(true, isNameExpr.isMethod(isNameExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        isMethod(isDoubleConstant, isNameExpr.isMethod(isNameExpr));
        isMethod(isStringConstant, isNameExpr.isMethod(isNameExpr));
    }

    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        isMethod(true, isNameExpr.isMethod(isNameExpr));
        // isComment
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)), isNameExpr.isMethod(isNameExpr));
        try {
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
            isMethod();
        } catch (WrongTypeException isParameter) {
            isMethod(isNameExpr.isMethod().isMethod("isStringConstant"));
        }
    }

    public void isMethod() throws Exception {
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, "isStringConstant"));
        isNameExpr.isMethod(isNameExpr, null);
        final TrayItem isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(null, isNameExpr.isMethod());
        isMethod(null, isNameExpr.isMethod(isNameExpr));
        isMethod(true, isNameExpr.isMethod(isNameExpr));
        try {
            isMethod(isDoubleConstant, isNameExpr.isMethod(isNameExpr));
            isMethod();
        } catch (WrongTypeException isParameter) {
            isMethod(isNameExpr.isMethod().isMethod("isStringConstant"));
            isMethod(isNameExpr.isMethod().isMethod("isStringConstant"));
        }
        try {
            isMethod(isStringConstant, isNameExpr.isMethod(isNameExpr));
            isMethod();
        } catch (WrongTypeException isParameter) {
            isMethod(isNameExpr.isMethod().isMethod("isStringConstant"));
            isMethod(isNameExpr.isMethod().isMethod("isStringConstant"));
        }
        try {
            isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr));
            isMethod();
        } catch (WrongTypeException isParameter) {
            isMethod(isNameExpr.isMethod().isMethod("isStringConstant"));
            isMethod(isNameExpr.isMethod().isMethod("isStringConstant"));
        }
    }

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isNameExpr = new TestTrayModulePreferences(isMethod(), "isStringConstant");
    }
}

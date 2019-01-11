// isComment
package net.grandcentrix.tray.publicapi;

import net.grandcentrix.tray.core.TrayItem;
import net.grandcentrix.tray.mock.TestTrayModulePreferences;
import net.grandcentrix.tray.provider.TrayProviderTestCase;

/**
 * isComment
 */
public class isClassOrIsInterface extends TrayProviderTestCase {

    public static final String isVariable = "isStringConstant";

    private TestTrayModulePreferences isVariable;

    public void isMethod() throws Exception {
        isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, "isStringConstant"));
    }

    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(isNameExpr, null);
        isMethod(null, isNameExpr.isMethod(isNameExpr));
    }

    public void isMethod() throws Exception {
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, "isStringConstant"));
        isNameExpr.isMethod(isNameExpr, null);
        final TrayItem isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(null, isNameExpr.isMethod());
        isMethod(null, isNameExpr.isMethod(isNameExpr));
    }

    public void isMethod() throws Exception {
        isMethod();
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, "isStringConstant"));
    }

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isNameExpr = new TestTrayModulePreferences(isMethod(), "isStringConstant");
    }
}

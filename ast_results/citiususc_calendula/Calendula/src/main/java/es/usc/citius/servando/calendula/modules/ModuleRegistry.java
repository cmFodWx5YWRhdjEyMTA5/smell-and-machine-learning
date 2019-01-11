// isComment
package es.usc.citius.servando.calendula.modules;

import org.apache.commons.lang3.ArrayUtils;
import java.util.ArrayList;
import java.util.List;
import es.usc.citius.servando.calendula.modules.modules.AllergiesModule;
import es.usc.citius.servando.calendula.modules.modules.BaseModule;
import es.usc.citius.servando.calendula.modules.modules.StockModule;
import es.usc.citius.servando.calendula.modules.modules.TestDataModule;
import es.usc.citius.servando.calendula.util.LogUtil;

public class isClassOrIsInterface {

    private static final String isVariable = "isStringConstant";

    public static List<CalendulaModule> isMethod() {
        return isMethod(isNameExpr.isFieldAccessExpr);
    }

    public static List<CalendulaModule> isMethod(String isParameter) {
        return isMethod(isNameExpr.isMethod(isNameExpr));
    }

    public static List<CalendulaModule> isMethod(ModuleConfig isParameter) {
        List<CalendulaModule> isVariable = new ArrayList<>();
        for (Class<?> isVariable : isNameExpr.isFieldAccessExpr) {
            try {
                isNameExpr.isMethod((CalendulaModule) isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
                throw new RuntimeException(isNameExpr);
            }
        }
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
        return isNameExpr;
    }

    public enum ModuleConfig {

        PRODUCT(isNameExpr.isFieldAccessExpr), CI(isNameExpr.isFieldAccessExpr), DEVELOP(isNameExpr.isFieldAccessExpr);

        private Class<?>[] isVariable;

        isConstructor(Class<?>[] isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }
    }

    private static class isClassOrIsInterface {

        private static final Class<?>[] isVariable = new Class<?>[] { // isComment
        BaseModule.class, StockModule.class };

        private static final Class<?>[] isVariable = isNameExpr.isMethod(isNameExpr, AllergiesModule.class);

        private static final Class<?>[] isVariable = isNameExpr.isMethod(isNameExpr, TestDataModule.class);
    }
}

// isComment
package de.geeksfactory.opacclient.apis;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import de.geeksfactory.opacclient.i18n.DummyStringProvider;
import de.geeksfactory.opacclient.objects.Copy;
import de.geeksfactory.opacclient.objects.Detail;
import de.geeksfactory.opacclient.objects.DetailedItem;
import de.geeksfactory.opacclient.objects.Volume;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class isClassOrIsInterface extends BaseHtmlTest {

    private String isVariable;

    public isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    private static final String[] isVariable = new String[] { "isStringConstant", "isStringConstant" };

    @Parameterized.Parameters(name = "isStringConstant")
    public static Collection<String[]> isMethod() {
        List<String[]> isVariable = new ArrayList<>();
        for (String isVariable : isNameExpr) {
            isNameExpr.isMethod(new String[] { isNameExpr });
        }
        return isNameExpr;
    }

    @Test
    public void isMethod() throws OpacApi.OpacErrorException, JSONException, IOException {
        String isVariable = isMethod("isStringConstant" + isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        String isVariable = isMethod("isStringConstant" + isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        String isVariable = isMethod("isStringConstant" + isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        String isVariable = isMethod("isStringConstant" + isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        if (isNameExpr == null || isNameExpr == null || isNameExpr == null) {
            // isComment
            return;
        }
        DetailedItem isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, new JSONObject(), new DummyStringProvider());
        isMethod(isNameExpr.isMethod().isMethod() > isIntegerConstant);
        for (Copy isVariable : isNameExpr.isMethod()) {
            isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod());
            if (isNameExpr.isMethod().isMethod("isStringConstant"))
                isMethod(isNameExpr.isMethod());
        }
        for (Volume isVariable : isNameExpr.isMethod()) {
            isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod());
        }
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr));
        if (isNameExpr.isMethod("isStringConstant")) {
            isMethod(isNameExpr.isMethod().isMethod(new Detail("isStringConstant", "isStringConstant")));
            isMethod(isNameExpr.isMethod());
        }
    }

    private String isMethod(String isParameter) {
        switch(isNameExpr) {
            case "isStringConstant":
                return "isStringConstant";
            case "isStringConstant":
                return "isStringConstant";
        }
        return null;
    }
}

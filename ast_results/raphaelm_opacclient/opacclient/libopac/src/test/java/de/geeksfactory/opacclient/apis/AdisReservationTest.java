// isComment
package de.geeksfactory.opacclient.apis;

import org.json.JSONException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import de.geeksfactory.opacclient.objects.DetailedItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

@RunWith(Parameterized.class)
public class isClassOrIsInterface extends BaseHtmlTest {

    public static final String isVariable = "isStringConstant";

    private String isVariable;

    private Adis isVariable;

    private DetailedItem isVariable;

    public isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    private static final String[] isVariable = new String[] { "isStringConstant" };

    @Parameterized.Parameters(name = "isStringConstant")
    public static Collection<String[]> isMethod() {
        List<String[]> isVariable = new ArrayList<>();
        for (String isVariable : isNameExpr) {
            isNameExpr.isMethod(new String[] { isNameExpr });
        }
        return isNameExpr;
    }

    @Before
    public void isMethod() throws IOException, OpacApi.OpacErrorException {
        isNameExpr = isMethod(Adis.class);
        String isVariable = isMethod(isNameExpr + isNameExpr + "isStringConstant");
        Document isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isMethod(isNameExpr), isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    private String isMethod(String isParameter) {
        switch(isNameExpr) {
            case "isStringConstant":
                return "isStringConstant";
            default:
                return null;
        }
    }

    @Test
    public void isMethod() throws JSONException, IOException, OpacApi.OpacErrorException {
        isMethod();
        String isVariable = isMethod();
        isNameExpr = isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    public void isMethod() throws OpacApi.OpacErrorException, JSONException, IOException {
        String isVariable = isMethod(isNameExpr + isNameExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr).isMethod(isMethod(), isMethod(List.class));
        OpacApi.ReservationResult isVariable = isNameExpr.isMethod(isNameExpr, null, isIntegerConstant, null);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    public String isMethod() throws OpacApi.OpacErrorException, JSONException, IOException {
        String isVariable = isMethod(isNameExpr + isNameExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr).isMethod(isMethod(), isMethod(List.class));
        OpacApi.ReservationResult isVariable = isNameExpr.isMethod(isNameExpr, null, isIntegerConstant, "isStringConstant");
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod() > isIntegerConstant);
        isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        return isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant).isMethod("isStringConstant");
    }

    public String isMethod(String isParameter) throws OpacApi.OpacErrorException, JSONException, IOException {
        String isVariable = isMethod(isNameExpr + isNameExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr).isMethod(isMethod(), isMethod(List.class));
        OpacApi.ReservationResult isVariable = isNameExpr.isMethod(isNameExpr, null, isIntegerConstant, isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod() == isIntegerConstant);
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant).isMethod("isStringConstant"), "isStringConstant");
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant).isMethod("isStringConstant").isMethod("isStringConstant"));
        return isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant).isMethod("isStringConstant");
    }

    public void isMethod(String isParameter) throws OpacApi.OpacErrorException, JSONException, IOException {
        String isVariable = isMethod(isNameExpr + isNameExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr).isMethod(isMethod(), isMethod(List.class));
        OpacApi.ReservationResult isVariable = isNameExpr.isMethod(isNameExpr, null, isIntegerConstant, isNameExpr);
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }
}

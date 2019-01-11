// isComment
package de.geeksfactory.opacclient.meanings;

import org.json.JSONException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import de.geeksfactory.opacclient.OpacApiFactory;
import de.geeksfactory.opacclient.apis.ApacheBaseApi;
import de.geeksfactory.opacclient.apis.OpacApi;
import de.geeksfactory.opacclient.apis.OpacApi.OpacErrorException;
import de.geeksfactory.opacclient.objects.Library;
import de.geeksfactory.opacclient.searchfields.SearchField;

public class isClassOrIsInterface implements Callable<Map<String, List<SearchField>>> {

    private Library isVariable;

    public isConstructor(Library isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public Map<String, List<SearchField>> isMethod() {
        OpacApi isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant");
        if (isNameExpr instanceof ApacheBaseApi) {
            ((ApacheBaseApi) isNameExpr).isMethod(true);
        }
        Set<String> isVariable = null;
        try {
            isNameExpr = isNameExpr.isMethod();
        } catch (IOException isParameter) {
        }
        if (isNameExpr == null) {
            // isComment
            try {
                Map<String, List<SearchField>> isVariable = new HashMap<>();
                isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
                return isNameExpr;
            } catch (IOException | OpacErrorException | JSONException isParameter) {
            }
        } else {
            Map<String, List<SearchField>> isVariable = new HashMap<>();
            for (String isVariable : isNameExpr) {
                isNameExpr.isMethod(isNameExpr);
                try {
                    isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
                } catch (IOException | OpacErrorException | JSONException isParameter) {
                }
            }
            return isNameExpr;
        }
        return null;
    }
}

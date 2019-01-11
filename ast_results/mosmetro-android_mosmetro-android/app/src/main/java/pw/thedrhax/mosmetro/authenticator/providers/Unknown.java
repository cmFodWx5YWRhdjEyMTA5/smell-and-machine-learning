// isComment
package pw.thedrhax.mosmetro.authenticator.providers;

import android.content.Context;
import java.util.HashMap;
import pw.thedrhax.mosmetro.R;
import pw.thedrhax.mosmetro.authenticator.NamedTask;
import pw.thedrhax.mosmetro.authenticator.Provider;
import pw.thedrhax.mosmetro.httpclient.ParsedResponse;
import pw.thedrhax.util.Logger;

public class isClassOrIsInterface extends Provider {

    public isConstructor(final Context isParameter, final ParsedResponse isParameter) {
        super(isNameExpr);
        /**
         * isComment
         */
        isMethod(new NamedTask(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)) {

            @Override
            public boolean isMethod(HashMap<String, Object> isParameter) {
                if (isNameExpr.isMethod() == isIntegerConstant) {
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                    isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
                } else {
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
                    isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
                }
                return true;
            }
        });
    }
}

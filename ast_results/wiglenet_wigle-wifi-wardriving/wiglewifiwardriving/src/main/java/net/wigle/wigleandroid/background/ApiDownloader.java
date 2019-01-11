// isComment
package net.wigle.wigleandroid.background;

import android.support.v4.app.FragmentActivity;
import net.wigle.wigleandroid.db.DatabaseHelper;
import net.wigle.wigleandroid.MainActivity;
import net.wigle.wigleandroid.WiGLEAuthException;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractApiRequest {

    public isConstructor(final FragmentActivity isParameter, final DatabaseHelper isParameter, final String isParameter, final String isParameter, final boolean isParameter, final boolean isParameter, final boolean isParameter, final String isParameter, final ApiListener isParameter) {
        super(isNameExpr, isNameExpr, "isStringConstant", isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, true, isNameExpr, isNameExpr, true);
    }

    @Override
    protected void isMethod() throws IOException, InterruptedException, WiGLEAuthException {
        String isVariable = null;
        try {
            isNameExpr = isMethod(this.isFieldAccessExpr);
            if (isNameExpr != null) {
                isMethod(isNameExpr);
            }
            final JSONObject isVariable = new JSONObject(isNameExpr);
            isNameExpr.isMethod(isNameExpr, true);
        } catch (final WiGLEAuthException isParameter) {
            // isComment
            throw isNameExpr;
        } catch (final JSONException isParameter) {
            isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr, isNameExpr);
        }
    }
}

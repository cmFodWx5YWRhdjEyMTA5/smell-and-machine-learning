// isComment
package be.digitalia.fosdem.parsers;

import android.util.JsonReader;
import java.util.HashMap;
import java.util.Map;
import be.digitalia.fosdem.model.RoomStatus;

public class isClassOrIsInterface extends AbstractJsonPullParser<Map<String, RoomStatus>> {

    @Override
    protected Map<String, RoomStatus> isMethod(JsonReader isParameter) throws Exception {
        Map<String, RoomStatus> isVariable = new HashMap<>();
        isNameExpr.isMethod();
        while (isNameExpr.isMethod()) {
            String isVariable = null;
            RoomStatus isVariable = null;
            isNameExpr.isMethod();
            while (isNameExpr.isMethod()) {
                switch(isNameExpr.isMethod()) {
                    case "isStringConstant":
                        isNameExpr = isNameExpr.isMethod();
                        break;
                    case "isStringConstant":
                        String isVariable = isNameExpr.isMethod();
                        try {
                            isNameExpr = isNameExpr.isMethod()[isNameExpr.isMethod(isNameExpr)];
                        } catch (Exception isParameter) {
                        // isComment
                        }
                        break;
                    default:
                        isNameExpr.isMethod();
                }
            }
            isNameExpr.isMethod();
            if (isNameExpr != null && isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        }
        isNameExpr.isMethod();
        return isNameExpr;
    }
}

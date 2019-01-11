// isComment
package info.guardianproject.otr.app.im.plugin.loopback;

import info.guardianproject.otr.app.im.plugin.ImPluginConstants;
import info.guardianproject.otr.app.im.plugin.PresenceMapping;
import java.util.Map;

/**
 * isComment
 */
public class isClassOrIsInterface implements PresenceMapping {

    public int[] isMethod() {
        return new int[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };
    }

    public boolean isMethod(int isParameter) {
        return isNameExpr != isNameExpr.isFieldAccessExpr;
    }

    public String isMethod(int isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr.isFieldAccessExpr;
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr.isFieldAccessExpr;
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr.isFieldAccessExpr;
            default:
                return null;
        }
    }

    public Map<String, Object> isMethod(int isParameter) {
        // isComment
        return null;
    }

    public boolean isMethod() {
        // isComment
        return true;
    }

    public int isMethod(boolean isParameter, String isParameter, Map isParameter) {
        if (!isNameExpr) {
            return isNameExpr.isFieldAccessExpr;
        }
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            return isNameExpr.isFieldAccessExpr;
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            return isNameExpr.isFieldAccessExpr;
        } else {
            return isNameExpr.isFieldAccessExpr;
        }
    }
}

// isComment
package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.IMarkerFactory;
import org.slf4j.Marker;

/**
 * isComment
 */
public class isClassOrIsInterface implements IMarkerFactory {

    Map isVariable = new HashMap();

    /**
     * isComment
     */
    public isConstructor() {
    }

    /**
     * isComment
     */
    public synchronized Marker isMethod(String isParameter) {
        if (isNameExpr == null) {
            throw new IllegalArgumentException("isStringConstant");
        }
        Marker isVariable = (Marker) isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr = new BasicMarker(isNameExpr);
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public synchronized boolean isMethod(String isParameter) {
        if (isNameExpr == null) {
            return true;
        }
        return isNameExpr.isMethod(isNameExpr);
    }

    public boolean isMethod(String isParameter) {
        if (isNameExpr == null) {
            return true;
        }
        return (isNameExpr.isMethod(isNameExpr) != null);
    }

    public Marker isMethod(String isParameter) {
        return new BasicMarker(isNameExpr);
    }
}

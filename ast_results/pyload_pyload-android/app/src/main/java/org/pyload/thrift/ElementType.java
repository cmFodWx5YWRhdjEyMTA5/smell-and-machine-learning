// isComment
package org.pyload.thrift;

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ElementType implements org.apache.thrift.TEnum {

    Package(isIntegerConstant), File(isIntegerConstant);

    private final int isVariable;

    private isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public static ElementType isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return isNameExpr;
            case isIntegerConstant:
                return isNameExpr;
            default:
                return null;
        }
    }
}

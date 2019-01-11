// isComment
package de.koelle.christian.common.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class isClassOrIsInterface {

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    public static <T extends Serializable> T isMethod(T isParameter) {
        Object isVariable = null;
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        ObjectInputStream isVariable = null;
        try {
            ObjectOutputStream isVariable = new ObjectOutputStream(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
            isNameExpr = new ObjectInputStream(new ByteArrayInputStream(isNameExpr.isMethod()));
            isNameExpr = isNameExpr.isMethod();
        } catch (IOException | ClassNotFoundException isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        } finally {
            try {
                isNameExpr.isMethod();
                if (isNameExpr != null) {
                    isNameExpr.isMethod();
                }
            } catch (IOException isParameter) {
                throw new RuntimeException("isStringConstant", isNameExpr);
            }
        }
        return (T) isNameExpr;
    }
}

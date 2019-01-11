// isComment
package org.codehaus.jackson.map.ser;

import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;

public abstract class isClassOrIsInterface<T> extends SerializerBase<T> {

    protected isConstructor(Class<T> isParameter) {
        super(isNameExpr);
    }

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    protected isConstructor(Class<?> isParameter, boolean isParameter) {
        super((Class<T>) isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(T isParameter, JsonGenerator isParameter, SerializerProvider isParameter, TypeSerializer isParameter) throws IOException, JsonGenerationException {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }
}

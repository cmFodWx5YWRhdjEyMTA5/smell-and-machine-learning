// isComment
package org.codehaus.jackson.map.deser;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Currency;
import java.util.UUID;
import java.util.regex.Pattern;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T> extends StdScalarDeserializer<T> {

    protected isConstructor(Class<?> isParameter) {
        super(isNameExpr);
    }

    public final T isMethod(JsonParser isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            String isVariable = isNameExpr.isMethod();
            try {
                T isVariable = isMethod(isNameExpr, isNameExpr);
                if (isNameExpr != null) {
                    return isNameExpr;
                }
            } catch (IllegalArgumentException isParameter) {
            // isComment
            }
            throw isNameExpr.isMethod(isNameExpr, "isStringConstant");
        }
        throw isNameExpr.isMethod(isNameExpr);
    }

    protected abstract T isMethod(String isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException;

    public static class isClassOrIsInterface extends FromStringDeserializer<UUID> {

        public isConstructor() {
            super(UUID.class);
        }

        protected UUID isMethod(String isParameter, DeserializationContext isParameter) {
            return isNameExpr.isMethod(isNameExpr);
        }
    }

    public static class isClassOrIsInterface extends FromStringDeserializer<URL> {

        public isConstructor() {
            super(URL.class);
        }

        protected URL isMethod(String isParameter, DeserializationContext isParameter) throws IOException {
            return new URL(isNameExpr);
        }
    }

    public static class isClassOrIsInterface extends FromStringDeserializer<URI> {

        public isConstructor() {
            super(URI.class);
        }

        protected URI isMethod(String isParameter, DeserializationContext isParameter) throws IllegalArgumentException {
            return isNameExpr.isMethod(isNameExpr);
        }
    }

    public static class isClassOrIsInterface extends FromStringDeserializer<Currency> {

        public isConstructor() {
            super(Currency.class);
        }

        protected Currency isMethod(String isParameter, DeserializationContext isParameter) throws IllegalArgumentException {
            // isComment
            return isNameExpr.isMethod(isNameExpr);
        }
    }

    public static class isClassOrIsInterface extends FromStringDeserializer<Pattern> {

        public isConstructor() {
            super(Pattern.class);
        }

        protected Pattern isMethod(String isParameter, DeserializationContext isParameter) throws IllegalArgumentException {
            // isComment
            return isNameExpr.isMethod(isNameExpr);
        }
    }
}

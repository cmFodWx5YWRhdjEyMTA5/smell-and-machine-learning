// isComment
package org.codehaus.jackson.map.deser;

import java.util.*;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.type.*;
import org.codehaus.jackson.map.util.Provider;
import org.codehaus.jackson.type.JavaType;

/**
 * isComment
 */
class isClassOrIsInterface {

    final HashMap<JavaType, JsonDeserializer<Object>> isVariable = new HashMap<JavaType, JsonDeserializer<Object>>();

    private isConstructor() {
        // isComment
        isMethod(new UntypedObjectDeserializer());
        // isComment
        isMethod(new StdDeserializer.StringDeserializer());
        isMethod(new StdDeserializer.ClassDeserializer());
        // isComment
        isMethod(new StdDeserializer.BooleanDeserializer(Boolean.class, null));
        isMethod(new StdDeserializer.ByteDeserializer(Byte.class, null));
        isMethod(new StdDeserializer.ShortDeserializer(Short.class, null));
        isMethod(new StdDeserializer.CharacterDeserializer(Character.class, null));
        isMethod(new StdDeserializer.IntegerDeserializer(Integer.class, null));
        isMethod(new StdDeserializer.LongDeserializer(Long.class, null));
        isMethod(new StdDeserializer.FloatDeserializer(Float.class, null));
        isMethod(new StdDeserializer.DoubleDeserializer(Double.class, null));
        /*isComment*/
        isMethod(new StdDeserializer.BooleanDeserializer(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isMethod(new StdDeserializer.ByteDeserializer(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod((byte) (isIntegerConstant))));
        isMethod(new StdDeserializer.ShortDeserializer(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod((short) isIntegerConstant)));
        isMethod(new StdDeserializer.CharacterDeserializer(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod('isStringConstant')));
        isMethod(new StdDeserializer.IntegerDeserializer(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant)));
        isMethod(new StdDeserializer.LongDeserializer(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isStringConstant)));
        isMethod(new StdDeserializer.FloatDeserializer(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isDoubleConstant)));
        isMethod(new StdDeserializer.DoubleDeserializer(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isDoubleConstant)));
        // isComment
        isMethod(new StdDeserializer.NumberDeserializer());
        isMethod(new StdDeserializer.BigDecimalDeserializer());
        isMethod(new StdDeserializer.BigIntegerDeserializer());
        isMethod(new DateDeserializer());
        isMethod(new StdDeserializer.SqlDateDeserializer());
        isMethod(new StdDeserializer.CalendarDeserializer());
        /*isComment*/
        isMethod(new StdDeserializer.CalendarDeserializer(GregorianCalendar.class), GregorianCalendar.class);
        // isComment
        isMethod(new FromStringDeserializer.UUIDDeserializer());
        isMethod(new FromStringDeserializer.URLDeserializer());
        isMethod(new FromStringDeserializer.URIDeserializer());
        isMethod(new FromStringDeserializer.PatternDeserializer());
        /*isComment*/
        for (String isVariable : new String[] { "isStringConstant", "isStringConstant" }) {
            try {
                Class<?> isVariable = isNameExpr.isMethod(isNameExpr);
                Object isVariable = isNameExpr.isMethod();
                @SuppressWarnings("isStringConstant")
                Provider<StdDeserializer<?>> isVariable = (Provider<StdDeserializer<?>>) isNameExpr;
                for (StdDeserializer<?> isVariable : isNameExpr.isMethod()) {
                    isMethod(isNameExpr);
                }
            } catch (LinkageError isParameter) {
            }// isComment
             catch (Exception isParameter) {
            }
        }
        // isComment
        // isComment
        isMethod(new StdDeserializer.StackTraceElementDeserializer());
        // isComment
        isMethod(new StdDeserializer.TokenBufferDeserializer());
    }

    /**
     * isComment
     */
    public static HashMap<JavaType, JsonDeserializer<Object>> isMethod() {
        return new StdDeserializers().isFieldAccessExpr;
    }

    private void isMethod(StdDeserializer<?> isParameter) {
        isMethod(isNameExpr, isNameExpr.isMethod());
    }

    private void isMethod(StdDeserializer<?> isParameter, Class<?> isParameter) {
        // isComment
        @SuppressWarnings("isStringConstant")
        JsonDeserializer<Object> isVariable = (JsonDeserializer<Object>) isNameExpr;
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
    }
}

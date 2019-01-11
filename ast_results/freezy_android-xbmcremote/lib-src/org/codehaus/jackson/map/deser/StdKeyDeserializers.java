// isComment
package org.codehaus.jackson.map.deser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.KeyDeserializer;
import org.codehaus.jackson.map.type.*;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;
import org.codehaus.jackson.type.JavaType;

/**
 * isComment
 */
class isClassOrIsInterface {

    final HashMap<JavaType, KeyDeserializer> isVariable = new HashMap<JavaType, KeyDeserializer>();

    private isConstructor() {
        isMethod(new StdKeyDeserializer.BoolKD());
        isMethod(new StdKeyDeserializer.ByteKD());
        isMethod(new StdKeyDeserializer.CharKD());
        isMethod(new StdKeyDeserializer.ShortKD());
        isMethod(new StdKeyDeserializer.IntKD());
        isMethod(new StdKeyDeserializer.LongKD());
        isMethod(new StdKeyDeserializer.FloatKD());
        isMethod(new StdKeyDeserializer.DoubleKD());
    }

    private void isMethod(StdKeyDeserializer isParameter) {
        Class<?> isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
    }

    public static HashMap<JavaType, KeyDeserializer> isMethod() {
        return new StdKeyDeserializers().isFieldAccessExpr;
    }

    /*isComment*/
    public static KeyDeserializer isMethod(DeserializationConfig isParameter, JavaType isParameter) {
        EnumResolver<?> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        return new StdKeyDeserializer.EnumKD(isNameExpr);
    }

    public static KeyDeserializer isMethod(DeserializationConfig isParameter, JavaType isParameter) {
        /*isComment*/
        BasicBeanDescription isVariable = isNameExpr.isMethod(isNameExpr);
        // isComment
        Constructor<?> isVariable = isNameExpr.isMethod(String.class);
        if (isNameExpr != null) {
            return new StdKeyDeserializer.StringCtorKeyDeserializer(isNameExpr);
        }
        /*isComment*/
        Method isVariable = isNameExpr.isMethod(String.class);
        if (isNameExpr != null) {
            return new StdKeyDeserializer.StringFactoryKeyDeserializer(isNameExpr);
        }
        // isComment
        return null;
    }
}

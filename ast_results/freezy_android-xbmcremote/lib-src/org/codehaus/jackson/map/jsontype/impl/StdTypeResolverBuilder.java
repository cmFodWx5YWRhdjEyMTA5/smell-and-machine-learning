// isComment
package org.codehaus.jackson.map.jsontype.impl;

import java.util.Collection;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.jsontype.NamedType;
import org.codehaus.jackson.map.jsontype.TypeIdResolver;
import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;
import org.codehaus.jackson.type.JavaType;

/**
 * isComment
 */
public class isClassOrIsInterface implements TypeResolverBuilder<StdTypeResolverBuilder> {

    // isComment
    protected JsonTypeInfo.Id isVariable;

    protected JsonTypeInfo.As isVariable;

    protected String isVariable;

    // isComment
    protected TypeIdResolver isVariable;

    public isConstructor() {
    }

    public StdTypeResolverBuilder isMethod(JsonTypeInfo.Id isParameter, TypeIdResolver isParameter) {
        // isComment
        if (isNameExpr == null) {
            throw new IllegalArgumentException("isStringConstant");
        }
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        // isComment
        isNameExpr = isNameExpr.isMethod();
        return this;
    }

    public TypeSerializer isMethod(JavaType isParameter, Collection<NamedType> isParameter) {
        TypeIdResolver isVariable = isMethod(isNameExpr, isNameExpr, true, true);
        switch(isNameExpr) {
            case isNameExpr:
                return new AsArrayTypeSerializer(isNameExpr);
            case isNameExpr:
                return new AsPropertyTypeSerializer(isNameExpr, isNameExpr);
            case isNameExpr:
                return new AsWrapperTypeSerializer(isNameExpr);
            default:
                throw new IllegalStateException("isStringConstant" + isNameExpr);
        }
    }

    public TypeDeserializer isMethod(JavaType isParameter, Collection<NamedType> isParameter) {
        TypeIdResolver isVariable = isMethod(isNameExpr, isNameExpr, true, true);
        // isComment
        switch(isNameExpr) {
            case isNameExpr:
                return new AsArrayTypeDeserializer(isNameExpr, isNameExpr);
            case isNameExpr:
                return new AsPropertyTypeDeserializer(isNameExpr, isNameExpr, isNameExpr);
            case isNameExpr:
                return new AsWrapperTypeDeserializer(isNameExpr, isNameExpr);
            default:
                throw new IllegalStateException("isStringConstant" + isNameExpr);
        }
    }

    /*isComment*/
    public StdTypeResolverBuilder isMethod(JsonTypeInfo.As isParameter) {
        if (isNameExpr == null) {
            throw new IllegalArgumentException("isStringConstant");
        }
        isNameExpr = isNameExpr;
        return this;
    }

    public StdTypeResolverBuilder isMethod(String isParameter) {
        // isComment
        if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant) {
            isNameExpr = isNameExpr.isMethod();
        }
        isNameExpr = isNameExpr;
        return this;
    }

    /*isComment*/
    /**
     * isComment
     */
    protected TypeIdResolver isMethod(JavaType isParameter, Collection<NamedType> isParameter, boolean isParameter, boolean isParameter) {
        // isComment
        if (isNameExpr != null) {
            return isNameExpr;
        }
        if (isNameExpr == null) {
            throw new IllegalStateException("isStringConstant");
        }
        switch(isNameExpr) {
            case isNameExpr:
                return new ClassNameIdResolver(isNameExpr);
            case isNameExpr:
                return new MinimalClassNameIdResolver(isNameExpr);
            case isNameExpr:
                return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            // isComment
            case isNameExpr:
            // isComment
            case isNameExpr:
        }
        throw new IllegalStateException("isStringConstant" + isNameExpr);
    }
}

// isComment
package org.codehaus.jackson.map.jsontype.impl;

import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.jsontype.TypeIdResolver;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends TypeSerializer {

    protected final TypeIdResolver isVariable;

    protected isConstructor(TypeIdResolver isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public abstract JsonTypeInfo.As isMethod();

    @Override
    public String isMethod() {
        return null;
    }

    public TypeIdResolver isMethod() {
        return isNameExpr;
    }
}

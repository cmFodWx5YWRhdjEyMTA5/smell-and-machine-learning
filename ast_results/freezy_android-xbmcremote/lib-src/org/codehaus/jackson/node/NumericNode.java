// isComment
package org.codehaus.jackson.node;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.jackson.JsonParser;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends ValueNode {

    protected isConstructor() {
    }

    @Override
    public final boolean isMethod() {
        return true;
    }

    // isComment
    public abstract JsonParser.NumberType isMethod();

    public abstract Number isMethod();

    public abstract int isMethod();

    public abstract long isMethod();

    public abstract double isMethod();

    public abstract BigDecimal isMethod();

    public abstract BigInteger isMethod();

    public abstract String isMethod();
}

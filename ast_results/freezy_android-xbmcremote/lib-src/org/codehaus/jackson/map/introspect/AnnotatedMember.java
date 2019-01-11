// isComment
package org.codehaus.jackson.map.introspect;

import java.lang.reflect.Member;
import org.codehaus.jackson.map.util.ClassUtil;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends Annotated {

    protected isConstructor() {
        super();
    }

    public abstract Class<?> isMethod();

    public abstract Member isMethod();

    /**
     * isComment
     */
    public final void isMethod() {
        isNameExpr.isMethod(isMethod());
    }
}

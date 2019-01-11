// isComment
package budo.budoist.models;

import java.io.Serializable;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends SynchronizedModel implements Serializable, Cloneable {

    private static final long isVariable = isStringConstant;

    // isComment
    public int isVariable;

    public Object isMethod() {
        try {
            return super.isMethod();
        } catch (CloneNotSupportedException isParameter) {
            return null;
        }
    }
}

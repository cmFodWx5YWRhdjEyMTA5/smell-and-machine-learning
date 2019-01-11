// isComment
package org.wheelmap.android.mapping.node;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import java.math.BigInteger;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class isClassOrIsInterface {

    protected BigInteger isVariable;

    protected String isVariable;

    /**
     * isComment
     */
    public BigInteger isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(BigInteger isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public String isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr;
    }
}

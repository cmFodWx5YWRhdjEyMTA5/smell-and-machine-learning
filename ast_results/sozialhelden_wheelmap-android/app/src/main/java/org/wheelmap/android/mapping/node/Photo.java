// isComment
package org.wheelmap.android.mapping.node;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class isClassOrIsInterface {

    protected BigInteger isVariable;

    @JsonProperty(value = "isStringConstant")
    protected BigInteger isVariable;

    @JsonProperty(value = "isStringConstant")
    protected List<Image> isVariable;

    public BigInteger isMethod() {
        return isNameExpr;
    }

    public void isMethod(BigInteger isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public BigInteger isMethod() {
        return isNameExpr;
    }

    public void isMethod(BigInteger isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public List<Image> isMethod() {
        return isNameExpr;
    }

    public void isMethod(List<Image> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + /*isComment*/
        "isStringConstant";
    }
}

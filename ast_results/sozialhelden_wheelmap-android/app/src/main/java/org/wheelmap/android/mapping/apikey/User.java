// isComment
package org.wheelmap.android.mapping.apikey;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import java.math.BigDecimal;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class isClassOrIsInterface {

    @JsonProperty(value = "isStringConstant")
    protected String isVariable;

    protected BigDecimal isVariable;

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public BigDecimal isMethod() {
        return isNameExpr;
    }

    public void isMethod(BigDecimal isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}

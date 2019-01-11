// isComment
package org.wheelmap.android.mapping.locale;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.wheelmap.android.mapping.BaseDomain;
import org.wheelmap.android.mapping.categories.Conditions;
import java.util.Map;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class isClassOrIsInterface extends BaseDomain {

    protected Conditions isVariable;

    @JsonProperty(value = "isStringConstant")
    protected Map<String, String> isVariable;

    /**
     * isComment
     */
    public Conditions isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(Conditions isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public Map<String, String> isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(Map<String, String> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}

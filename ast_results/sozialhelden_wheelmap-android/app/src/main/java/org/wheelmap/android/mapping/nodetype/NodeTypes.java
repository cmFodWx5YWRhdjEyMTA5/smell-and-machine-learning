// isComment
package org.wheelmap.android.mapping.nodetype;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.wheelmap.android.mapping.BaseDomain;
import org.wheelmap.android.mapping.categories.Category;
import org.wheelmap.android.mapping.categories.Conditions;
import java.util.List;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class isClassOrIsInterface extends BaseDomain {

    protected Conditions isVariable;

    @JsonProperty(value = "isStringConstant")
    protected List<NodeType> isVariable;

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
    public List<NodeType> isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(List<NodeType> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}

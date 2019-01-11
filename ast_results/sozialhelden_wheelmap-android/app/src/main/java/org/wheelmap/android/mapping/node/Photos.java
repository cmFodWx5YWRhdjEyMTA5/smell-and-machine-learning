// isComment
package org.wheelmap.android.mapping.node;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.wheelmap.android.mapping.BaseDomain;
import java.util.List;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class isClassOrIsInterface extends BaseDomain {

    protected Conditions isVariable;

    protected List<Photo> isVariable;

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
    public List<Photo> isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(List<Photo> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}

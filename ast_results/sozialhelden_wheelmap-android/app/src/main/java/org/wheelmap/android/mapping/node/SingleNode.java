// isComment
package org.wheelmap.android.mapping.node;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.wheelmap.android.mapping.Base;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class isClassOrIsInterface extends Base {

    protected Node isVariable;

    /**
     * isComment
     */
    public Node isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(Node isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}

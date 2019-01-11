// isComment
package org.wheelmap.android.mapping.categories;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.wheelmap.android.mapping.BaseDomain;
import java.util.List;

@JsonAutoDetect
public class isClassOrIsInterface extends BaseDomain {

    protected Conditions isVariable;

    protected List<Category> isVariable;

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
    public List<Category> isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(List<Category> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}

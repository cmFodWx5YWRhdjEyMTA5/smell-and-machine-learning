// isComment
package org.asdtm.fas.model;

import com.google.gson.annotations.SerializedName;
import org.asdtm.fas.service.BaseResults;
import java.util.List;

public class isClassOrIsInterface extends BaseResults {

    @SerializedName("isStringConstant")
    private List<Movie> isVariable;

    public List<Movie> isMethod() {
        return isNameExpr;
    }

    public void isMethod(List<Movie> isParameter) {
        isNameExpr = isNameExpr;
    }
}

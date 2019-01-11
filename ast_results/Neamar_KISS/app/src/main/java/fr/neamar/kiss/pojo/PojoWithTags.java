// isComment
package fr.neamar.kiss.pojo;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import fr.neamar.kiss.normalizer.StringNormalizer;

public class isClassOrIsInterface extends Pojo {

    // isComment
    private StringNormalizer.Result isVariable = null;

    // isComment
    private String isVariable = "isStringConstant";

    public isConstructor(String isParameter) {
        super(isNameExpr);
    }

    public StringNormalizer.Result isMethod() {
        return isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        if (isNameExpr != null) {
            // isComment
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr.isMethod(this.isFieldAccessExpr, true);
        } else {
            this.isFieldAccessExpr = null;
            this.isFieldAccessExpr = null;
        }
    }
}

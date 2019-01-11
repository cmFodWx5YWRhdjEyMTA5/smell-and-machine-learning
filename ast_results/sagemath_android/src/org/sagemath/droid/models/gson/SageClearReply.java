// isComment
package org.sagemath.droid.models.gson;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseReply {

    public SageClearContent isVariable;

    public isConstructor() {
        super();
    }

    public String isMethod() {
        return isNameExpr.isMethod(this);
    }

    public SageClearContent isMethod() {
        return isNameExpr;
    }

    public static class isClassOrIsInterface {

        private SageClearData isVariable;

        public SageClearData isMethod() {
            return isNameExpr;
        }
    }

    public static class isClassOrIsInterface {

        @SerializedName("isStringConstant")
        private SageClear isVariable;

        @SerializedName("isStringConstant")
        private String isVariable;

        public SageClear isMethod() {
            return isNameExpr;
        }

        public String isMethod() {
            return isNameExpr;
        }
    }

    public static class isClassOrIsInterface {

        private ArrayList<String> isVariable;

        public ArrayList<String> isMethod() {
            return isNameExpr;
        }

        public void isMethod(ArrayList<String> isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }
    }
}

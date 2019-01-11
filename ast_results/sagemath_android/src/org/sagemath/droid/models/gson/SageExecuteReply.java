// isComment
package org.sagemath.droid.models.gson;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseReply {

    private ExecuteReplyContent isVariable;

    public ExecuteReplyContent isMethod() {
        return isNameExpr;
    }

    public static class isClassOrIsInterface {

        private String isVariable;

        public String isMethod() {
            return isNameExpr;
        }
    }
}

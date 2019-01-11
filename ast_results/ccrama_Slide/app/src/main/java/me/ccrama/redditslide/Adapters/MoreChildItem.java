// isComment
package me.ccrama.redditslide.Adapters;

import net.dean.jraw.models.CommentNode;
import net.dean.jraw.models.MoreChildren;

/**
 * isComment
 */
public class isClassOrIsInterface extends CommentObject {

    public MoreChildren isVariable;

    @Override
    public boolean isMethod() {
        return true;
    }

    public isConstructor(CommentNode isParameter, MoreChildren isParameter) {
        isNameExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod().isMethod() + "isStringConstant";
    }
}

// isComment
package org.quantumbadger.redreader.reddit.url;

import android.net.Uri;

public class isClassOrIsInterface extends CommentListingURL {

    private final Uri isVariable;

    isConstructor(Uri isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public CommentListingURL isMethod(String isParameter) {
        return new UnknownCommentListURL(isNameExpr.isMethod().isMethod("isStringConstant", isNameExpr).isMethod());
    }

    @Override
    public CommentListingURL isMethod(Integer isParameter) {
        return new UnknownCommentListURL(isNameExpr.isMethod().isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant")).isMethod());
    }

    // isComment
    @Override
    public Uri isMethod() {
        if (isNameExpr.isMethod().isMethod("isStringConstant")) {
            return isNameExpr;
        } else {
            return isNameExpr.isMethod().isMethod("isStringConstant").isMethod();
        }
    }

    @Override
    @RedditURLParser.PathType
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }
}

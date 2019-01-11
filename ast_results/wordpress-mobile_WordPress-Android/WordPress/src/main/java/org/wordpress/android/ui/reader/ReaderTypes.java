// isComment
package org.wordpress.android.ui.reader;

public class isClassOrIsInterface {

    public static final ReaderPostListType isVariable = isNameExpr.isFieldAccessExpr;

    public enum ReaderPostListType {

        // isComment
        TAG_FOLLOWED,
        // isComment
        TAG_PREVIEW,
        // isComment
        BLOG_PREVIEW,
        // isComment
        SEARCH_RESULTS;

        public boolean isMethod() {
            return this.isMethod(isNameExpr) || this.isMethod(isNameExpr);
        }
    }
}

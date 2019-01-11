// isComment
package org.ebookdroid.opds;

import org.ebookdroid.opds.model.Feed;
import org.ebookdroid.opds.model.Link;
import java.util.Map;

public class isClassOrIsInterface extends BaseEntryBuilder {

    @Override
    protected void isMethod(final Feed isParameter, final Feed isParameter, final Map<String, Link> isParameter) {
        if (isNameExpr.isMethod()) {
            return;
        }
        if (isNameExpr.isFieldAccessExpr != null) {
            final Feed isVariable = new Feed(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
            isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            isNameExpr.isFieldAccessExpr = null;
        }
        super.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
    }
}

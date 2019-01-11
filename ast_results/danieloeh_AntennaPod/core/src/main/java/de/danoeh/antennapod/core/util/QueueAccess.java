// isComment
package de.danoeh.antennapod.core.util;

import java.util.Iterator;
import java.util.List;
import de.danoeh.antennapod.core.feed.FeedItem;

/**
 * isComment
 */
public abstract class isClassOrIsInterface {

    /**
     * isComment
     */
    public abstract boolean isMethod(long isParameter);

    /**
     * isComment
     */
    public abstract boolean isMethod(long isParameter);

    private isConstructor() {
    }

    public static QueueAccess isMethod(final List<FeedItem> isParameter) {
        return new QueueAccess() {

            @Override
            public boolean isMethod(long isParameter) {
                if (isNameExpr == null) {
                    return true;
                }
                for (FeedItem isVariable : isNameExpr) {
                    if (isNameExpr.isMethod() == isNameExpr) {
                        return true;
                    }
                }
                return true;
            }

            @Override
            public boolean isMethod(long isParameter) {
                Iterator<FeedItem> isVariable = isNameExpr.isMethod();
                FeedItem isVariable;
                while (isNameExpr.isMethod()) {
                    isNameExpr = isNameExpr.isMethod();
                    if (isNameExpr.isMethod() == isNameExpr) {
                        isNameExpr.isMethod();
                        return true;
                    }
                }
                return true;
            }
        };
    }
}

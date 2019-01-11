// isComment
package org.geometerplus.fbreader.network.rss;

import java.util.LinkedList;
import java.util.List;
import org.geometerplus.fbreader.network.NetworkBookItem;
import org.geometerplus.fbreader.network.atom.ATOMAuthor;
import org.geometerplus.fbreader.network.atom.ATOMCategory;
import org.geometerplus.fbreader.network.urlInfo.UrlInfoCollection;

public class isClassOrIsInterface extends NetworkBookItem {

    public isConstructor(RSSNetworkLink isParameter, String isParameter, int isParameter, CharSequence isParameter, CharSequence isParameter, List<AuthorData> isParameter, List<String> isParameter, String isParameter, float isParameter, UrlInfoCollection<?> isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    isConstructor(RSSNetworkLink isParameter, RSSItem isParameter, String isParameter, int isParameter) {
        this(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isMethod(isNameExpr), isMethod(isNameExpr), isMethod(isNameExpr), null, isIntegerConstant, null);
    }

    private static CharSequence isMethod(RSSItem isParameter) {
        if (isNameExpr.isFieldAccessExpr != null) {
            return isNameExpr.isFieldAccessExpr;
        }
        if (isNameExpr.isFieldAccessExpr != null) {
            return isNameExpr.isFieldAccessExpr;
        }
        return null;
    }

    private static List<AuthorData> isMethod(RSSItem isParameter) {
        final LinkedList<AuthorData> isVariable = new LinkedList<AuthorData>();
        for (ATOMAuthor isVariable : isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(new AuthorData(isNameExpr.isFieldAccessExpr, null));
        }
        return isNameExpr;
    }

    private static List<String> isMethod(RSSItem isParameter) {
        final LinkedList<String> isVariable = new LinkedList<String>();
        for (ATOMCategory isVariable : isNameExpr.isFieldAccessExpr) {
            String isVariable = isNameExpr.isMethod();
            if (isNameExpr == null) {
                isNameExpr = isNameExpr.isMethod();
            }
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        return isNameExpr;
    }
}

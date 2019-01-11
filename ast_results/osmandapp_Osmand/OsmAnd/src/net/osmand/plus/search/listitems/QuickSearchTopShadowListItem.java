// isComment
package net.osmand.plus.search.listitems;

import net.osmand.plus.OsmandApplication;

public class isClassOrIsInterface extends QuickSearchListItem {

    public isConstructor(OsmandApplication isParameter) {
        super(isNameExpr, null);
    }

    public QuickSearchListItemType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }
}

// isComment
package net.osmand.plus.search.listitems;

import android.view.View;
import net.osmand.plus.OsmandApplication;

public class isClassOrIsInterface extends QuickSearchListItem {

    private String isVariable;

    private View.OnClickListener isVariable;

    public isConstructor(OsmandApplication isParameter, String isParameter, View.OnClickListener isParameter) {
        super(isNameExpr, null);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public QuickSearchListItemType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    public View.OnClickListener isMethod() {
        return isNameExpr;
    }
}

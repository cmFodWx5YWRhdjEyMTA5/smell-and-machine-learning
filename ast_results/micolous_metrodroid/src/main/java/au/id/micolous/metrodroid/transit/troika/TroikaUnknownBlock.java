// isComment
package au.id.micolous.metrodroid.transit.troika;

import java.util.ArrayList;
import java.util.List;
import au.id.micolous.farebot.R;
import au.id.micolous.metrodroid.ui.HeaderListItem;
import au.id.micolous.metrodroid.ui.ListItem;

class isClassOrIsInterface extends TroikaBlock {

    public isConstructor(byte[] isParameter) {
        super(isNameExpr);
    }

    @Override
    public List<ListItem> isMethod() {
        ArrayList<ListItem> isVariable = new ArrayList<>();
        isNameExpr.isMethod(new HeaderListItem(isMethod(isNameExpr)));
        isNameExpr.isMethod(new ListItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr)));
        return isNameExpr;
    }
}

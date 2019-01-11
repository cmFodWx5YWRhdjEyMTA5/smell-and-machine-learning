// isComment
package li.klass.fhem.domain.setlist.typeEntry;

import li.klass.fhem.domain.setlist.SetListItem;
import li.klass.fhem.domain.setlist.SetListItemType;

public class isClassOrIsInterface extends SetListItem {

    public isConstructor(String isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Override
    public String isMethod() {
        return isNameExpr + "isStringConstant" + isNameExpr.isMethod();
    }
}

// isComment
package org.geometerplus.fbreader.tips;

import java.util.*;
import org.geometerplus.fbreader.network.atom.*;

class isClassOrIsInterface extends AbstractATOMFeedHandler {

    final List<Tip> isVariable = new LinkedList<Tip>();

    @Override
    public boolean isMethod(ATOMEntry isParameter) {
        isNameExpr.isMethod(new Tip(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        return true;
    }
}

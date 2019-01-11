// isComment
package org.geometerplus.fbreader.network.opds;

import java.util.*;
import org.geometerplus.zlibrary.core.xml.ZLStringMap;
import org.geometerplus.zlibrary.core.money.Money;
import org.geometerplus.fbreader.network.atom.ATOMLink;

class isClassOrIsInterface extends ATOMLink {

    public final LinkedList<Money> isVariable = new LinkedList<Money>();

    public final LinkedList<String> isVariable = new LinkedList<String>();

    protected isConstructor(ZLStringMap isParameter) {
        super(isNameExpr);
    }

    private Money isMethod(String isParameter) {
        for (Money isVariable : isNameExpr) {
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                return isNameExpr;
            }
        }
        return null;
    }

    public Money isMethod() {
        if (isNameExpr.isMethod()) {
            return null;
        } else if (isNameExpr.isMethod() == isIntegerConstant) {
            return isNameExpr.isMethod(isIntegerConstant);
        }
        Money isVariable;
        final Locale isVariable = isNameExpr.isMethod();
        if (isNameExpr.isMethod().isMethod() == isIntegerConstant) {
            final String isVariable = isNameExpr.isMethod(isNameExpr).isMethod();
            if (isNameExpr != null) {
                isNameExpr = isMethod(isNameExpr);
                if (isNameExpr != null) {
                    return isNameExpr;
                }
            }
        }
        isNameExpr = isMethod("isStringConstant");
        if (isNameExpr != null) {
            return isNameExpr;
        }
        isNameExpr = isMethod("isStringConstant");
        if (isNameExpr != null) {
            return isNameExpr;
        }
        return isNameExpr.isMethod(isIntegerConstant);
    }
}
